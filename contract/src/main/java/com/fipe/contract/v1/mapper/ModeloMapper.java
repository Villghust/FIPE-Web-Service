package com.fipe.contract.v1.mapper;

import com.fipe.contract.v1.model.request.ModeloRequest;
import com.fipe.contract.v1.model.response.ModeloResponse;
import com.fipe.model.ModeloModel;

public class ModeloMapper {

    public static ModeloResponse mapperToContract(ModeloModel modeloModel) {
        return ModeloResponse.builder()
                .build();
    }

    public static ModeloModel mapperToModel(ModeloRequest vmodeloRequest) {
        return ModeloModel.builder()
                .build();
    }
}
