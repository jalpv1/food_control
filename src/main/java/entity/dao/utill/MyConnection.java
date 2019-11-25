package entity.dao.utill;


//import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.postgresql.ds.PGPoolingDataSource;
import org.postgresql.ds.PGSimpleDataSource;
import org.postgresql.jdbc3.Jdbc3PoolingDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.*;
import java.lang.*;

public class MyConnection {
    private static String url = "jdbc:postgresql://localhost:5432/food_control";
    private static String user = "postgres";
    private static String password = "123";

    public static Connection gettingConnection() {
        try {
            Connection connection = getDataSource().getConnection();
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static volatile DataSource dataSource;

    private static DataSource getDataSource() {
        if (dataSource == null) {
            BasicDataSource source = new BasicDataSource();
            source.setUrl("jdbc:postgresql://localhost:5432/food_control");
            source.setUsername("postgres");
            source.setPassword("123");
            source.setMaxIdle(10);
            source.setMinIdle(5);
            source.setMaxOpenPreparedStatements(100);
            dataSource = source;


        }
        return dataSource;
    }
}
