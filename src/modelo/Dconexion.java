
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;
public class Dconexion {

    static Connection con=null;
    public static Connection getConnection(){
 
    if(con==null){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelM","root","");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "ERROR CON LA CONEXION DE LA BASE DE DATOS" );
        }
    }
    return con;
    }

}