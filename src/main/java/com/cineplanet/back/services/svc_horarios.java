package com.cineplanet.back.services;

import com.cineplanet.back.models.mdl_horarios;
import com.cineplanet.back.repository.itf_rpt_horarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class svc_horarios {

    @Autowired
    private itf_rpt_horarios repository;

    public boolean saveHorario(mdl_horarios horario) {
        try {
            repository.save(horario);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<mdl_horarios> getAllHorarios() {
        return repository.findAll();
    }

    // Otros métodos según tus necesidades

}
