package prodevance.advance.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
    private static String driver="";
    private static String url="";
    private static String user="";
    private static String password="";

    private static Connection connection=null;

    public static Connection getConnection(
            String driver,
            String url,
            String user,
            String password
    ) {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(
                    url,
                    user,
                    password
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}


