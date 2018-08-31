package com.fipe.contract.v1.model.request;

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
    @NotNull(message = "É necessário informar a marca do veículo!")
    private String marca;
    @NotNull(message = "É necessário informar o modelo do veículo!")
    private String modelo;
    @NotNull(message = "É necessário informar o ano do veículo!")
    private int ano;
}

// TODO 1 - Verificar se é aqui que definimos o que será informado pelo usuário para definir a Query.