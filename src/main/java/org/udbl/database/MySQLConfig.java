package org.udbl.database;

public class MySQLConfig implements IDatabaseConfig {
    @Override
    public String getUrl() {
        return "jdbc:mysql://sql.freedb.tech/freedb_db_animal";
    }

    @Override
    public String getUser() {
        return "freedb_victory";
    }

    @Override
    public String getPassword() {
        return "74R5*zrpw*P%4%h";
    }
}
