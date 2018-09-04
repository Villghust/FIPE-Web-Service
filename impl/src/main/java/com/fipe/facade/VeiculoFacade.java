package com.fipe.facade;

import com.fipe.database.model.TipoVeiculo;
import com.fipe.model.VeiculoModel;
import com.fipe.service.veiculo.VeiculoService;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class VeiculoFacade {
    private VeiculoService veiculoService;

//    public Mono<VeiculoModel> pesquisarVeiculo(TipoVeiculo tipoVeiculo, String codMarca, String codModelo, int ano) {
//        return veiculoService.pesquisarVeiculo(tipoVeiculo, codMarca, codModelo, ano);
//    }
}
