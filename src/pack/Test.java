package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306";

        try(Connection connection = DriverManager.getConnection(url,"root", "");
            Statement statement = connection.createStatement()){
          // statement.execute("create database users");
            System.out.println("Data base created");


       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
