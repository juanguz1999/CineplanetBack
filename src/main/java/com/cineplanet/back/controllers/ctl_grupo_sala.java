package com.cineplanet.back.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.cineplanet.back.models.mdl_grupo_sala;
import com.cineplanet.back.services.svc_grupo_sala;

@Controller
@RestController
public class ctl_grupo_sala {
    
    @Autowired
    svc_grupo_sala service;

    @PostMapping("/saveGruposSala")
    @ResponseStatus(HttpStatus.CREATED)
    String saveOperador(@RequestBody mdl_grupo_sala grupoSala) {
        String mensaje = "ER|Existe un error interno y no pudo registrarse.";

        if (
            grupoSala.getIdSala()   != 0 && 
            grupoSala.getIdSede()   != 0
            ) 
        {
            mensaje = "ER|No se pudo registrar el grupo sala.";
            if (service.saveGruposSala(grupoSala)) {
                mensaje = "OK|Se registro el grupo sala con exito.";
            }
        }

        return mensaje;
    }

    @GetMapping("/getGruposSalaByIdSede/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    List<mdl_grupo_sala> getGruposSalaByIdSede(@PathVariable int id) {
        List<mdl_grupo_sala> listGrupoSala = null;
        listGrupoSala = service.getGruposSalaByIdSede(id);

        return listGrupoSala;
    }
}
