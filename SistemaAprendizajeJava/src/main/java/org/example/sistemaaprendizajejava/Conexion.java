package org.example.sistemaaprendizajejava;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static Conexion instancia;
    private Connection con;

    private static final String URL = "jdbc:postgresql://localhost:5432/trabajadores_bd";
    private static final String USUARIO = "postgres";
    private static final String CLAVE = "admin";

    private Conexion() {
        try {
            con = DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (Exception e) {
            System.out.println("Conexión fallida");
            e.printStackTrace();
        }
    }

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public Connection getConnection() {
        return con;
    }

    public static void main(String[] args) {
        Conexion conexion = Conexion.getInstancia();
        if (conexion.getConnection() != null) {
            System.out.println("Conexión exitosa");
        } else {
            System.out.println("Conexión fallida");
        }
    }
}
