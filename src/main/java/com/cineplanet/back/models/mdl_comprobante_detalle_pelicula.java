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
@Table(name= "cnp_comprobantes_detalle_peliculas")
@AllArgsConstructor
@NoArgsConstructor
public class mdl_comprobante_detalle_pelicula {
    
    @Id
    @Column(name="ID")
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="ID_COMPROBANTE")
    @Getter @Setter
    private int idComprobante;

    @Column(name="ID_TIPO_SALA")
    @Getter @Setter
    private int IdTipoSala;

    @Column(name="ID_PELICULA")
    @Getter @Setter
    private int idPelicula;
}
