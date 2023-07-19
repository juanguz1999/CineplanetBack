package com.cineplanet.back.services;

import com.cineplanet.back.models.mdl_sala_tipos;
import com.cineplanet.back.repository.itf_rpt_sala_tipos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class svc_sala_tipos {

    @Autowired
    private itf_rpt_sala_tipos repository;

    public boolean saveSalaTipo(mdl_sala_tipos salaTipo) {
        try {
            repository.save(salaTipo);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<mdl_sala_tipos> getAllSalaTipos() {
        return (List<mdl_sala_tipos>) repository.findAll();
    }

}
