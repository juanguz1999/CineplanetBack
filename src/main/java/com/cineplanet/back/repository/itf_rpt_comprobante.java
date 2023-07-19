package com.cineplanet.back.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.cineplanet.back.models.mdl_comprobante;

public interface itf_rpt_comprobante extends CrudRepository <mdl_comprobante, Integer> {
    
    // Traer un comrobante especifico por su ID
    public List<mdl_comprobante> findById(int id);

    // Traer todos los comprobantes que pertenecen a un cliente
    public List<mdl_comprobante> findAllByIdCliente(int idCliente);
}
