package com.fipe.contract.v1.mapper;

import com.fipe.contract.v1.model.request.AnoRequest;
import com.fipe.contract.v1.model.response.AnoResponse;
import com.fipe.model.AnoModel;

public class AnoMapper {

    public static AnoResponse mapperToContract(AnoModel anoModel) {
        return AnoResponse.builder()
                .build();
    }

    public static AnoModel mapperToModel(AnoRequest anoRequest) {
        return AnoModel.builder()
                .build();
    }
}
