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
@Table(name = "cnp_grupo_salas")
@AllArgsConstructor
@NoArgsConstructor
public class mdl_grupo_sala {

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

    @Column(name = "ID_SALA")
    @Getter
    @Setter
    private int idSala;

}
