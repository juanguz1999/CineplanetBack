package com.cineplanet.back.services;

import com.cineplanet.back.models.mdl_productos;
import com.cineplanet.back.repository.itf_rpt_productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class svc_productos {

    @Autowired
    private itf_rpt_productos repository;

    public List<mdl_productos> getProductosByIdCategoria(int productos) {
        return repository.findAllProductosByIdCategoria(productos);
    }

    public boolean saveProducto(mdl_productos producto) {
        try {
            repository.save(producto);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
