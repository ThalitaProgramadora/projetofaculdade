/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conecction;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author thalita
 */
public class ConnectionFactory {
     public Connection getConnection() {

        try {

            return DriverManager.getConnection("jdbc:mysql://localhost:3306/CursoTA","root","thalita");

        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }

    }

}
