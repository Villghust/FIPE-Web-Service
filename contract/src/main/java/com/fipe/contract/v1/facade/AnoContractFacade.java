package com.fipe.contract.v1.facade;

import com.fipe.contract.v1.mapper.AnoMapper;
import com.fipe.contract.v1.model.response.AnoResponse;
import com.fipe.database.model.TipoVeiculo;
import com.fipe.facade.AnoFacade;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class AnoContractFacade {
    private AnoFacade anoFacade;

    public Mono<AnoResponse> pesquisarAnos(TipoVeiculo tipoVeiculo, String codMarca, String codModelo) {
        return anoFacade.pesquisarAnos(tipoVeiculo, codMarca, codModelo).map(AnoMapper::mapperToContract);
    }
}
