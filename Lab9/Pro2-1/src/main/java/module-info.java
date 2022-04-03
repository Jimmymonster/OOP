module com.example.pro21 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pro21 to javafx.fxml;
    exports com.example.pro21;
}