package com.cineplanet.back.services;

import com.cineplanet.back.models.mdl_sala_asientos;
import com.cineplanet.back.repository.itf_rpt_sala_asientos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class svc_sala_asientos {

    @Autowired
    private itf_rpt_sala_asientos repository;

    public boolean saveSalaAsiento(mdl_sala_asientos salaAsiento) {
        try {
            repository.save(salaAsiento);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
