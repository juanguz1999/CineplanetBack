package com.cineplanet.back.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cineplanet.back.models.mdl_combo;
import com.cineplanet.back.repository.itf_rpt_combo;

@Service
public class svc_combo {
    
    @Autowired
    itf_rpt_combo repository;

    public Boolean saveCombo(mdl_combo combo) {
        try {
            repository.save(combo);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public List<mdl_combo> getCombos() {
        return repository.findAll();
    }

    public List<mdl_combo> getComboById(int id) {
        return repository.findById(id);
    }
}
