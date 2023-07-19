package com.cineplanet.back.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.cineplanet.back.models.mdl_grupo_idioma;

public interface itf_rpt_grupo_idioma extends CrudRepository <mdl_grupo_idioma, Integer> {
    
    // Traer todos los idiomas que pertenecen a una pelicula
    public List<mdl_grupo_idioma> findAllByIdPelicula(int idPelicula); 
}
