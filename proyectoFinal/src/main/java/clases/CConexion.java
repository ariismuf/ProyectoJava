/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author amufr
 */
public class CConexion {
    

    Connection conectar = null;
    
    String usuario = "aris";
    String contraseña = "ArisNazi18.";
    String bd = "Login";
    String ip = "192.168.56.2";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;

    public Connection estableceConexion(){
        
    
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
         JOptionPane.showMessageDialog(null, "Problemas en la conexion"); 
        }
    return conectar;
 }
}
