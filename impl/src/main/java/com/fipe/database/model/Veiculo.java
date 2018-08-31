package com.fipe.database.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "veiculos")
public class Veiculo {

    public enum TipoVeiculo {

        CARROS(1), MOTOS(2), CAMINHOES(3);

        @Getter
        public int tipo;

        TipoVeiculo(int tipo) {
            this.tipo = tipo;
        }
    }

    @Id
    @Column
    private String codigoFipe;

    @Column
    private String valor;

    @Column
    private String marca;

    @Column
    private String modelo;

    @Column
    private int anoModelo;

    @Column
    private String combustivel;

    @Column
    private String mesReferencia;

    @Column
    private int tipoVeiculo;

    @Column
    private char siglaCombustivel;

}

/*
CREATE TABLE veiculos(VALOR_VEICULO VARCHAR(100) NOT NULL,
    MARCA VARCHAR(50) NOT NULL,
    MODELO VARCHAR(255) NOT NULL,
    ANO_MODELO NUMERIC(4) NOT NULL,
    COMBUSTIVEL VARCHAR(8) NOT NULL,
    CODIGO_FIPE VARCHAR(10) NOT NULL,
    MES_REFERENCIA VARCHAR(30) NOT NULL,
    TIPO_VEICULO INT DEFAULT NULL,
    SIGLA_COMBUSTIVEL VARCHAR(1) NOT NULL,
    CONSTRAINT PK_CODIGO_FIPE PRIMARY KEY(CODIGO_FIPE));

CREATE TABLE marcas(NOME VARCHAR(50) NOT NULL,
    ID_MARCAS SERIAL PRIMARY KEY);

CREATE TABLE modelos(NOME VARCHAR(100) NOT NULL,
    ID_MODELOS SERIAL PRIMARY KEY);

CREATE TABLE anos(ID_ANOS SERIAL PRIMARY KEY,
    NOME VARCHAR(50) NOT NULL,
    CODIGO VARCHAR(50) NOT NULL);
*/