package com.fipe.contract.v1.mapper;

import com.fipe.contract.v1.model.request.VeiculoRequest;
import com.fipe.contract.v1.model.response.VeiculoResponse;
import com.fipe.model.VeiculoModel;

public class VeiculoMapper {

    public static VeiculoResponse mapperToContract(VeiculoModel veiculoModel) {
        return VeiculoResponse.builder()
                .siglaCombustivel(veiculoModel.getSiglaCombustivel())
                .tipoVeiculo(veiculoModel.getTipoVeiculo())
                .mesReferencia(veiculoModel.getMesReferencia())
                .codigoFipe(veiculoModel.getCodigoFipe())
                .combustivel(veiculoModel.getCombustivel())
                .anoModelo(veiculoModel.getAnoModelo())
                .modelo(veiculoModel.getModelo())
                .marca(veiculoModel.getMarca())
                .valor(veiculoModel.getValor())
                .build();
    }

    public static VeiculoModel mapperToModel(VeiculoRequest veiculoRequest) {
        return VeiculoModel.builder()
                .build();
    }
}

// TODO 7