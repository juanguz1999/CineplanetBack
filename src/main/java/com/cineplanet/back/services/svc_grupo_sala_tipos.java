package com.cineplanet.back.services;

import com.cineplanet.back.models.mdl_grupo_sala_tipos;
import com.cineplanet.back.repository.itf_rpt_grupo_sala_tipos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class svc_grupo_sala_tipos {

    @Autowired
    private itf_rpt_grupo_sala_tipos repository;

    public boolean saveGrupoSalaTipos(mdl_grupo_sala_tipos grupoSalaTipos) {
        try {
            repository.save(grupoSalaTipos);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<mdl_grupo_sala_tipos> getAllGrupoSalaTipos() {
        return repository.findAll();
    }

    // Otros métodos según tus necesidades

}
