module org.example.sistemaaprendizajejava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.sistemaaprendizajejava to javafx.fxml;
    exports org.example.sistemaaprendizajejava;
}