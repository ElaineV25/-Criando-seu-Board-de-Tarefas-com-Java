package main.java.br.com.dio;


import main.java.br.com.dio.persistence.migration.MigrationStrategy;

import java.sql.SQLException;

import br.com.dio.ui.MainMenu;

import static main.java.br.com.dio.persistence.config.ConnectionConfig.getConnection;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}