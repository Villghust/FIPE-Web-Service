package com.fipe.database.model;

import lombok.Getter;

public enum TipoVeiculo {

    CARROS(1), MOTOS(2), CAMINHOES(3);

    @Getter
    public int tipo;

    TipoVeiculo(int tipo) {
        this.tipo = tipo;
    }
}

/*
CREATE TABLE marcas(TIPO_VEICULO INT NOT NULL,
                    NOME VARCHAR(50) NOT NULL,
                    CODIGO SERIAL,
                    CONSTRAINT pk_marcas PRIMARY KEY(NOME));

CREATE TABLE modelos(TIPO_VEICULO INT NOT NULL,
                     NOME VARCHAR(50) NOT NULL,
                     CODIGO SERIAL,
                     CONSTRAINT pk_modelos PRIMARY KEY(NOME));

CREATE TABLE anos(TIPO_VEICULO INT NOT NULL,
                  NOME VARCHAR(50) NOT NULL,
                  CODIGO VARCHAR(50) NOT NULL,
                  ANO NUMERIC(4) NOT NULL,
                  CONSTRAINT pk_anos PRIMARY KEY(ANO));

CREATE TABLE veiculos(VALOR_VEICULO VARCHAR(100) NOT NULL,
                      MARCA VARCHAR(50) NOT NULL,
                      MODELO VARCHAR(255) NOT NULL,
                      ANO_MODELO NUMERIC(4) NOT NULL,
                      COMBUSTIVEL VARCHAR(8) NOT NULL,
                      CODIGO_FIPE VARCHAR(10) NOT NULL,
                      MES_REFERENCIA VARCHAR(30) NOT NULL,
                      TIPO_VEICULO INT NOT NULL,
                      SIGLA_COMBUSTIVEL VARCHAR(1) NOT NULL,
                      CONSTRAINT pk_veiculos PRIMARY KEY(TIPO_VEICULO));

ALTER TABLE veiculos
    ADD CONSTRAINT fk_veiculos_marcas FOREIGN KEY(MARCA) REFERENCES marcas;

ALTER TABLE veiculos
    ADD CONSTRAINT fk_veiculos_modelos FOREIGN KEY(MODELO) REFERENCES modelos;

ALTER TABLE veiculos
    ADD CONSTRAINT fk_veiculos_anos FOREIGN KEY(ANO_MODELO) REFERENCES anos;
 */