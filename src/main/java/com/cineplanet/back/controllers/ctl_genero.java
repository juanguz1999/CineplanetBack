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
import com.cineplanet.back.models.mdl_genero;
import com.cineplanet.back.services.svc_genero;

@Controller
@RestController
public class ctl_genero {
    
    @Autowired
    svc_genero service;

    @PostMapping("/saveGenero")
    @ResponseStatus(HttpStatus.CREATED)
    String saveOperador(@RequestBody mdl_genero genero) {
        String mensaje = "ER|Existe un error interno y no pudo registrarse.";

        if (
            !genero.getNombre().equals("") && 
            !genero.getNombre().isEmpty()
            ) 
        {
            mensaje = "ER|No se pudo registrar el genero.";
            if (service.saveGenero(genero)) {
                mensaje = "OK|Se registro el genero con exito.";
            }
        }

        return mensaje;
    }

    @GetMapping("/getGeneros")
    @ResponseStatus(HttpStatus.CREATED)
    List<mdl_genero> getGeneros() {
        List<mdl_genero> listGeneros = null;
        listGeneros = service.getGeneros();

        return listGeneros;
    }

    @GetMapping("/getGeneroById/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    List<mdl_genero> getGeneroById(@PathVariable int id) {
        List<mdl_genero> listGenero = null;
        listGenero = service.getGeneroById(id);

        return listGenero;
    }
}
