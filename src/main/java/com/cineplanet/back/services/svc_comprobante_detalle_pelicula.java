package com.cineplanet.back.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cineplanet.back.models.mdl_comprobante_detalle_pelicula;
import com.cineplanet.back.repository.itf_rpt_comprobante_detalle_pelicula;

@Service
public class svc_comprobante_detalle_pelicula {
    
    @Autowired
    itf_rpt_comprobante_detalle_pelicula repository;

    public Boolean saveComprobante_detalle_pelicula(mdl_comprobante_detalle_pelicula detalle_pelicula) {
        try {
            repository.save(detalle_pelicula);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public List<mdl_comprobante_detalle_pelicula> getComprobante_detalle_peliculaById(int id) {
        return repository.findById(id);
    }
}
