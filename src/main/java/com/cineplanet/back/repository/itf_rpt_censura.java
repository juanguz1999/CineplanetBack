package com.cineplanet.back.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.cineplanet.back.models.mdl_censura;

public interface itf_rpt_censura extends CrudRepository <mdl_censura, Integer> {
    
    // Traer todas las censuras
    public List<mdl_censura> findAll();
    
    // Traer una censura especifica por su ID
    public List<mdl_censura> findById(int id);
}
