package com.desenvolvimentoapi.apigerenciadordecompras.model;

class Item {
    protected String id;
    protected String nome;
    protected boolean comprado;

    // Construtor
    public Item(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.comprado = false;
    }

    // Getter e Setter
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    // Exibir o item e seu status atual
    public void exibir() {
        String status = (comprado) ? " [x]" : " [ ]";
        System.out.println(id + ". " + nome + status);
    }
}