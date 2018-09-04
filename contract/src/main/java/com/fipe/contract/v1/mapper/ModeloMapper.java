package com.fipe.contract.v1.mapper;

import com.fipe.contract.v1.model.request.ModeloRequest;
import com.fipe.contract.v1.model.response.ModeloResponse;
import com.fipe.model.ModeloModel;

public class ModeloMapper {

    public static ModeloResponse mapperToContract(ModeloModel modeloModel) {
        return ModeloResponse.builder()
                .codigo(modeloModel.getCodigoModelo())
                .nome(modeloModel.getNomeModelo())
                .build();
    }

    public static ModeloModel mapperToModel(ModeloRequest vmodeloRequest) {
        return ModeloModel.builder()
                .build();
    }
}

// TODO Modelo 1 - mapperToModel