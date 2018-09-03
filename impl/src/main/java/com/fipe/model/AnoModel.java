package com.fipe.model;

import com.fipe.database.model.TipoVeiculo;
import lombok.*;

@EqualsAndHashCode
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnoModel {
    private TipoVeiculo tipoVeiculo;
    private String nomeAno;
    private String codigoAno;
}
