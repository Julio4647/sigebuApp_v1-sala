package mx.edu.utez.sigebuapp_v1sala.model;

import mx.edu.utez.sigebuapp_v1sala.utils.MySQLConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoSala {
    Connection conn;
    PreparedStatement ps;
    CallableStatement cstm;
    ResultSet rs;

    public List<BeanSala> findAll(){
        List<BeanSala> salas = new ArrayList<>();
        BeanSala sala = null;
        try{
            conn = new MySQLConnection().getConnection();
            String query = "SELECT * FROM sala;";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                sala = new BeanSala();
                sala.setId(rs.getInt("id"));
                sala.setNombre_sala(rs.getString("nombre_sala"));
                sala.setCapacidad_sala(rs.getInt("capacidad_sala"));
                salas.add(sala);
            }
        }catch (Exception e){
            Logger.getLogger(DaoSala.class.getName())
                    .log(Level.SEVERE, "Error findAll", e);
        }finally {
            closeConnection();
        }
        return salas;
    }

    public boolean agregar(BeanSala sala){
        try{
            conn = new MySQLConnection().getConnection();
            String query = "INSERT INTO sala"+
                    "nombre_sala,capacidad_sala"+
                    "VALUES (?,?)";
            ps=conn.prepareStatement(query);
            ps.setString(1,sala.getNombre_sala());
            ps.setInt(2,sala.getCapacidad_sala());
            return ps.executeUpdate()==1;
        }catch (Exception e){
            Logger.getLogger(DaoSala.class.getName())
                    .log(Level.SEVERE, "Error save", e);
            return false;
        }finally {
            closeConnection();
        }
    }
    public BeanSala findOne(int id){
        try{
            conn = new MySQLConnection().getConnection();
            String query = "SELECT * FROM SALA WHERE ID =?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()){
                BeanSala sala =new BeanSala();
                sala.setId(rs.getInt("id"));
                sala.setNombre_sala(rs.getString("nombre_sala"));
                sala.setCapacidad_sala(rs.getInt("capacidad_sala"));
                return sala;
            }
        }catch (Exception e){
            Logger.getLogger(DaoSala.class.getName())
                    .log(Level.SEVERE, "Error save", e);
        }finally {
            closeConnection();
        }
        return  null;
    }

    public boolean update(BeanSala sala){
        try{
            conn = new MySQLConnection().getConnection();
            String query = "UPDATE sala SET nombre_sala = ?,capacidad_sala = ? WHERE id = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1,sala.getNombre_sala());
            ps.setInt(2,sala.getCapacidad_sala());
            ps.setInt(3,sala.getId());
            return ps.executeUpdate()==1;
        }catch (SQLException e){
            Logger.getLogger(DaoSala.class.getName())
                    .log(Level.SEVERE, "Error save", e);
            return false;
        }finally {
            closeConnection();
        }
    }

    public void closeConnection(){
        try{
            if(conn != null){
                conn.close();
            }
            if(ps != null){
                ps.close();
            }
            if(cstm != null){
                cstm.close();
            }
            if(rs != null){
                rs.close();
            }
        }catch (SQLException e){

        }
    }
}
