package com.cineplanet.back.controllers;

import com.cineplanet.back.models.mdl_grupo_sala_tipos;
import com.cineplanet.back.services.svc_grupo_sala_tipos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class ctl_grupo_sala_tipos {

    @Autowired
    private svc_grupo_sala_tipos service;

    @PostMapping("/saveGrupoSalaTipos")
    @ResponseStatus(HttpStatus.CREATED)
    String saveGrupoSalaTipos(@RequestBody mdl_grupo_sala_tipos grupoSalaTipos) {
        String mensaje = "ER|Existe un error interno y no se pudo registrar.";

        if (grupoSalaTipos.getIdPelicula() != 0 && grupoSalaTipos.getIdTipoSala() != 0) {
            mensaje = "ER|No se pudo registrar el grupo sala tipos.";
            if (service.saveGrupoSalaTipos(grupoSalaTipos)) {
                mensaje = "OK|Se registró el grupo sala tipos con éxito.";
            }
        }

        return mensaje;
    }

    @GetMapping("/getGrupoSalaTipos")
    @ResponseStatus(HttpStatus.OK)
    List<mdl_grupo_sala_tipos> getGrupoSalaTipos() {
        return service.getAllGrupoSalaTipos();
    }

}
