package org.udbl.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*public class DatabaseManager {
    private static final String URL = "jdbc:sqlite:/home/victory/IdeaProjects/Persistance_Bdd/src/main/resources/etudiants";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}*/

public class DatabaseManager implements ConnectionProvider {
    private final IDatabaseConfig config;

    public DatabaseManager(IDatabaseConfig config) {
        this.config = config;
    }

    @Override
    public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
        if (connection != null) {
            return connection;
        }
        return null;
    }
}


