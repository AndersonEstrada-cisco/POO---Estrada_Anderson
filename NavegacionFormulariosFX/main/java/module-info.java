module com.example.navegacionforumulariosfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.navegacionforumulariosfx to javafx.fxml;
    exports com.example.navegacionforumulariosfx;
}