package com.cineplanet.back.controllers;

import com.cineplanet.back.models.mdl_salas;
import com.cineplanet.back.services.svc_salas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class ctl_salas {

    @Autowired
    private svc_salas service;

    @PostMapping("/saveSala")
    @ResponseStatus(HttpStatus.CREATED)
    String saveSala(@RequestBody mdl_salas sala) {
        String mensaje = "ER|Existe un error interno y no se pudo registrar la sala.";

        if (sala.getNumeroSala() != 0 &&
                sala.getIdTipoSala() != 0 &&
                sala.getCapacidad() != 0) {
            mensaje = "ER|No se pudo registrar la sala.";
            if (service.saveSala(sala)) {
                mensaje = "OK|Se registró la sala con éxito.";
            }
        }

        return mensaje;
    }

    @GetMapping("/getAllSalas")
    List<mdl_salas> getAllSalas() {
        return service.getAllSalas();
    }
}
