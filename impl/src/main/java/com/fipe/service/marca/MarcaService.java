package com.fipe.service.marca;

import com.fipe.database.model.TipoVeiculo;
import com.fipe.database.repository.MarcaRepository;
import com.fipe.mapper.MarcaModelMapper;
import com.fipe.model.MarcaModel;
import com.fipe.service.webflux.WebFluxRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class MarcaService {
    private WebFluxRepository webFluxRepository;
    private MarcaRepository marcaRepository;

    public Mono<MarcaModel> pesquisarMarcas(TipoVeiculo tipoVeiculo) {
        return webFluxRepository.asyncMono(marcaRepository.getAll(tipoVeiculo))
                .map(MarcaModelMapper::marcaToMarcaModel);
    }
}