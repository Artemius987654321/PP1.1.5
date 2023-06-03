package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/base?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Root12345.";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
     public static Connection getConnection() {
         try {
             Class.forName(DRIVER);
             return DriverManager.getConnection(URL, USERNAME, PASSWORD);
         } catch (SQLException | ClassNotFoundException e) {
             e.printStackTrace();
             throw new RuntimeException();
         }
    }
}
