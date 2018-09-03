package com.fipe.model;

import com.fipe.database.model.TipoVeiculo;
import lombok.*;

@EqualsAndHashCode
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeiculoModel {
    private String valor;
    private String marca;
    private String modelo;
    private int anoModelo;
    private String combustivel;
    private String codigoFipe;
    private String mesReferencia;
    private TipoVeiculo tipoVeiculo;
    private char siglaCombustivel;
}