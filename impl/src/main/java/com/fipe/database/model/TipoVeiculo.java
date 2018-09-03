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
CREATE TABLE marcas(NOME VARCHAR(50) NOT NULL,
                    CODIGO SERIAL PRIMARY KEY);

CREATE TABLE modelos(NOME VARCHAR(50) NOT NULL,
                     CODIGO SERIAL PRIMARY KEY);

CREATE TABLE anos(NOME VARCHAR(50) NOT NULL,
                  CODIGO VARCHAR(50) NOT NULL);

CREATE TABLE veiculos(VALOR_VEICULO VARCHAR(100) NOT NULL,
                      MARCA VARCHAR(50) NOT NULL,
                      MODELO VARCHAR(255) NOT NULL,
                      ANO_MODELO NUMERIC(4) NOT NULL,
                      COMBUSTIVEL VARCHAR(8) NOT NULL,
                      CODIGO_FIPE VARCHAR(10) NOT NULL,
                      MES_REFERENCIA VARCHAR(30) NOT NULL,
                      TIPO_VEICULO INT DEFAULT NULL,
                      SIGLA_COMBUSTIVEL VARCHAR(1) NOT NULL);

ALTER TABLE modelos
    ADD CONSTRAINT fk_modelos_veiculos FOREIGN KEY(TIPO_VEICULO) REFERENCES veiculos;

DROP TABLE veiculos;
 */