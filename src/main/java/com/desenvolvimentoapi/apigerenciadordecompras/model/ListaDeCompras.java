package com.desenvolvimentoapi.apigerenciadordecompras.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@AllArgsConstructor // Construtor com todos os atributos
@Builder //
@Data // Tras todos os getters e setters
@NoArgsConstructor // Construtor sem nenhum argumento para o hibernate

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Salvar os identificadores automaticamente.
    private long id;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> Items;
    private int quantidade;

}