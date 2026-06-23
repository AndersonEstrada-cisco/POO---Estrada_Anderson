package org.example.sistemaaprendizajejava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TrabajadorDAO {

    public void guardar(Trabajador t) {
        try {
            Connection con = Conexion.getInstancia().getConnection();
            String sql = "INSERT INTO trabajadores (cedula, nombre, apellido, edad, correo, estado_civil, jornada, cargo) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getCedula());
            ps.setString(2, t.getNombre());
            ps.setString(3, t.getApellido());
            ps.setInt(4, t.getEdad());
            ps.setString(5, t.getCorreo());
            ps.setString(6, t.getEstadoCivil());
            ps.setString(7, t.getJornada());
            ps.setString(8, t.getCargo());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Trabajador> listarTodos() {
        List<Trabajador> lista = new ArrayList<>();
        try {
            Connection con = Conexion.getInstancia().getConnection();
            String sql = "SELECT * FROM trabajadores";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Trabajador t = new Trabajador(
                        rs.getString("cedula"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad"),
                        rs.getString("correo"),
                        rs.getString("estado_civil"),
                        rs.getString("jornada"),
                        rs.getString("cargo")
                );
                lista.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void actualizar(Trabajador t) {
        try {
            Connection con = Conexion.getInstancia().getConnection();
            String sql = "UPDATE trabajadores SET nombre=?, apellido=?, edad=?, correo=?, estado_civil=?, jornada=?, cargo=? " +
                        "WHERE cedula=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getNombre());
            ps.setString(2, t.getApellido());
            ps.setInt(3, t.getEdad());
            ps.setString(4, t.getCorreo());
            ps.setString(5, t.getEstadoCivil());
            ps.setString(6, t.getJornada());
            ps.setString(7, t.getCargo());
            ps.setString(8, t.getCedula());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminar(String cedula) {
        try {
            Connection con = Conexion.getInstancia().getConnection();
            String sql = "DELETE FROM trabajadores WHERE cedula=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cedula);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
