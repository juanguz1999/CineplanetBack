package com.cineplanet.back.models;

import java.sql.Time;

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
@Table(name = "cnp_horarios")
@AllArgsConstructor
@NoArgsConstructor
public class mdl_horarios {

    @Id
    @Column(name = "ID")
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "HORARIO1")
    @Getter
    @Setter
    private Time horario1;

    @Column(name = "HORARIO2")
    @Getter
    @Setter
    private Time horario2;

    @Column(name = "HORARIO3")
    @Getter
    @Setter
    private Time horario3;

    @Column(name = "HORARIO4")
    @Getter
    @Setter
    private Time horario4;

    @Column(name = "HORARIO5")
    @Getter
    @Setter
    private Time horario5;

    @Column(name = "HORARIO6")
    @Getter
    @Setter
    private Time horario6;

    @Column(name = "USUARIO_REGISTRA")
    @Getter
    @Setter
    private int usuarioRegistra;

    @Column(name = "USUARIO_MODIFICA")
    @Getter
    @Setter
    private int usuarioModifica;

    @Column(name = "USUARIO_ELIMINA")
    @Getter
    @Setter
    private int usuarioElimina;

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
    private String ipModifica;

    @Column(name = "IP_ELIMINA")
    @Getter
    @Setter
    private String ipElimina;

}