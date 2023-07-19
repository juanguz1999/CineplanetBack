package com.cineplanet.back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cineplanet.back.models.mdl_usuarios;

import jakarta.servlet.http.HttpSession;

@RestController
public class ctl_usuario {

    @Autowired
    private HttpSession httpSession;

    @PostMapping("/guardarUsuario")
    public String guardarUsuarioEnSesion(@RequestBody mdl_usuarios usuario) {
        httpSession.setAttribute("usuario", usuario);
        return "Usuario guardado en la sesión.";
    }

    @RequestMapping("/obtenerUsuario")
    public String obtenerUsuarioDeSesion() {
        mdl_usuarios usuario = (mdl_usuarios) httpSession.getAttribute("usuario");
        if (usuario != null) {
            String correo = usuario.getCorreo();
            String nombre = usuario.getNombre();
            String telefono = usuario.getUrlPicture();
            return "Datos del usuario en sesión - Correo: " + correo + ", Nombre: " + nombre + ", Teléfono: "
                    + telefono;
        } else {
            return "No se encontró el usuario en la sesión.";
        }
    }
}