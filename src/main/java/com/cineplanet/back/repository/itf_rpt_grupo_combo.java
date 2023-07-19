package com.cineplanet.back.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.cineplanet.back.models.mdl_grupo_combo;

public interface itf_rpt_grupo_combo extends CrudRepository <mdl_grupo_combo, Integer> {
    
    // Traer todos los productos que pertenecen a un combo
    public List<mdl_grupo_combo> findAllByIdCombo(int idCombo);
}
