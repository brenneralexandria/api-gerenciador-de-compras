package com.desenvolvimentoapi.apigerenciadordecompras.model;

import java.util.List;

public class Produto extends ProdutoDAO {

    private long id;
    private List<String> items;
    private int quantidade;

    // construtor
    public Produto(long id, List<String> items, int quantidade) {
        super();
    }

    // Getters e Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}