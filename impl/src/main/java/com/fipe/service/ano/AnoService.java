package com.fipe.service.ano;

import com.fipe.database.model.TipoVeiculo;
import com.fipe.database.repository.AnoRepository;
import com.fipe.mapper.AnoModelMapper;
import com.fipe.model.AnoModel;
import com.fipe.service.webflux.WebFluxRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class AnoService {
    private WebFluxRepository webFluxRepository;
    private AnoRepository anoRepository;

    public Mono<AnoModel> pesquisarAnos(TipoVeiculo tipoVeiculo, String codMarca, String codModelo) {
        return webFluxRepository.asyncMono(anoRepository. getAll(tipoVeiculo, codMarca, codModelo))
        .map(AnoModelMapper::anoToAnoModel);
    }
}
