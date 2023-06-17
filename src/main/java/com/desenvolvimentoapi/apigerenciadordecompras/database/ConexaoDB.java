package com.desenvolvimentoapi.apigerenciadordecompras.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    private String url;
    private String user;
    private String password;
    private Connection connection;

    public ConexaoDB() {

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbListaDeCompras", "postgres", "110894");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado");
        } catch (SQLException e) {
            System.out.println("Banco de dados não conectado" + e.getMessage());
        }
    }
}