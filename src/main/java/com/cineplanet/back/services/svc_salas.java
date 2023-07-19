package com.cineplanet.back.services;

import com.cineplanet.back.models.mdl_salas;
import com.cineplanet.back.repository.itf_rpt_salas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class svc_salas {

    @Autowired
    private itf_rpt_salas repository;

    public boolean saveSala(mdl_salas sala) {
        try {
            repository.save(sala);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<mdl_salas> getAllSalas() {
        return (List<mdl_salas>) repository.findAll();
    }

}
