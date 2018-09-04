package com.fipe.contract.v1.mapper;

import com.fipe.contract.v1.model.request.MarcaRequest;
import com.fipe.contract.v1.model.response.MarcaResponse;
import com.fipe.database.model.TipoVeiculo;
import com.fipe.model.MarcaModel;

public class MarcaMapper {

    public static MarcaResponse mapperToContract(MarcaModel marcaModel) {
        return MarcaResponse.builder()
                .codigo(marcaModel.getCodigoMarca())
                .nome(marcaModel.getNomeMarca())
                .build();
    }

    public static MarcaModel mapperToModel(MarcaRequest marcaRequest) {
        return MarcaModel.builder()
                .build();
    }
}

// TODO Marca 1 - mapperToModel