package com.fipe.facade;

import com.fipe.database.model.TipoVeiculo;
import com.fipe.model.MarcaModel;
import com.fipe.service.marca.MarcaService;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class MarcaFacade {
    private MarcaService marcaService;

    public Mono<MarcaModel> pesquisarMarcas(TipoVeiculo tipoVeiculo) {
        return marcaService.pesquisarMarcas(tipoVeiculo);
    }
}
