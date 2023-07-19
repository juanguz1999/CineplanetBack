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
@Table(name = "cnp_peliculas")
@AllArgsConstructor
@NoArgsConstructor
public class mdl_peliculas {

    @Id
    @Column(name = "ID")
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ID_SEDE")
    @Getter
    @Setter
    private int idSede;

    @Column(name = "ID_GRUPO_HORARIO")
    @Getter
    @Setter
    private int idGrupoHorario;

    @Column(name = "ID_CENSURA")
    @Getter
    @Setter
    private int idCensura;

    @Column(name = "ID_GENERO")
    @Getter
    @Setter
    private int idGenero;

    @Column(name = "FECHA_ESTRENO")
    @Getter
    @Setter
    private String fechaEstreno;

    @Column(name = "FECHA_FIN_ESTRENO")
    @Getter
    @Setter
    private String fechaFinEstreno;

    @Column(name = "SINOPSIS")
    @Getter
    @Setter
    private String sinopsis;

    @Column(name = "DURACION")
    @Getter
    @Setter
    private String duracion;

    @Column(name = "NOMBRE")
    @Getter
    @Setter
    private String nombre;

    @Column(name = "PRECIO")
    @Getter
    @Setter
    private String precio;

    @Column(name = "ESTADO")
    @Getter
    @Setter
    private int estado;

    @Column(name = "USUARIO_REGISTRA")
    @Getter
    @Setter
    private int usuarioRegistra;

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