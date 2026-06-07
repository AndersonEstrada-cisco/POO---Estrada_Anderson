package com.example.sistemaconinterfazestudiante;

import javafx.application.Application;
import javafx.collections.ObservableArray;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.collections.FXCollections;
import jdk.jshell.ImportSnippet;

import java.util.List;


public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {

        Label lblTitulo = new Label("Sistema Estudiantil");
        lblTitulo.setId("titulo");


        Label lblNombre = new Label("Nombre del  Estudiante");
        TextField txtNombre = new TextField();
        txtNombre.setPromptText(" Ingrese su Nombre");

        Label lblEdad = new Label(" Edad");
        TextField txtEdad = new TextField();
        txtEdad.setPromptText("Ingrese su edad");

        Label lblCarrera = new Label("Carrera");


        ComboBox<String> cmbCarrera = new ComboBox<>();
        cmbCarrera.setItems(FXCollections.observableArrayList(
                "Tecnología en Desarrollo de Software",
                "Tecnología en Agua y Saneamiento",
                "Tecnología en Electromecánica"
        ));
        cmbCarrera.setPromptText("Seleccione la Carrera");


        Label lblSemestre = new Label("Semestre");

        ComboBox<String> cmbSemestre = new ComboBox<>();
        cmbSemestre.setItems(FXCollections.observableArrayList(
                "1er Semestre",
                "2do Semestre",
                "3er Semestre",
                "4to Semestre",
                "5to Semestre"
        ));
        cmbSemestre.setPromptText(" Seleccione el semestre");


        Label lblMateria = new Label("Materia Cursada: ");

        ComboBox<String> cmbMateria = new ComboBox<>(FXCollections.observableArrayList(
                "Desarrollo de IoT",
                "Programación",
                "Diseño de Interfaces",
                "Química",
                "Redes",
                "Electricidad"
        ));
        cmbMateria.setPromptText("Escoja una materia");

        Label lblNota1 = new Label("Nota del Primer Bimestre");
        TextField txtNota1 = new TextField();
        txtNota1.setPromptText("Ingrese nota del IB");

        Label lblNota2 = new Label("Nota del Segundo Bimestre");
        TextField txtNota2 = new TextField();
        txtNota2.setPromptText("Ingrese nota del IIB");

        Button btnCalcular = new Button("Calcular Promedio");
        btnCalcular.setId("btn-calcular");

        ListView<String> listaEstudiantes = new ListView<>();
        listaEstudiantes.setId("lista");

        Button btnLimpiar = new Button("Limpiar");
        Button btnLimpiarHistorial = new Button("Limpiar Historial");

        VBox raiz = new VBox(
                lblTitulo,

                lblNombre,
                txtNombre,

                lblEdad,
                txtEdad,

                lblCarrera,
                cmbCarrera,

                lblSemestre,
                cmbSemestre,

                lblMateria,
                cmbMateria,

                lblNota1,
                txtNota1,

                lblNota2,
                txtNota2,

                btnCalcular,
                btnLimpiar,
                listaEstudiantes,

                btnLimpiarHistorial
                );


        btnCalcular.setOnAction(event -> {


            if (txtNombre.getText().isEmpty() ||
                    txtEdad.getText().isEmpty() ||
                    cmbCarrera.getValue() == null ||
                    cmbSemestre.getValue() == null ||
                    cmbMateria.getValue() == null ||
                    txtNota1.getText().isEmpty() ||
                    txtNota2.getText().isEmpty()) {

                listaEstudiantes.getItems().add("ERROR: Complete todos los campos");
                return;
            }


            try {
                int edad = Integer.parseInt(txtEdad.getText());

                double n1 = Double.parseDouble(txtNota1.getText());
                double n2 = Double.parseDouble(txtNota2.getText());

                if (n1 < 0 || n1 > 20 || n2 < 0 || n2 > 20) {
                    return; //El return dice que si fallan las notas, entonces salga del botón
                }

                double promedio = (n1 + n2) / 2;

                String estado;
                if (promedio >= 14) {
                    estado = "Aprobado";
                } else {
                    estado = "Reprobado";
                }

                String registro =
                        "Registro: " + txtNombre.getText() +
                        " | " + txtEdad.getText() +
                        " | " + cmbCarrera.getValue() +
                        " | " + cmbSemestre.getValue() +
                        " | " + cmbMateria.getValue() +
                        " | Promedio: " + promedio +
                        " | " + estado;

                listaEstudiantes.getItems().add(registro);


            } catch (NumberFormatException e) {
                listaEstudiantes.getItems().add("ERROR: Edad o notas NO válidas ");
                System.out.println("Notas NO Válidas");
            }

        });

        btnLimpiar.setOnAction(event -> {
            txtNombre.clear();
            txtEdad.clear();
            txtNota1.clear();
            txtNota2.clear();

            cmbCarrera.setValue(null);
            cmbSemestre.setValue(null);
            cmbMateria.setValue(null);

        });

        btnLimpiarHistorial.setOnAction(event -> {
            listaEstudiantes.getItems().clear();
        });



        ScrollPane panelDesplazable = new ScrollPane(raiz);
        panelDesplazable.setFitToWidth(true);

        Scene scene = new Scene(panelDesplazable, 800, 600);

        stage.setTitle("Sistema Estudiantil");
        stage.setScene(scene);

        scene.getStylesheets().add(
                getClass().getResource("styles.css").toExternalForm()
        );

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
