package com.fipe.service.modelo;

import com.fipe.database.model.TipoVeiculo;
import com.fipe.database.repository.ModeloRepository;
import com.fipe.mapper.ModeloModelMapper;
import com.fipe.model.ModeloModel;
import com.fipe.service.webflux.WebFluxRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ModeloService {
    private WebFluxRepository webFluxRepository;
    private ModeloRepository modeloRepository;

    public Mono<ModeloModel> pesquisarModelos(TipoVeiculo tipoVeiculo, String codMarca) {
        return webFluxRepository.asyncMono(modeloRepository. getAll(tipoVeiculo, codMarca))
                .map(ModeloModelMapper::modeloToModeloModel);
    }
}
