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
import com.cineplanet.back.models.mdl_comprobante_detalle_dulceria;
import com.cineplanet.back.services.svc_comprobante_detalle_dulceria;

@Controller
@RestController
public class ctl_comprobante_detalle_dulceria {
    
    @Autowired
    svc_comprobante_detalle_dulceria service;

    @PostMapping("/saveComprobante_detalle_dulceria")
    @ResponseStatus(HttpStatus.CREATED)
    String saveOperador(@RequestBody mdl_comprobante_detalle_dulceria detalle_dulceria) {
        String mensaje = "ER|Existe un error interno y no pudo registrarse.";

        if (
            detalle_dulceria.getIdCombo()       != 0 && 
            detalle_dulceria.getIdComprobante() != 0 && 
            detalle_dulceria.getIdProducto()    != 0
            ) 
        {
            mensaje = "ER|No se pudo registrar el comprobante detalle dulceria.";
            if (service.saveComprobante_detalle_dulceria(detalle_dulceria)) {
                mensaje = "OK|Se registro el comprobante detalle dulceria con exito.";
            }
        }

        return mensaje;
    }

    @GetMapping("/getComprobante_detalle_dulceriaById/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    List<mdl_comprobante_detalle_dulceria> getComprobante_detalle_dulceriaById(@PathVariable int id) {
        List<mdl_comprobante_detalle_dulceria> listDetalleDulceria = null;
        listDetalleDulceria = service.getComprobante_detalle_dulceriaById(id);

        return listDetalleDulceria;
    }
}
