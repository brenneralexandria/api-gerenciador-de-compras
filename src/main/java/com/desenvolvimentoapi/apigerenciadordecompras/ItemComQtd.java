package com.desenvolvimentoapi.apigerenciadordecompras.model;


// Classe para itens que têm quantidade (subclasse de Item)
class ItemComQtd extends Item {
    private final int quantidade;

    public ItemComQtd(String id, String nome, int quantidade) {
        super(id, nome);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void exibir() {
        String status = (comprado) ? " [x]" : " [ ]";
        System.out.println(id + ". " + nome + " (x" + quantidade + ")" + status);
    }
}