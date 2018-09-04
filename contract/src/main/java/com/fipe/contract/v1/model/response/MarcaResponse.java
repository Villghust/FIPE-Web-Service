package com.fipe.contract.v1.model.response;

import com.fipe.database.model.TipoVeiculo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MarcaResponse {
    private String nome;
    private int codigo;
}