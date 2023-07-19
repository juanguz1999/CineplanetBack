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
import com.cineplanet.back.models.mdl_grupo_idioma;
import com.cineplanet.back.services.svc_grupo_idioma;

@Controller
@RestController
public class ctl_grupo_idioma {
    
    @Autowired
    svc_grupo_idioma service;

    @PostMapping("/saveGrupoIdioma")
    @ResponseStatus(HttpStatus.CREATED)
    String saveOperador(@RequestBody mdl_grupo_idioma grupoIdioma) {
        String mensaje = "ER|Existe un error interno y no pudo registrarse.";

        if (
            grupoIdioma.getIdIdioma()   != 0 && 
            grupoIdioma.getIdPelicula() != 0
            ) 
        {
            mensaje = "ER|No se pudo registrar el grupo idioma.";
            if (service.saveGrupoIdioma(grupoIdioma)) {
                mensaje = "OK|Se registro el grupo idioma con exito.";
            }
        }

        return mensaje;
    }

    @GetMapping("/getGrupoIdiomasByIdPelicula/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    List<mdl_grupo_idioma> getGrupoIdiomasByIdPelicula(@PathVariable int id) {
        List<mdl_grupo_idioma> listGrupoIdioma = null;
        listGrupoIdioma = service.getGrupoIdiomasByIdPelicula(id);

        return listGrupoIdioma;
    }
}
