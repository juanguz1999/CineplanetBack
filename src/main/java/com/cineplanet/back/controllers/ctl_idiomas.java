package com.cineplanet.back.controllers;

import com.cineplanet.back.models.mdl_idiomas;
import com.cineplanet.back.services.svc_idiomas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ctl_idiomas {

    @Autowired
    private svc_idiomas service;

    @PostMapping("/saveIdioma")
    @ResponseStatus(HttpStatus.CREATED)
    String saveIdioma(@RequestBody mdl_idiomas idioma) {
        String mensaje = "ER|Existe un error interno y no se pudo registrar el idioma.";

        if (idioma.getNombre() != null) {
            mensaje = "ER|No se pudo registrar el idioma.";
            if (service.saveIdioma(idioma)) {
                mensaje = "OK|Se registró el idioma con éxito.";
            }
        }

        return mensaje;
    }

    // Puedes agregar más métodos según tus necesidades
}
