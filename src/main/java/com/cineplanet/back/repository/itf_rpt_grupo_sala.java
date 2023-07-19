package com.cineplanet.back.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.cineplanet.back.models.mdl_grupo_sala;

public interface itf_rpt_grupo_sala extends CrudRepository <mdl_grupo_sala, Integer> {
    
    // Traer todas las salas que pertenecen a una sede
    public List<mdl_grupo_sala> findAllByIdSede(int idSede);
}
