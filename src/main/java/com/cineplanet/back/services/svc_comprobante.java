package com.cineplanet.back.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cineplanet.back.models.mdl_comprobante;
import com.cineplanet.back.repository.itf_rpt_comprobante;

@Service
public class svc_comprobante {
    
    @Autowired
    itf_rpt_comprobante repository;

    public Boolean saveComprobante(mdl_comprobante comprobante) {
        try {
            repository.save(comprobante);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public List<mdl_comprobante> getComprobanteById(int id) {
        return repository.findById(id);
    }

    public List<mdl_comprobante> getComprobantesByIdCliente(int idCliente) {
        return repository.findAllByIdCliente(idCliente);
    }
}
