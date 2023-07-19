package com.cineplanet.back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cineplanet.back.models.mdl_grupo_sala;
import com.cineplanet.back.repository.itf_rpt_grupo_sala;

@Service
public class svc_grupo_sala {
    
    @Autowired
    itf_rpt_grupo_sala repository;

    public Boolean saveGruposSala(mdl_grupo_sala sede) {
        try {
            repository.save(sede);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public List<mdl_grupo_sala> getGruposSalaByIdSede(int sede) {
        return repository.findAllByIdSede(sede);
    }
}
