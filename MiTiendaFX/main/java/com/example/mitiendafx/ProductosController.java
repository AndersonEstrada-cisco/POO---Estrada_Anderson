package com.example.mitiendafx;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.collections.FXCollections;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.collections.ObservableList;

public class ProductosController {

    @FXML
    TextField txtCodigo, txtProducto, txtPrecio, txtStock;
    @FXML
    ComboBox<String> cmbCategoria;
    @FXML ComboBox<String> cmbEstado;


    @FXML private TableView<Producto> tablaProductos;
    @FXML private TableColumn<Producto,String> colCodigo;
    @FXML private TableColumn<Producto,String> colNombre;
    @FXML private TableColumn<Producto,String> colCategoria;
    @FXML private TableColumn<Producto,String> colPrecio;
    @FXML private TableColumn<Producto,String> colStock;
    @FXML private TableColumn<Producto,String> colEstado;

    private ObservableList<Producto> listaProductos = FXCollections.observableArrayList();




    public void initialize() {

        //TABLA
        colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
        colStock.setCellValueFactory(new PropertyValueFactory<>("stock"));
        colEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));

        tablaProductos.setItems(listaProductos);

        //COMBOBOX
        cmbCategoria.getItems().add("Electrónicos");
        cmbCategoria.getItems().add("Ropa");

        cmbEstado.getItems().add("Activo");
        cmbEstado.getItems().add("Inactivo");

        tablaProductos.getSelectionModel().selectedItemProperty().addListener((obs, oldSel, p) -> {
            if (p != null) {
                txtCodigo.setText(p.getCodigo());
                txtProducto.setText(p.getNombre());
                cmbCategoria.setValue(p.getCategoria());
                txtPrecio.setText(p.getPrecio());
                txtStock.setText(p.getStock());
                cmbEstado.setValue(p.getEstado());
            }
        });
    }


    @FXML
    public void btnGuardar() {

        if (cmbCategoria.getValue() == null || cmbEstado.getValue() == null ||
                txtCodigo.getText().isEmpty() ||
                txtProducto.getText().isEmpty() ||
                txtPrecio.getText().isEmpty() ||
                txtStock.getText().isEmpty()) {
            return;
        }

        Producto p = new Producto(
                txtCodigo.getText(),
                txtProducto.getText(),
                cmbCategoria.getValue(),
                txtPrecio.getText(),
                txtStock.getText(),
                cmbEstado.getValue()
        );

        listaProductos.add(p);
    }

    @FXML
    public void btnNuevo() {
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtCodigo.clear();
        txtProducto.clear();
        txtPrecio.clear();
        txtStock.clear();

        cmbCategoria.setValue(null);
        cmbEstado.setValue(null);

        tablaProductos.getSelectionModel().clearSelection();
    }

    @FXML
    public void btnActualizar() {

        Producto seleccionado = tablaProductos.getSelectionModel().getSelectedItem();

        if (seleccionado != null) {

            seleccionado.setCodigo(txtCodigo.getText());
            seleccionado.setNombre(txtProducto.getText());
            seleccionado.setCategoria(cmbCategoria.getValue());
            seleccionado.setPrecio(txtPrecio.getText());
            seleccionado.setStock(txtStock.getText());
            seleccionado.setEstado(cmbEstado.getValue());

            tablaProductos.refresh();
            limpiarCampos();
        }
    }

    @FXML
    public void btnEliminar() {

        Producto seleccionado = tablaProductos.getSelectionModel().getSelectedItem();

        if (seleccionado != null) {
            listaProductos.remove(seleccionado);
            limpiarCampos();
        }
    }




}
