package com.cineplanet.back.repository;

import com.cineplanet.back.models.mdl_grupo_sala_tipos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itf_rpt_grupo_sala_tipos extends JpaRepository<mdl_grupo_sala_tipos, Integer> {

}