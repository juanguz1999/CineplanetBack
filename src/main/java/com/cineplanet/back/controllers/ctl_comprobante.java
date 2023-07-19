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
import com.cineplanet.back.models.mdl_comprobante;
import com.cineplanet.back.services.svc_comprobante;

@Controller
@RestController
public class ctl_comprobante {
    
    @Autowired
    svc_comprobante service;

    @PostMapping("/saveComprobante")
    @ResponseStatus(HttpStatus.CREATED)
    String saveOperador(@RequestBody mdl_comprobante comprobante) {
        String mensaje = "ER|Existe un error interno y no pudo registrarse.";

        if (
            comprobante.getIdCliente()     != 0 && 
            comprobante.getPrecioTotal()   != 0
            ) 
        {
            mensaje = "ER|No se pudo registrar el comprobante.";
            if (service.saveComprobante(comprobante)) {
                mensaje = "OK|Se registro el comprobante con exito.";
            }
        }

        return mensaje;
    }

    @GetMapping("/getComprobanteById/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    List<mdl_comprobante> getComprobanteById(@PathVariable int id) {
        List<mdl_comprobante> listComprobante = null;
        listComprobante = service.getComprobanteById(id);

        return listComprobante;
    }

    @GetMapping("/getComprobantesByIdCliente/{idCliente}")
    @ResponseStatus(HttpStatus.CREATED)
    List<mdl_comprobante> getComprobantesByIdCliente(@PathVariable int idCliente) {
        List<mdl_comprobante> listComprobante = null;
        listComprobante = service.getComprobantesByIdCliente(idCliente);

        return listComprobante;
    }
}
