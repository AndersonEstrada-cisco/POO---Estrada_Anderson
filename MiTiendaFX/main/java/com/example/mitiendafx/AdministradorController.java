package com.example.mitiendafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class AdministradorController {

    @FXML
    BorderPane BorderPaneRootPane;

    @FXML
    public void btnProductos() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("productos.fxml"));
        BorderPaneRootPane.setCenter(loader.load());

    }

}

