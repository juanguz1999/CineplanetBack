package com.cineplanet.back.controllers;

import com.cineplanet.back.models.mdl_productos;
import com.cineplanet.back.services.svc_productos;

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

@Controller
@RestController
public class ctl_productos {

    @Autowired
    private svc_productos service;
    @GetMapping("/getProductosByIdCategoria/{idCategoria}")
    @ResponseStatus(HttpStatus.CREATED)
    List<mdl_productos> getProductosByIdCategoria(@PathVariable int idCategoria) {
        List<mdl_productos> listProductos = null;
        listProductos = service.getProductosByIdCategoria(idCategoria);

        return listProductos;
    }

    @PostMapping("/saveProducto")
    @ResponseStatus(HttpStatus.CREATED)
    String saveProducto(@RequestBody mdl_productos producto) {
        String mensaje = "ER|Existe un error interno y no se pudo registrar el producto.";

        if (producto.getIdSede() != 0 &&
                producto.getIdCategoria() != 0 && /* Pierr 04-07-2023 **Cambio de String a int */
                producto.getNombre() != null &&
                producto.getImg() != null &&
                producto.getStock() != 0 &&
                producto.getPrecio() != null &&
                producto.getEstado() != 0 &&
                producto.getUsuarioRegistra() != 0 &&
                producto.getFechaRegistra() != null &&
                producto.getIpRegistra() != null) {
            mensaje = "ER|No se pudo registrar el producto.";
            if (service.saveProducto(producto)) {
                mensaje = "OK|Se registró el producto con éxito.";
            }
        }

        return mensaje;
    }

}
