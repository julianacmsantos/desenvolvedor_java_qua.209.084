package com.crud.javalanches.models;

import java.math.BigDecimal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

@Entity
public class Pedido {

    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long CodigoPedido;

    @Column(nullable = false)
    private LocalDateTime dataHoraPedido;
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal valorTotalPedido;

    @ManyToMany
    @JoinTable(name = "pedido_produto", joinColumns = @JoinColumn(name = "pedido_id)"), inverseJoinColumns = @JoinColumn(name = "produto_id"))
    private List<Produto> produtos = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    public Pedido() {
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getCodigoPedido() {
        return this.CodigoPedido;
    }

    public void setCodigoPedido(long CodigoPedido) {
        this.CodigoPedido = CodigoPedido;
    }

    public LocalDateTime getDataHoraPedido() {
        return this.dataHoraPedido;
    }

    public void setDataHoraPedido(LocalDateTime dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public BigDecimal getValorTotalPedido() {
        return this.valorTotalPedido;
    }

    public void setValorTotalPedido(BigDecimal valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

}
