package conexion;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Consultas extends Conexion {

    public boolean autenticacion(String username, String contrasena) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        int ban;
        try {
            String consulta = "select *  from Usuarios where usuario= ? and password=?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, username);
            pst.setString(2, contrasena);
            rs = pst.executeQuery();

            if (rs.absolute(1)) {
                int usuario = Integer.parseInt(rs.getString("id_usuario"));
                 ban = Integer.parseInt(rs.getString("primeravez"));
                 if (ban == 1) {
                     
                    return true;
                }else{
                     String query = "UPDATE `Usuarios` SET `primeravez`= 1 WHERE `id_usuario` = " + usuario + "";
                     pst = getConexion().prepareStatement(query);
                if (pst.executeUpdate() == 1) {
                    return true;
                     }
                 }
              

            }

        } catch (Exception e) {
            System.err.println("Error" + e);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println("Error" + e);
            }
        }

        return false;
    }

    public boolean registrar(String username, String contrasena, String mail) {
        PreparedStatement pst = null;
        try {
            String query = "Insert into Usuarios (usuario,password,llave) VALUES (?,?,?)";
            pst = getConexion().prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, contrasena);
            pst.setString(3, mail);
            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {
                System.err.println("Error" + e);
            }
        }

        return false;

    }
}
