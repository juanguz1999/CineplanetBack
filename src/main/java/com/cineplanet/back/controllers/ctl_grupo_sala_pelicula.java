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
import com.cineplanet.back.models.mdl_grupo_sala_pelicula;
import com.cineplanet.back.services.svc_grupo_sala_pelicula;

@Controller
@RestController
public class ctl_grupo_sala_pelicula {
    
    @Autowired
    svc_grupo_sala_pelicula service;

    @PostMapping("/saveGrupoSalaPelicula")
    @ResponseStatus(HttpStatus.CREATED)
    String saveOperador(@RequestBody mdl_grupo_sala_pelicula grupoSalaPelicula) {
        String mensaje = "ER|Existe un error interno y no pudo registrarse.";

        if (
            grupoSalaPelicula.getIdSala()     != 0 && 
            grupoSalaPelicula.getIdPelicula() != 0
            ) 
        {
            mensaje = "ER|No se pudo registrar el grupo sala pelicula.";
            if (service.saveGrupoSalaPelicula(grupoSalaPelicula)) {
                mensaje = "OK|Se registro el grupo sala pelicula con exito.";
            }
        }

        return mensaje;
    }

    @GetMapping("/getGrupoSalaPeliculasByIdPelicula/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    List<mdl_grupo_sala_pelicula> getGrupoSalaPeliculasByIdPelicula(@PathVariable int id) {
        List<mdl_grupo_sala_pelicula> listGrupoSalaPelicula = null;
        listGrupoSalaPelicula = service.getGrupoSalaPeliculasByIdPelicula(id);

        return listGrupoSalaPelicula;
    }
}
