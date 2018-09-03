package com.fipe.contract.v1.model.response;

import com.fipe.database.model.Marca;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MarcaResponse {
    private ArrayList<Marca> marcas;
}

// TODO 1