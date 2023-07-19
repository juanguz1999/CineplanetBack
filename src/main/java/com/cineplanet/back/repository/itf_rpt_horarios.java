package com.cineplanet.back.repository;

import com.cineplanet.back.models.mdl_horarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itf_rpt_horarios extends JpaRepository<mdl_horarios, Integer> {

}
