package org.udbl.database;

public class SQLiteConfig implements IDatabaseConfig {
    @Override
    public String getUrl() {
        return "jdbc:sqlite:/home/victory/IdeaProjects/Persistance_Bdd/src/main/resources/etudiants";
    }

    @Override
    public String getUser() {
        return "";
    }

    @Override
    public String getPassword() {
        return "";
    }
}
