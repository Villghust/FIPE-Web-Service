package com.fipe.model;

import lombok.*;

@EqualsAndHashCode
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeiculoModel {
    private String codigoFipe;
    private String valor;
    private String marca;
    private String modelo;
    private int anoModelo;
    private String combustivel;
    private String mesReferencia;
    private int tipoVeiculo;
    private char siglaCombustivel;

}
