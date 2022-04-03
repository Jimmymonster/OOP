package com.example.pro22;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TextField[][] textField = new TextField[11][11];
        GridPane pane = new GridPane();
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                textField[i][j] = new TextField();
                textField[i][j].setText((int)(Math.random()*2)+"");
                pane.add(textField[i][j],i,j);
            }
        }
        Scene scene= new Scene(pane,800,400);
        stage.setTitle("Display Random");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}