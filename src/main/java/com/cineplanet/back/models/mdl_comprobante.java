package com.cineplanet.back.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "cnp_comprobantes")
@AllArgsConstructor
@NoArgsConstructor
public class mdl_comprobante {
    
    @Id
    @Column(name="ID")
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="ID_CLIENTE")
    @Getter @Setter
    private int idCliente;

    @Column(name="PRECIO_TORAL")
    @Getter @Setter
    private double precioTotal;

    @Column(name="FECHA")
    @Getter @Setter
    private String fecha;
}
