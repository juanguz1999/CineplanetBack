package com.cineplanet.back.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.cineplanet.back.models.mdl_comprobante_detalle_dulceria;

public interface itf_rpt_comprobante_detalle_dulceria extends CrudRepository <mdl_comprobante_detalle_dulceria, Integer> {
    
    // Traer todos los detalles de un comprobante que pertenecen a un ID de comprobante especifico
    public List<mdl_comprobante_detalle_dulceria> findById(int id);
}
