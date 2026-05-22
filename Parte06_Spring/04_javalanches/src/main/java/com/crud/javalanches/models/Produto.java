package com.crud.javalanches.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

@Entity
public class Produto {
    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long CodigoProduto;

    @Column(unique = true, nullable = false)
    private String nomeProduto;
    @Column(length = 255)
    private String descricaoProduto;
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal precoProduto;


    public Produto() {
    }

    public long getCodigoProduto() {
        return this.CodigoProduto;
    }

    public void setCodigoProduto(long CodigoProduto) {
        this.CodigoProduto = CodigoProduto;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return this.descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public BigDecimal getPrecoProduto() {
        return this.precoProduto;
    }

    public void setPrecoProduto(BigDecimal precoProduto) {
        this.precoProduto = precoProduto;
    }


}

