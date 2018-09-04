package com.fipe.contract.v1.model.request;

import com.fipe.database.model.TipoVeiculo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VeiculoRequest {
    @NotNull(message = "É necessário informar o tipo do veículo!")
    private TipoVeiculo tipoVeiculo;
    @NotNull(message = "É necessário informar a marca do veículo!")
    private String marca;
    @NotNull(message = "É necessário informar o modelo do veículo!")
    private String modelo;
    @NotNull(message = "É necessário informar o ano do veículo!")
    private int ano;
}
// TODO Veiculo 2 - Os requests serão nestes tipos?