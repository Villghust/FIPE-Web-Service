package com.fipe.mapper;

import com.fipe.database.model.Veiculo;
import com.fipe.model.VeiculoModel;

public class VeiculoModelMapper {
    public static VeiculoModel veiculoToVeiculoModel(Veiculo veiculo) {
        return VeiculoModel.builder()
                .siglaCombustivel(veiculo.getSiglaCombustivel())
                .tipoVeiculo(veiculo.getTipoVeiculo())
                .mesReferencia(veiculo.getMesReferencia())
                .codigoFipe(veiculo.getCodigoFipe())
                .combustivel(veiculo.getCombustivel())
                .anoModelo(veiculo.getAnoModelo())
                .modelo(veiculo.getModelo())
                .marca(veiculo.getMarca())
                .valor(veiculo.getValor())
                .build();
    }
}
