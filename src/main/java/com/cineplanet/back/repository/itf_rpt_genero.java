package com.cineplanet.back.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.cineplanet.back.models.mdl_genero;

public interface itf_rpt_genero extends CrudRepository <mdl_genero, Integer> {
    
    // Traer todos los generos
    public List<mdl_genero> findAll();

    // Traer un genero especifico por su ID
    public List<mdl_genero> findById(int id);
}
