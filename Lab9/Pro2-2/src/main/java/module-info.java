module com.example.pro22 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pro22 to javafx.fxml;
    exports com.example.pro22;
}