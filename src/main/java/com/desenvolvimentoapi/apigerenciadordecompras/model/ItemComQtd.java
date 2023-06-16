package com.desenvolvimentoapi.apigerenciadordecompras.model;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private List<String> itens = new ArrayList<>();

    public void adicionarProduto(String item) {
        itens.add(item);
    }
}
