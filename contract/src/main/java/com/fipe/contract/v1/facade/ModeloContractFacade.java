package com.fipe.contract.v1.facade;

import com.fipe.contract.v1.mapper.ModeloMapper;
import com.fipe.contract.v1.model.response.ModeloResponse;
import com.fipe.database.model.TipoVeiculo;
import com.fipe.facade.ModeloFacade;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ModeloContractFacade {
    private ModeloFacade modeloFacade;

    public Mono<ModeloResponse> pesquisarModelos(TipoVeiculo tipoVeiculo, String codMarca) {
        return modeloFacade.pesquisarModelos(tipoVeiculo, codMarca).map(ModeloMapper::mapperToContract);
    }
}
