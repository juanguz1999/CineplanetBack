package com.cineplanet.back.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cineplanet.back.models.mdl_grupo_sala_pelicula;
import com.cineplanet.back.repository.itf_rpt_grupo_sala_pelicula;

@Service
public class svc_grupo_sala_pelicula {
    
    @Autowired
    itf_rpt_grupo_sala_pelicula repository;

    public Boolean saveGrupoSalaPelicula(mdl_grupo_sala_pelicula grupo_sala_pelicula) {
        try {
            repository.save(grupo_sala_pelicula);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

     public List<mdl_grupo_sala_pelicula> getGrupoSalaPeliculasByIdPelicula(int idPelicula) {
        return repository.findAllByIdPelicula(idPelicula);
    }
}
