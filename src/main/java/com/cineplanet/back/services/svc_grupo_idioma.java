package com.cineplanet.back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cineplanet.back.models.mdl_grupo_idioma;
import com.cineplanet.back.repository.itf_rpt_grupo_idioma;

@Service
public class svc_grupo_idioma {
    
    @Autowired
    itf_rpt_grupo_idioma repository;

    public Boolean saveGrupoIdioma(mdl_grupo_idioma idioma) {
        try {
            repository.save(idioma);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public List<mdl_grupo_idioma> getGrupoIdiomasByIdPelicula(int idPelicula) {
        return repository.findAllByIdPelicula(idPelicula);
    }
}
