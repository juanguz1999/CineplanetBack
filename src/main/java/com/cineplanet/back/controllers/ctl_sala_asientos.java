package com.cineplanet.back.controllers;

import com.cineplanet.back.models.mdl_sala_asientos;
import com.cineplanet.back.services.svc_sala_asientos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ctl_sala_asientos {

    @Autowired
    private svc_sala_asientos service;

    @PostMapping("/saveSalaAsiento")
    @ResponseStatus(HttpStatus.CREATED)
    String saveSalaAsiento(@RequestBody mdl_sala_asientos salaAsiento) {
        String mensaje = "ER|Existe un error interno y no se pudo registrar el asiento de sala.";

        if (salaAsiento.getIdSala() != 0 &&
                salaAsiento.getIdPelicula() != null &&
                salaAsiento.getFila() != '\0' &&
                salaAsiento.getNumeroAsiento() != 0 &&
                salaAsiento.getEstado() != 0 &&
                salaAsiento.getUsuarioRegistra() != null &&
                salaAsiento.getFechaRegistra() != null &&
                salaAsiento.getIpRegistra() != null) {
            mensaje = "ER|No se pudo registrar el asiento de sala.";
            if (service.saveSalaAsiento(salaAsiento)) {
                mensaje = "OK|Se registró el asiento de sala con éxito.";
            }
        }

        return mensaje;
    }

}
