module com.example.pro24 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pro24 to javafx.fxml;
    exports com.example.pro24;
}