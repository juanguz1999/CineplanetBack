package com.cineplanet.back.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cineplanet.back.models.mdl_comprobante_detalle_dulceria;
import com.cineplanet.back.repository.itf_rpt_comprobante_detalle_dulceria;

@Service
public class svc_comprobante_detalle_dulceria {
    
    @Autowired
    itf_rpt_comprobante_detalle_dulceria repository;

    public Boolean saveComprobante_detalle_dulceria(mdl_comprobante_detalle_dulceria detalle_dulceria) {
        try {
            repository.save(detalle_dulceria);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public List<mdl_comprobante_detalle_dulceria> getComprobante_detalle_dulceriaById(int id) {
        return repository.findById(id);
    }
}
