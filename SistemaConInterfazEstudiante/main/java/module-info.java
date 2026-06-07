module com.example.sistemaconinterfazestudiante {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires jdk.jshell;

    opens com.example.sistemaconinterfazestudiante to javafx.fxml;
    exports com.example.sistemaconinterfazestudiante;
}