package org.udbl.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static String url = "jdbc:mysql://sql.freedb.tech/freedb_db_animal";
    public static String user = "freedb_victory";
    public static String password = "74R5*zrpw*P%4%h";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}