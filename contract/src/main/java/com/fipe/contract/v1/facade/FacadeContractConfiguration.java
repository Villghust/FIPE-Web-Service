package com.fipe.contract.v1.facade;

import com.fipe.facade.AnoFacade;
import com.fipe.facade.MarcaFacade;
import com.fipe.facade.ModeloFacade;
import com.fipe.facade.VeiculoFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FacadeContractConfiguration {
    @Bean
    public MarcaContractFacade marcaContractFacade(MarcaFacade marcaFacade) {
        return new MarcaContractFacade(marcaFacade);
    }

    @Bean
    public ModeloContractFacade modeloContractFacade(ModeloFacade modeloFacade) {
        return new ModeloContractFacade(modeloFacade);
    }

    @Bean
    public AnoContractFacade anoContractFacade(AnoFacade anoFacade) {
        return new AnoContractFacade(anoFacade);
    }

    @Bean
    public VeiculoContractFacade veiculoContractFacade(VeiculoFacade veiculoFacade) {
        return new VeiculoContractFacade(veiculoFacade);
    }
}
