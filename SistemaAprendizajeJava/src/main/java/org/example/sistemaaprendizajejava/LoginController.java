package org.example.sistemaaprendizajejava;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML TextField txtUsuario;
    @FXML PasswordField txtClave;

    @FXML
    public void btnIngresar() {
        String usuario = txtUsuario.getText();
        String clave = txtClave.getText();

        if (usuario.isEmpty() || clave.isEmpty()) {
            Alert alerta = new Alert(Alert.AlertType.WARNING, "Debe ingresar usuario y contraseña");
            alerta.showAndWait();
            return;
        }

        if (usuario.equals("admin") && clave.equals("admin")) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION, "Bienvenido " + usuario);
            alerta.showAndWait();

            // LUEGO COLOCAREMOS LA FUNCIÓN PARA CARGAR LA VENTANA DEL ADMIN
            try {
                Parent root = FXMLLoader.load(getClass().getResource("crud.fxml"));
                Stage stage = new Stage();
                stage.setTitle("Registro de trabajadores");
                stage.setScene(new Scene(root));
                stage.show();

                Stage loginStage = (Stage) txtUsuario.getScene().getWindow();
                loginStage.close();
            } catch (Exception e) {
                e.printStackTrace();
            }


        } else {
            Alert alerta = new Alert(Alert.AlertType.ERROR, "Usuario o contraseña incorrectos");
            alerta.showAndWait();
        }
    }

    @FXML
    public void btnSalir() {
        Stage stage = (Stage) txtUsuario.getScene().getWindow();
        stage.close();
    }
}
