/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import com.mycompany.proyectofinal.fLogin;
import com.mycompany.proyectofinal.fMenu;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.SQLException;
import javax.swing.JTextPane;

/**
 *
 * @author amufr
 */
public class CLogin {
     public void validaUsuario(JTextField usuario, JPasswordField contraseña){
        
        try{
            ResultSet rs=null;
            PreparedStatement ps=null;
            
            clases.CConexion objetoConexion = new clases.CConexion();
            
            String consulta = "SELECT * FROM `Usuario` WHERE Usuario.Usuario = (?) AND Usuario.Contraseña = (?)";
            
            ps=objetoConexion.estableceConexion().prepareStatement(consulta);
            
            String contra = String.valueOf(contraseña.getPassword());
            
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);
            
            rs = ps.executeQuery();
            
            if (rs.next()){
                
                //JOptionPane.showMessageDialog(null,"El usuario es correcto");
                fMenu objetoMenu = new fMenu();
                objetoMenu.setVisible(true);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"El usuario o la contraseña es incorrecto");
                fLogin login = new fLogin();
       login.setVisible(true);
       
            }
            
        } catch (Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Error");
        }
    }

    public void nuevoUsuario (JTextField Nusuario, JPasswordField Ncontraseña, JTextField Nombre, JTextField local){
        
    
    
    try{
        clases.CConexion objetoConexion = new clases.CConexion();
        String query = "INSERT INTO Usuario (Usuario, Contraseña, Nombre, Local) VALUES (?, ?, ?, ?)";
        PreparedStatement est = objetoConexion.estableceConexion().prepareStatement(query);
        
        String ncontra = String.valueOf(Ncontraseña.getPassword());
        est.setString(1, Nusuario.getText());
        est.setString(2, ncontra);
        est.setString(3, Nombre.getText());
        est.setString(4, local.getText());
        
        est.executeUpdate();
        JOptionPane.showMessageDialog(null,"El usuario se creó correctamente.");
        fMenu objetoMenu = new fMenu();
                objetoMenu.setVisible(true);
        
    }  catch (Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Error");
        }
        } 
    
    
    
    public static void receta(JTextField Nombre){
    
        String query = "Select Plato, dscripción FROM platos where plato Like '%?%'";
        try{
            
            
            clases.CCRecetas objetoConexion = new clases.CCRecetas();
            PreparedStatement est = objetoConexion.estableceConexion().prepareStatement(query);
            Statement st = objetoConexion.conectar.createStatement();
            ResultSet rs = st.executeQuery(query);
            est.setString(1, Nombre.getText());
            while(rs.next()){
                //System.out.println("plato: " + rs.getString(1));
                //System.out.println("ingredientes: " + rs.getString(2));
                //System.out.println("receta: " + rs.getString(3));
                JOptionPane.showMessageDialog(null, "plato: "+ rs.getString(1) + "receta. " + rs.getString(2));
                System.out.println("-----------------");
                
            }
}catch(Exception e){
            System.out.println("Error" + e);
}
    }
    
    
    public void nuevaReceta (JTextField nombre, JTextField tiempo, JTextField ingredientes, JTextPane receta){
        
    
    
    try{
        clases.CCRecetas objetoConexion = new clases.CCRecetas();
        String query = "INSERT INTO platos (plato, ingredientes, tiempo, dscripción) VALUES (?, ?, ?, ?)";
        PreparedStatement est = objetoConexion.estableceConexion().prepareStatement(query);
        
        
        est.setString(1, nombre.getText());
        est.setString(2, ingredientes.getText());
        est.setString(3, tiempo.getText());
        est.setString(4, receta.getText());
        
        est.executeUpdate();
        JOptionPane.showMessageDialog(null,"La receta se creo correctamente.");
        fMenu objetoMenu = new fMenu();
        objetoMenu.setVisible(true);
                 
        
    }  catch (Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Error");
        }
        } 
}




