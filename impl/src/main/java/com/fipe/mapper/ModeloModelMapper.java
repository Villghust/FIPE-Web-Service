package com.fipe.mapper;

import com.fipe.database.model.Modelo;
import com.fipe.model.ModeloModel;

public class ModeloModelMapper {
    public static ModeloModel modeloToModeloModel(Modelo modelo) {
        return ModeloModel.builder()
                .codigoModelo(modelo.getCodigoModelo())
                .nomeModelo(modelo.getNomeModelo())
                .tipoVeiculo(modelo.getTipoVeiculo())
                .build();
    }

}
