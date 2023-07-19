package com.cineplanet.back.controllers;

import com.cineplanet.back.models.mdl_sala_tipos;
import com.cineplanet.back.services.svc_sala_tipos;

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
public class ctl_sala_tipos {

    @Autowired
    private svc_sala_tipos service;

    @PostMapping("/saveSalaTipo")
    @ResponseStatus(HttpStatus.CREATED)
    String saveSalaTipo(@RequestBody mdl_sala_tipos salaTipo) {
        String mensaje = "ER|Existe un error interno y no se pudo registrar el tipo de sala.";

        if (salaTipo.getNombre() != null) {
            mensaje = "ER|No se pudo registrar el tipo de sala.";
            if (service.saveSalaTipo(salaTipo)) {
                mensaje = "OK|Se registró el tipo de sala con éxito.";
            }
        }

        return mensaje;
    }

    @GetMapping("/getAllSalaTipos")
    List<mdl_sala_tipos> getAllSalaTipos() {
        return service.getAllSalaTipos();
    }
}
