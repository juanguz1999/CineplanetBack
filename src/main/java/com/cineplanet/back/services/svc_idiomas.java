package com.cineplanet.back.services;

import com.cineplanet.back.models.mdl_idiomas;
import com.cineplanet.back.repository.itf_rpt_idiomas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class svc_idiomas {

    @Autowired
    private itf_rpt_idiomas repository;

    public boolean saveIdioma(mdl_idiomas idioma) {
        try {
            repository.save(idioma);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
