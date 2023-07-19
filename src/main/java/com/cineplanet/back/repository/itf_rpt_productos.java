package com.cineplanet.back.repository;

import com.cineplanet.back.models.mdl_productos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itf_rpt_productos extends CrudRepository<mdl_productos, Integer> {
    public List<mdl_productos> findAllProductosByIdCategoria(int productos);
}
