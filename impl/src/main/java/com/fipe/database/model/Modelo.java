package com.fipe.database.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "modelos")
public class Modelo {
    @Id
    @Column
    private TipoVeiculo tipoVeiculo;

    @Column
    private String nomeModelo;

    @Column
    private int codigoModelo;
}
