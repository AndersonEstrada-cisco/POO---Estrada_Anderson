package com.example.navegacionforumulariosfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;


import javafx.scene.Scene;

public class HelloController {

    @FXML private ComboBox<String> cmbRol;
    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtContrasena;
    @FXML private Label lblmsj;

    @FXML
    private void initialize(){
        cmbRol.getItems().add("Administrador");
        cmbRol.getItems().add("Cajero");
    }


    @FXML
    private void btnIngresar() throws Exception {
        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();
        String rol = cmbRol.getValue();

        if (usuario.equals("admin") && contrasena.equals("admin") && rol.equals("Administrador")){
            lblmsj.setText("Acceso Concedido");
            cargarAdministrador();

        } else if (usuario.equals("cajero") && contrasena.equals("cajero") && rol.equals("Cajero")){
            lblmsj.setText("Acceso Concedido");
            cargarCajero();

        } else {
            lblmsj.setText("Credenciales Incorrectas");
        }
    }


    public void cargarAdministrador() throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("administrador.fxml"));

        Stage stage = (Stage) lblmsj.getScene().getWindow();

        stage.setScene(new Scene(loader.load()));
        stage.show();
    }

    public void cargarCajero() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("cajero.fxml"));

        Stage stage = (Stage) lblmsj.getScene().getWindow();

        stage.setScene(new Scene(loader.load()));
        stage.show();
    }




    @FXML
    private void btnSalir() {
        System.exit(0);
    }

}
