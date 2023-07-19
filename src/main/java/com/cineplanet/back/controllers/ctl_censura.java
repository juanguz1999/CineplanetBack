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
import com.cineplanet.back.models.mdl_censura;
import com.cineplanet.back.services.svc_censura;

@Controller
@RestController
public class ctl_censura {
    @Autowired
    svc_censura service;

    @PostMapping("/saveCensura")
    @ResponseStatus(HttpStatus.CREATED)
    String saveOperador(@RequestBody mdl_censura censura) {
        String mensaje = "ER|Existe un error interno y no pudo registrarse.";

        if (
            !censura.getNombre().equals("") && 
            !censura.getNombre().isEmpty()
            ) 
        {
            mensaje = "ER|No se pudo registrar la censura.";
            if (service.saveCensura(censura)) {
                mensaje = "OK|Se registro la censura con exito.";
            }
        }

        return mensaje;
    }

    @GetMapping("/getCensuras")
    @ResponseStatus(HttpStatus.CREATED)
    List<mdl_censura> getCensuras() {
        List<mdl_censura> listCensura = null;
        listCensura = service.getCensuras();

        return listCensura;
    }

    @GetMapping("/getCensuraById/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    List<mdl_censura> getChats(@PathVariable int id) {
        List<mdl_censura> listCensura = null;
        listCensura = service.getCensuraById(id);

        return listCensura;
    }
}
