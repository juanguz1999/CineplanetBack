package com.cineplanet.back.repository;

import com.cineplanet.back.models.mdl_salas;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itf_rpt_salas extends CrudRepository<mdl_salas, Integer> {
    public List<mdl_salas> findAllByIdTipoSala(int idTipoSala);
}
