package com.cineplanet.back.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.cineplanet.back.models.mdl_grupo_sala_pelicula;

public interface itf_rpt_grupo_sala_pelicula extends CrudRepository <mdl_grupo_sala_pelicula, Integer> {
    
    // Traer todas las salas que pertenecen a una pelicula
    public List<mdl_grupo_sala_pelicula> findAllByIdPelicula(int idPelicula);
}
