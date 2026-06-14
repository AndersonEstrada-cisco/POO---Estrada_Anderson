package com.example.mitiendafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class HelloController {
    @FXML TextField txtUsuario;
    @FXML PasswordField txtContrasena;
    @FXML ComboBox <String> cmbRol;
    @FXML Button btnIngresar;
    @FXML Label lblMensaje;


    public void initialize(){
        cmbRol.getItems().add(" -- Seleccionar --");
        cmbRol.getItems().add("Administrador");
        cmbRol.getItems().add("Vendedor");
        cmbRol.getItems().add("Cajero");
    }


    @FXML
    public void btnIngresar() throws Exception{
        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();
        String rol = cmbRol.getValue();



        // --
        if (rol == null || rol.equals(" -- Seleccionar --")){
            lblMensaje.setText("Debe seleccionar un Rol");
            return;
        }

        if (usuario.isEmpty()){
            lblMensaje.setText("Ingrese el usuario");
            return;
        }

        if (contrasena.isEmpty()){
            lblMensaje.setText("Ingrese la constraseña");
            return;
        }
        // --

        if (usuario.equals("admin") && contrasena.equals("1234") && rol.equals("Administrador")){
            lblMensaje.setText("Acceso Concedido");
            cargarAdministrador();

        }else if (usuario.equals("cajero") && contrasena.equals("cajero") && rol.equals("Cajero")){
            lblMensaje.setText("Acceso Concedido");

        }else if (usuario.equals("vendedor") && contrasena.equals("vendedor") && rol.equals("Vendedor")){
            lblMensaje.setText("Acceso Concedido");
        } else {
            lblMensaje.setText("Credeciales Incorrectas");
        }

    }

    public void cargarAdministrador() throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("administrador.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) lblMensaje.getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
}
