module com.example.pro23 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pro23 to javafx.fxml;
    exports com.example.pro23;
}