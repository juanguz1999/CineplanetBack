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
import com.cineplanet.back.models.mdl_grupo_combo;
import com.cineplanet.back.services.svc_grupo_combo;

@Controller
@RestController
public class ctl_grupo_combo {
    
    @Autowired
    svc_grupo_combo service;

    @PostMapping("/saveGrupoCombo")
    @ResponseStatus(HttpStatus.CREATED)
    String saveOperador(@RequestBody mdl_grupo_combo grupoCombo) {
        String mensaje = "ER|Existe un error interno y no pudo registrarse.";

        if (
            grupoCombo.getIdCombo()     != 0 && 
            grupoCombo.getIdProducto()  != 0
            ) 
        {
            mensaje = "ER|No se pudo registrar el grupo combo.";
            if (service.saveGrupoCombo(grupoCombo)) {
                mensaje = "OK|Se registro el grupo combo con exito.";
            }
        }

        return mensaje;
    }

    @GetMapping("/getGrupoCombosByIdCombo/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    List<mdl_grupo_combo> getGrupoCombosByIdCombo(@PathVariable int id) {
        List<mdl_grupo_combo> listGrupoCombo = null;
        listGrupoCombo = service.getGrupoCombosByIdCombo(id);

        return listGrupoCombo;
    }
}
