
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuario {
    public ArrayList<String> User = new ArrayList<String>();
    public ArrayList<String> Pass = new ArrayList<String>();
    public ArrayList<String> Name = new ArrayList<String>();
    public ArrayList<Integer> Rol = new ArrayList<Integer>();
    public ArrayList<Integer> Genero = new ArrayList<Integer>();
    public ArrayList<String> Numero = new ArrayList<String>();
    public Usuario(){
        
          try {
            this.llenarTabla();
        } catch (SQLException ex) {}

    }
        Connection cn=Dconexion.getConnection();
    public final void llenarTabla() throws SQLException{
            String sql="select * from usuarios";
            PreparedStatement pst =cn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
                User.add(rs.getString("usuario"));
                Pass.add(rs.getString("clave"));
                Name.add(rs.getString("nombre"));
                Rol.add(rs.getInt("rol"));
                Genero.add(rs.getInt("genero"));
            }
    }
        public final void insertar_Clientes(String nombre,String correo,String contra,
     int sexo,String telefono){
        User.add(correo);
        Pass.add(contra);
        Name.add(nombre);
        Genero.add(sexo);
        Rol.add(0);
        Numero.add(telefono);
        try{
            PreparedStatement ps;
            String sql = "insert into usuarios(usuario, clave,nombre, rol,genero,telefono) values(?,?,?,?,?,?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, contra);
            ps.setString(3, nombre);
            ps.setInt(4, sexo);
            ps.setInt(5, 0);
            ps.setString(6, telefono);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
}
