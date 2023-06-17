package com.desenvolvimentoapi.apigerenciadordecompras;

import java.util.*;

public class ListaDeCompras {
    private Map<String, Item> itens;
    private Scanner scanner;
    private int nextId;

    public ListaDeCompras() {
        itens = new HashMap<>();
        scanner = new Scanner(System.in);
        nextId = 1;
    }

    // Adicionar item à lista
    public void adicionarItem() {
        System.out.print("Digite o nome do item: ");
        String nome = scanner.nextLine();
        System.out.println("1 - Item normal");
        System.out.println("2 - Item com quantidade");
        System.out.print("Escolha o tipo de item: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        String id = String.valueOf(nextId++);
        Item item;

        if (opcao == 1) {
            item = new Item(id, nome);
        } else if (opcao == 2) {
            System.out.print("Digite a quantidade: ");
            int quantidade = Integer.parseInt(scanner.nextLine());
            item = new ItemComQtd(id, nome, quantidade);
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        itens.put(id, item);
        System.out.println("Item adicionado à lista com o ID: " + id);
    }

    // Remover item da lista
    public void removerItem() {
        System.out.print("Digite o ID do item a ser removido: ");
        String id = scanner.nextLine();

        if (itens.containsKey(id)) {
            itens.remove(id);
            System.out.println("Item removido da lista.");
        } else {
            System.out.println("ID inválido.");
        }
    }

    // Editar item da lista
    public void editarItem() {
        System.out.print("Digite o ID do item a ser editado: ");
        String id = scanner.nextLine();

        if (itens.containsKey(id)) {
            Item item = itens.get(id);
            System.out.print("Digite o novo nome do item: ");
            String novoNome = scanner.nextLine();
            item.nome = novoNome;
            System.out.println("Item editado.");
        } else {
            System.out.println("ID inválido.");
        }
    }

    // Marcar item como comprado
    public void marcarComoComprado() {
        System.out.print("Digite o ID do item a ser marcado como comprado: ");
        String id = scanner.nextLine();

        if (itens.containsKey(id)) {
            Item item = itens.get(id);
            item.setComprado(true);
            System.out.println("Item marcado como comprado.");
        } else {
            System.out.println("ID inválido.");
        }
    }

    // Exibir lista de compras
    public void exibirLista() {
        System.out.println("Lista de Compras:");
        for (Item item : itens.values()) {
            item.exibir();
        }
        System.out.println();
    }

    // Executar o programa
    public void executar() {
        int opcao = 0;
        while (opcao != 5) {
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Editar item");
            System.out.println("4 - Marcar item como comprado");
            System.out.println("5 - Exibir lista de compras");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    adicionarItem();
                    break;
                case 2:
                    removerItem();
                    break;
                case 3:
                    editarItem();
                    break;
                case 4:
                    marcarComoComprado();
                    break;
                case 5:
                    exibirLista();
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}