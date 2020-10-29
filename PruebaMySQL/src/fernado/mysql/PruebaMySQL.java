/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fernado.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PruebaMySQL {
public static void main(String[] args){
    Connection conexion1 = null;
    Connection conexion2 = null;
    Connection conexion3 = null;

    String user = "root";
    String password = "";

    
        try{
    
    String url = "jdbc:mysql://localhost:3306/mibase?user=" + user + "&pasword=" + password;
        conexion1 = DriverManager.getConnection(url);

        if (conexion1 != null) {
            System.out.println("Conexion1: Conexion a mi base satisfactoria");

        }
        Properties datos = new Properties();
        datos.put("user", user);
        datos.put("password", password);
        
        
        String url2 = "jdbc:mysql://localhost:3306/mibase;";
        conexion2 = DriverManager.getConnection(url2, datos);

        if (conexion2 != null) {
            System.out.println("Conexion2: Conexion a mi base satisfactoria");

        }

          String url3 = "jdbc:mysql://localhost:3306/mibase;";
        conexion3 = DriverManager.getConnection(url3, user,password);

        if (conexion3 != null) {
            System.out.println("Conexion2: Conexion a mi base satisfactoria");

        }

} catch (SQLException e){
    
    System.out.print("error verifique");
    e.printStackTrace();
}
} 
        
    }
