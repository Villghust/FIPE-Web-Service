package com.fipe.contract.v1.model.response;

import com.fipe.database.model.TipoVeiculo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VeiculoResponse {
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