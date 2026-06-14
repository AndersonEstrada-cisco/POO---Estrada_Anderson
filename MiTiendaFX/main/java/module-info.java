module com.example.mitiendafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mitiendafx to javafx.fxml;
    exports com.example.mitiendafx;
}