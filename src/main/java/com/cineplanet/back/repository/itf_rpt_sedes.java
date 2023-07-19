package com.cineplanet.back.repository;

import com.cineplanet.back.models.mdl_sedes;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itf_rpt_sedes extends CrudRepository<mdl_sedes, Integer> {

    public List<mdl_sedes> findAllByNombre(String nombre);
}