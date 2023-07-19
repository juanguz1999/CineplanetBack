package com.cineplanet.back.repository;

import com.cineplanet.back.models.mdl_peliculas;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itf_rpt_peliculas extends CrudRepository<mdl_peliculas, Integer> {

}
