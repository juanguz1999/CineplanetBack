package com.cineplanet.back.services;

import com.cineplanet.back.models.mdl_peliculas;
import com.cineplanet.back.repository.itf_rpt_peliculas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class svc_peliculas {

    @Autowired
    private itf_rpt_peliculas repository;

    public boolean savePelicula(mdl_peliculas pelicula) {
        try {
            repository.save(pelicula);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
