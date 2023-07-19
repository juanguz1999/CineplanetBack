package com.cineplanet.back.controllers;

import com.cineplanet.back.models.mdl_peliculas;
import com.cineplanet.back.services.svc_peliculas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ctl_peliculas {

    @Autowired
    private svc_peliculas service;

    @PostMapping("/savePelicula")
    @ResponseStatus(HttpStatus.CREATED)
    String savePelicula(@RequestBody mdl_peliculas pelicula) {
        String mensaje = "ER|Existe un error interno y no se pudo registrar la película.";

        if (pelicula.getIdSede() != 0 &&
                pelicula.getIdGrupoHorario() != 0 &&
                pelicula.getIdCensura() != 0 &&
                pelicula.getIdGenero() != 0 &&
                pelicula.getFechaEstreno() != null &&
                pelicula.getFechaFinEstreno() != null &&
                pelicula.getSinopsis() != null &&
                pelicula.getDuracion() != null &&
                pelicula.getNombre() != null &&
                pelicula.getPrecio() != null &&
                pelicula.getEstado() != 0 &&
                pelicula.getUsuarioRegistra() != 0 &&
                pelicula.getFechaRegistra() != null &&
                pelicula.getIpRegistra() != null) {
            mensaje = "ER|No se pudo registrar la película.";
            if (service.savePelicula(pelicula)) {
                mensaje = "OK|Se registró la película con éxito.";
            }
        }

        return mensaje;
    }

    // Puedes agregar más métodos según tus necesidades
}
