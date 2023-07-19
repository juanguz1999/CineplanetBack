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
import com.cineplanet.back.models.mdl_combo;
import com.cineplanet.back.services.svc_combo;

@Controller
@RestController
public class ctl_combo {
    
    @Autowired
    svc_combo service;

    @PostMapping("/saveCombo")
    @ResponseStatus(HttpStatus.CREATED)
    String saveOperador(@RequestBody mdl_combo combo) {
        String mensaje = "ER|Existe un error interno y no pudo registrarse.";

        if (
            !combo.getNombre().equals("") && 
            !combo.getNombre().isEmpty()
            ) 
        {
            mensaje = "ER|No se pudo registrar el combo.";
            if (service.saveCombo(combo)) {
                mensaje = "OK|Se registro el combo con exito.";
            }
        }

        return mensaje;
    }

    @GetMapping("/getCombos")
    @ResponseStatus(HttpStatus.CREATED)
    List<mdl_combo> getCombos() {
        List<mdl_combo> listCombo = null;
        listCombo = service.getCombos();

        return listCombo;
    }

    @GetMapping("/getComboById/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    List<mdl_combo> getComboById(@PathVariable int id) {
        List<mdl_combo> listCombo = null;
        listCombo = service.getComboById(id);

        return listCombo;
    }
}
