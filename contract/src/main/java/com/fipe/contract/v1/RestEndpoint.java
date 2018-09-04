package com.fipe.contract.v1;

import com.fipe.contract.v1.facade.AnoContractFacade;
import com.fipe.contract.v1.facade.MarcaContractFacade;
import com.fipe.contract.v1.facade.ModeloContractFacade;
import com.fipe.contract.v1.facade.VeiculoContractFacade;
import com.fipe.contract.v1.model.response.AnoResponse;
import com.fipe.contract.v1.model.response.MarcaResponse;
import com.fipe.contract.v1.model.response.ModeloResponse;
import com.fipe.contract.v1.model.response.VeiculoResponse;
import com.fipe.database.model.TipoVeiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("fipe/v1")
public class RestEndpoint {
    @Autowired
    private MarcaContractFacade marcaContractFacade;

    @Autowired
    private ModeloContractFacade modeloContractFacade;

    @Autowired
    private AnoContractFacade anoContractFacade;

    @Autowired
    private VeiculoContractFacade veiculoContractFacade;

    @GetMapping(path = "/{tipoVeiculo}/marcas")
    public Mono<MarcaResponse> pesquisarMarcas(@PathVariable("tipoVeiculo") TipoVeiculo tipoVeiculo) {
        return marcaContractFacade.pesquisarMarcas(tipoVeiculo);
    }

    @GetMapping(path = "/{tipoVeiculo}/marcas/{codMarca}/modelos")
    public Mono<ModeloResponse> pesquisarModelos(@PathVariable("tipoVeiculo") TipoVeiculo tipoVeiculo,
                                                 @PathVariable("codMarca") String codMarca) {
        return modeloContractFacade.pesquisarModelos(tipoVeiculo, codMarca);
    }

    @GetMapping(path = "/{tipoVeiculo}/marcas/{codMarca}/modelos/{codModelo}/anos")
    public Mono<AnoResponse> pesquisarAnos(@PathVariable("tipoVeiculo") TipoVeiculo tipoVeiculo,
                                           @PathVariable("codMarca") String codMarca,
                                           @PathVariable("codModelo") String codModelo){
        return anoContractFacade.pesquisarAnos(tipoVeiculo, codMarca, codModelo);
    }

//    @GetMapping(path = "/{tipoVeiculo}/marcas/{codMarca}/modelos/{codModelo}/anos/{codAno}")
//    public Mono<VeiculoResponse> pesquisarVeiculo(@PathVariable("tipoVeiculo") TipoVeiculo tipoVeiculo,
//                                                  @PathVariable("codMarca") String codMarca,
//                                                  @PathVariable("codModelo") String codModelo,
//                                                  @PathVariable("codAno") int codAno) {
//        return veiculoContractFacade.pesquisarVeiculo(tipoVeiculo, codMarca, codModelo, codAno);
//    }
}
