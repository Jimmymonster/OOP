package com.example.pro21;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane pane = new GridPane();
        FileInputStream input = new FileInputStream("D:\\KMITL\\Year1 2nd\\OOP\\Lab9\\Pro2-1\\src\\main\\resources\\Image\\test.jpg");
        Image image = new Image(input);
        ImageView imageview = new ImageView(image);

        pane.add(imageview, 0, 0);
        Scene scene = new Scene(pane, 1200, 900);
        stage.setTitle("Image");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}