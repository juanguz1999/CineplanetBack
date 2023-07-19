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
@Table(name = "cnp_sala_asientos")
@AllArgsConstructor
@NoArgsConstructor
public class mdl_sala_asientos {

    @Id
    @Column(name = "ID")
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ID_SALA")
    @Getter
    @Setter
    private int idSala;

    @Column(name = "ID_PELICULA")
    @Getter
    @Setter
    private String idPelicula;

    @Column(name = "FILA")
    @Getter
    @Setter
    private char fila;

    @Column(name = "NUMERO_ASIENTO")
    @Getter
    @Setter
    private int numeroAsiento;

    @Column(name = "ESTADO")
    @Getter
    @Setter
    private int estado;

    @Column(name = "USUARIO_REGISTRA")
    @Getter
    @Setter
    private String usuarioRegistra;

    @Column(name = "USUARIO_MODIFICA")
    @Getter
    @Setter
    private String usuariomodifica;

    @Column(name = "USUARIO_ELIMINA")
    @Getter
    @Setter
    private Integer usuarioElimina;

    @Column(name = "FECHA_REGISTRA")
    @Getter
    @Setter
    private String fechaRegistra;

    @Column(name = "FECHA_MODIFICA")
    @Getter
    @Setter
    private String fechaModifica;

    @Column(name = "FECHA_ELIMINA")
    @Getter
    @Setter
    private String fechaElimina;

    @Column(name = "IP_REGISTRA")
    @Getter
    @Setter
    private String ipRegistra;

    @Column(name = "IP_MODIFICA")
    @Getter
    @Setter
    private String ipmodifica;

    @Column(name = "IP_ELIMINA")
    @Getter
    @Setter
    private String ipelimina;
}
