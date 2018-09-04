package com.fipe.contract.v1.model.response;

import com.fipe.database.model.Modelo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ModeloResponse {
    private String nome;
    private int codigo;
}