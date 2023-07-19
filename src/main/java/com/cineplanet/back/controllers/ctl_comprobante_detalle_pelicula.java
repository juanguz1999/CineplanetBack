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
import com.cineplanet.back.models.mdl_comprobante_detalle_pelicula;
import com.cineplanet.back.services.svc_comprobante_detalle_pelicula;

@Controller
@RestController
public class ctl_comprobante_detalle_pelicula {
    
    @Autowired
    svc_comprobante_detalle_pelicula service;

    @PostMapping("/saveComprobante_detalle_pelicula")
    @ResponseStatus(HttpStatus.CREATED)
    String saveOperador(@RequestBody mdl_comprobante_detalle_pelicula detalle_pelicula) {
        String mensaje = "ER|Existe un error interno y no pudo registrarse.";

        if (
            detalle_pelicula.getIdComprobante() != 0 && 
            detalle_pelicula.getIdPelicula()    != 0 && 
            detalle_pelicula.getIdTipoSala()    != 0
            ) 
        {
            mensaje = "ER|No se pudo registrar el comprobante detalle pelicula.";
            if (service.saveComprobante_detalle_pelicula(detalle_pelicula)) {
                mensaje = "OK|Se registro el comprobante detalle pelicula con exito.";
            }
        }

        return mensaje;
    }

    @GetMapping("/getComprobante_detalle_peliculaById/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    List<mdl_comprobante_detalle_pelicula> getComprobante_detalle_peliculaById(@PathVariable int id) {
        List<mdl_comprobante_detalle_pelicula> listDetallePelicula = null;
        listDetallePelicula = service.getComprobante_detalle_peliculaById(id);

        return listDetallePelicula;
    }
}
