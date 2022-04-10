package com.example.pro26;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FanPane pane = new FanPane();

        Button btPause = new Button("Pause");
        Button btResume = new Button("Resume");
        Button btReverse = new Button("Reverse");
        btPause.setOnAction(e->{ pane.pause();});
        btResume.setOnAction(e->{pane.play();});
        btReverse.setOnAction(e->{pane.reverse();});

        HBox hbox = new HBox(5);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(btPause,btResume,btReverse);

        Slider slider = new Slider();
        slider.setValue(100);
        slider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    public void changed(ObservableValue <? extends Number >
                                                observable, Number oldValue, Number newValue)
                    {
                       pane.setSpinRate((double)newValue);
                    }
                });
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setTop(hbox);
        borderPane.setBottom(slider);


        Scene scene = new Scene(borderPane, 300, 300);
        stage.setTitle("Fan!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}