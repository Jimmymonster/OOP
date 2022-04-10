package com.example.pro23;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        HBox pane = new HBox(10);
        pane.setPadding(new Insets(0, 20, 20, 0));
        ClockPane clock = new ClockPane(4, 20, 45);
        pane.getChildren().addAll(clock);
        Scene scene = new Scene(pane);
        stage.setTitle("ClockPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}