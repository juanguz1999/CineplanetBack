package com.cineplanet.back.repository;

import com.cineplanet.back.models.mdl_sala_asientos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itf_rpt_sala_asientos extends CrudRepository<mdl_sala_asientos, Integer> {

}
