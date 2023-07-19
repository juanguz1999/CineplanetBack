package com.cineplanet.back.controllers;

import com.cineplanet.back.models.mdl_horarios;
import com.cineplanet.back.services.svc_horarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class ctl_horarios {

    @Autowired
    private svc_horarios service;

    @PostMapping("/saveHorario")
    @ResponseStatus(HttpStatus.CREATED)
    public String saveHorario(@RequestBody mdl_horarios horario) {
        String mensaje = "ER|Existe un error interno y no se pudo registrar el horario.";

        if (service.saveHorario(horario)) {
            mensaje = "OK|Se registró el horario con éxito.";
        }

        return mensaje;
    }

    @GetMapping("/getAllHorarios")
    public List<mdl_horarios> getAllHorarios() {
        return service.getAllHorarios();
    }

    // Otros métodos según tus necesidades

}
