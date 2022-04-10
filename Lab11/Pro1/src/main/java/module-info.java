module com.example.pro1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pro1 to javafx.fxml;
    exports com.example.pro1;
}