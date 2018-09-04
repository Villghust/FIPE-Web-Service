package com.fipe.facade;

import com.fipe.database.model.TipoVeiculo;
import com.fipe.model.AnoModel;
import com.fipe.service.ano.AnoService;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class AnoFacade {
    private AnoService anoService;

    public Mono<AnoModel> pesquisarAnos(TipoVeiculo tipoVeiculo, String codMarca, String codModelo) {
        return anoService.pesquisarAnos(tipoVeiculo, codMarca, codModelo);
    }
}
