package com.fipe.service.veiculo;

import com.fipe.database.model.TipoVeiculo;
import com.fipe.database.repository.VeiculoRepository;
import com.fipe.mapper.VeiculoModelMapper;
import com.fipe.model.VeiculoModel;
import com.fipe.service.webflux.WebFluxRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class VeiculoService {
    private WebFluxRepository webFluxRepository;
    private VeiculoRepository veiculoRepository;

//    public Mono<VeiculoModel> pesquisarVeiculo(TipoVeiculo tipoVeiculo, String codMarca, String codModelo, int ano) {
//        return webFluxRepository.asyncMono(veiculoRepository.getVeiculo(tipoVeiculo, codMarca, codModelo, ano))
//                .map(VeiculoModelMapper::veiculoToVeiculoModel);
//    }
}
