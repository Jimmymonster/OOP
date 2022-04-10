module com.example.pro25 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pro25 to javafx.fxml;
    exports com.example.pro25;
}