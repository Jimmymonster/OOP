package com.example.pro24;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Carpane pane = new Carpane();
        pane.setOnMousePressed(e->pane.pause());
        pane.setOnMouseReleased(e-> pane.play());
        pane.setOnKeyPressed(e->{
            if(e.getCode()== KeyCode.UP){
                pane.increaseSpeed(1);
            }
            else if(e.getCode()==KeyCode.DOWN){
                pane.decreaseSpeed(1);
            }
        });
        Scene scene = new Scene(pane, 600, 100);
        stage.setTitle("Car!");
        stage.setScene(scene);
        stage.show();

        pane.requestFocus();
    }

    public static void main(String[] args) {
        launch();
    }
}