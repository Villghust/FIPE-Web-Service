package com.fipe.model;

import com.fipe.database.model.TipoVeiculo;
import lombok.*;

@EqualsAndHashCode
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModeloModel {
    private TipoVeiculo tipoVeiculo;
    private String nomeModelo;
    private int codigoModelo;
}
