package com.cineplanet.back.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.cineplanet.back.models.mdl_combo;

public interface itf_rpt_combo extends CrudRepository <mdl_combo, Integer> {
        
    // Traer todas los Combos
    public List<mdl_combo> findAll();

    // Traer un combo especifico por su ID
    public List<mdl_combo> findById(int id);
 }