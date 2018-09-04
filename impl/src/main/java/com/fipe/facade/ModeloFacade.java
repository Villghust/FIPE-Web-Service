package com.fipe.facade;

import com.fipe.database.model.TipoVeiculo;
import com.fipe.model.ModeloModel;
import com.fipe.service.modelo.ModeloService;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ModeloFacade {
    private ModeloService modeloService;

    public Mono<ModeloModel> pesquisarModelos(TipoVeiculo tipoVeiculo, String codMarca) {
        return modeloService.pesquisarModelos(tipoVeiculo, codMarca);
    }
}
