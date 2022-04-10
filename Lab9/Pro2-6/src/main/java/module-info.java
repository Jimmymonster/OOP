module com.example.pro26 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pro26 to javafx.fxml;
    exports com.example.pro26;
}