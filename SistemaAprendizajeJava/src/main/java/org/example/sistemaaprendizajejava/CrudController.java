package org.example.sistemaaprendizajejava;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;

import java.util.List;

public class CrudController {

    @FXML TextField txtCedula;
    @FXML TextField txtNombre;
    @FXML TextField txtApellido;
    @FXML TextField txtEdad;
    @FXML TextField txtCorreo;
    @FXML ComboBox<String> cbEstadoCivil;
    @FXML ComboBox<String> cbCargo;
    @FXML RadioButton rbMedioTiempo;
    @FXML RadioButton rbTiempoCompleto;
    @FXML TextArea txtObservaciones;

    @FXML TableView<Trabajador> tablaTrabajadores;
    @FXML TableColumn<Trabajador, String> colCedula;
    @FXML TableColumn<Trabajador, String> colNombre;
    @FXML TableColumn<Trabajador, String> colApellido;
    @FXML TableColumn<Trabajador, Integer> colEdad;
    @FXML TableColumn<Trabajador, String> colCorreo;
    @FXML TableColumn<Trabajador, String> colEstadoCivil;
    @FXML TableColumn<Trabajador, String> colJornada;
    @FXML TableColumn<Trabajador, String> colCargo;

    TrabajadorDAO dao = new TrabajadorDAO();
    ToggleGroup grupoJornada = new ToggleGroup();

    @FXML
    public void initialize() {
        rbMedioTiempo.setToggleGroup(grupoJornada);
        rbTiempoCompleto.setToggleGroup(grupoJornada);

        cbEstadoCivil.setItems(FXCollections.observableArrayList("Soltero", "Casado", "Divorciado", "Viudo"));
        cbCargo.setItems(FXCollections.observableArrayList("Operativo", "Administrativo", "Gerencial"));

        colCedula.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));
        colCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        colEstadoCivil.setCellValueFactory(new PropertyValueFactory<>("estadoCivil"));
        colJornada.setCellValueFactory(new PropertyValueFactory<>("jornada"));
        colCargo.setCellValueFactory(new PropertyValueFactory<>("cargo"));

        cargarTabla();
    }

    public void cargarTabla() {
        List<Trabajador> lista = dao.listarTodos();
        tablaTrabajadores.setItems(FXCollections.observableArrayList(lista));
    }

    @FXML
    public void btnGuardar() {
        if (camposVacios()) {
            new Alert(Alert.AlertType.WARNING, "Todos los campos son obligatorios").showAndWait();
            return;
        }

        if (!txtEdad.getText().matches("\\d+") || Integer.parseInt(txtEdad.getText()) <= 5) {
            new Alert(Alert.AlertType.WARNING, "La edad debe ser numérica y mayor a 5").showAndWait();
            return;
        }

        if (!txtCorreo.getText().contains("@")) {
            new Alert(Alert.AlertType.WARNING, "El correo debe contener @").showAndWait();
            return;
        }

        if (!txtCedula.getText().matches("\\d+")) {
            new Alert(Alert.AlertType.WARNING, "La cédula debe contener solo números").showAndWait();
            return;
        }

        Trabajador t = new Trabajador(
                txtCedula.getText(),
                txtNombre.getText(),
                txtApellido.getText(),
                Integer.parseInt(txtEdad.getText()),
                txtCorreo.getText(),
                cbEstadoCivil.getValue(),
                obtenerJornada(),
                cbCargo.getValue()
        );

        dao.guardar(t);
        cargarTabla();
        limpiarCampos();
        new Alert(Alert.AlertType.INFORMATION, "Trabajador guardado").showAndWait();
    }

    @FXML
    public void btnActualizar() {
        Trabajador t = new Trabajador(
                txtCedula.getText(),
                txtNombre.getText(),
                txtApellido.getText(),
                Integer.parseInt(txtEdad.getText()),
                txtCorreo.getText(),
                cbEstadoCivil.getValue(),
                obtenerJornada(),
                cbCargo.getValue()
        );

        dao.actualizar(t);
        cargarTabla();
        limpiarCampos();
        new Alert(Alert.AlertType.INFORMATION, "Trabajador actualizado").showAndWait();
    }

    @FXML
    public void btnEliminar() {
        Alert confirmacion = new Alert(Alert.AlertType.CONFIRMATION, "¿Eliminar este trabajador?");
        confirmacion.showAndWait().ifPresent(respuesta -> {
            if (respuesta == ButtonType.OK) {
                dao.eliminar(txtCedula.getText());
                cargarTabla();
                limpiarCampos();
            }
        });
    }

    @FXML
    public void btnLimpiar() {
        limpiarCampos();
    }

    @FXML
    public void seleccionarFila() {
        Trabajador t = tablaTrabajadores.getSelectionModel().getSelectedItem();
        if (t != null) {
            txtCedula.setText(t.getCedula());
            txtNombre.setText(t.getNombre());
            txtApellido.setText(t.getApellido());
            txtEdad.setText(String.valueOf(t.getEdad()));
            txtCorreo.setText(t.getCorreo());
            cbEstadoCivil.setValue(t.getEstadoCivil());
            cbCargo.setValue(t.getCargo());

            if (t.getJornada().equals("Medio tiempo")) {
                rbMedioTiempo.setSelected(true);
            } else {
                rbTiempoCompleto.setSelected(true);
            }
        }
    }

    private String obtenerJornada() {
        return rbMedioTiempo.isSelected() ? "Medio tiempo" : "Tiempo completo";
    }

    private boolean camposVacios() {
        return txtCedula.getText().isEmpty() || txtNombre.getText().isEmpty() ||
                txtApellido.getText().isEmpty() || txtEdad.getText().isEmpty() ||
                txtCorreo.getText().isEmpty() || cbEstadoCivil.getValue() == null ||
                cbCargo.getValue() == null;
    }

    private void limpiarCampos() {
        txtCedula.clear();
        txtNombre.clear();
        txtApellido.clear();
        txtEdad.clear();
        txtCorreo.clear();
        cbEstadoCivil.setValue(null);
        cbCargo.setValue(null);
        grupoJornada.selectToggle(null);
    }



}
