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

import com.cineplanet.back.models.mdl_sedes;
import com.cineplanet.back.services.svc_sedes;

@Controller
@RestController
public class ctl_sedes {

    @Autowired
    private svc_sedes service;

    @PostMapping("/saveSede")
    @ResponseStatus(HttpStatus.CREATED)
    String saveSede(@RequestBody mdl_sedes sede) {
        String mensaje = "ER|Existe un error interno y no se pudo registrar la sede.";

        if (sede.getId() != 0 &&
                sede.getNombre() != null &&
                sede.getDireccion() != null &&
                sede.getIdPais() != 0 &&
                sede.getIdCiudad() != 0) {
            mensaje = "ER|No se pudo registrar la sede.";
            if (service.saveSede(sede)) {
                mensaje = "OK|Se registró la sede con éxito.";
            }
        }

        return mensaje;
    }

    @GetMapping("/getTodasLasSedes")
    @ResponseStatus(HttpStatus.OK)
    List<mdl_sedes> getTodasLasSedes() {
        return service.getTodasLasSedes();
    }

    @GetMapping("/getSedesPorNombre/{nombre}")
    @ResponseStatus(HttpStatus.OK)
    List<mdl_sedes> getSedesPorNombre(@PathVariable String nombre) {
        return service.getSedesPorNombre(nombre);
    }
}
