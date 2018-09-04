package com.fipe.database.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "veiculos")
public class Veiculo {
    @Column
    private String valor;

    @Column
    private String marca;

    @Column
    private String modelo;

    @Column
    private int anoModelo;

    @Column
    private String combustivel;

    @Id
    @Column
    private String codigoFipe;

    @Column
    private String mesReferencia;

    @Column
    private TipoVeiculo tipoVeiculo;

    @Column
    private char siglaCombustivel;
}