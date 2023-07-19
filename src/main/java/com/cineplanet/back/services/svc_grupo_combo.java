package com.cineplanet.back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cineplanet.back.models.mdl_grupo_combo;
import com.cineplanet.back.repository.itf_rpt_grupo_combo;

@Service
public class svc_grupo_combo {
    
    @Autowired
    itf_rpt_grupo_combo repository;

    public Boolean saveGrupoCombo(mdl_grupo_combo grupoCombo) {
        try {
            repository.save(grupoCombo);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public List<mdl_grupo_combo> getGrupoCombosByIdCombo(int idCombo) {
        return repository.findAllByIdCombo(idCombo);
    }
}
