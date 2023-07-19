package com.cineplanet.back.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cineplanet.back.models.mdl_genero;
import com.cineplanet.back.repository.itf_rpt_genero;

@Service
public class svc_genero {
    
    @Autowired
    itf_rpt_genero repository;

    public Boolean saveGenero(mdl_genero genero) {
        try {
            repository.save(genero);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public List<mdl_genero> getGeneros() {
        return repository.findAll();
    }

    public List<mdl_genero> getGeneroById(int id) {
        return repository.findById(id);
    }
}
