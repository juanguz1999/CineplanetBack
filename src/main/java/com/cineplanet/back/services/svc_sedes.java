package com.cineplanet.back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cineplanet.back.models.mdl_sedes;
import com.cineplanet.back.repository.itf_rpt_sedes;

@Service
public class svc_sedes {

    @Autowired
    private itf_rpt_sedes repository;

    public Boolean saveSede(mdl_sedes sede) {
        try {
            repository.save(sede);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public List<mdl_sedes> getTodasLasSedes() {
        return (List<mdl_sedes>) repository.findAll();
    }

    public List<mdl_sedes> getSedesPorNombre(String nombre) {
        return repository.findAllByNombre(nombre);
    }
}
