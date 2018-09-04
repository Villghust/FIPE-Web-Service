package com.fipe.contract.v1.facade;

import com.fipe.contract.v1.mapper.MarcaMapper;
import com.fipe.contract.v1.model.response.MarcaResponse;
import com.fipe.database.model.TipoVeiculo;
import com.fipe.facade.MarcaFacade;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class MarcaContractFacade {
    private MarcaFacade marcaFacade;

    public Mono<MarcaResponse> pesquisarMarcas(TipoVeiculo tipoVeiculo) {
        return marcaFacade.pesquisarMarcas(tipoVeiculo).map(MarcaMapper::mapperToContract);
    }
}
