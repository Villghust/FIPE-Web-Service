package com.fipe.mapper;

import com.fipe.database.model.Marca;
import com.fipe.model.MarcaModel;

public class MarcaModelMapper {
    public static MarcaModel marcaToMarcaModel(Marca marca) {
        return MarcaModel.builder()
                .codigoMarca(marca.getCodigoMarca())
                .nomeMarca(marca.getNomeMarca())
                .tipoVeiculo(marca.getTipoVeiculo())
                .build();
    }

    public static Marca marcaModelToMarca(MarcaModel marcaModel) {
        return Marca.builder()
                .codigoMarca(marcaModel.getCodigoMarca())
                .nomeMarca(marcaModel.getNomeMarca())
                .tipoVeiculo(marcaModel.getTipoVeiculo())
                .build();
    }


}
