package com.cineplanet.back.repository;

import com.cineplanet.back.models.mdl_sala_tipos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itf_rpt_sala_tipos extends CrudRepository<mdl_sala_tipos, Integer> {

}
