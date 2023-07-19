package com.cineplanet.back.repository;

import com.cineplanet.back.models.mdl_idiomas;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itf_rpt_idiomas extends CrudRepository<mdl_idiomas, Integer> {

}
