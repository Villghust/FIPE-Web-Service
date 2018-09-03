package com.fipe.model;

import com.fipe.database.model.TipoVeiculo;
import lombok.*;

@EqualsAndHashCode
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarcaModel {
    private TipoVeiculo tipoVeiculo;
    private String nomeMarca;
    private int codigoMarca;
}
