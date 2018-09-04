package com.fipe.contract.v1.facade;

import com.fipe.contract.v1.mapper.VeiculoMapper;
import com.fipe.contract.v1.model.response.VeiculoResponse;
import com.fipe.database.model.TipoVeiculo;
import com.fipe.facade.VeiculoFacade;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class VeiculoContractFacade {
    private VeiculoFacade veiculoFacade;

//    public Mono<VeiculoResponse> pesquisarVeiculo(TipoVeiculo tipoVeiculo, String codMarca, String codModelo, int ano) {
//        return veiculoFacade.pesquisarVeiculo(tipoVeiculo, codMarca, codModelo, ano).map(VeiculoMapper::mapperToContract);
//    }
}
