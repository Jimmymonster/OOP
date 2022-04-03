package com.example.demo;

import javafx.application.Application;
import javafx.application.Preloader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;

import java.io.IOException;

public class LoanGUI extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TextField LoanAmount = new TextField();
        TextField NumberOfYears = new TextField();
        TextArea textArea = new TextArea();
        NumberOfYears.setPrefColumnCount(2);
        LoanAmount.setPrefColumnCount(7);
        textArea.setPrefColumnCount(30);

        Button ShowTable = new Button("Show Table");

        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(new Label("Loan Amount"), LoanAmount, new Label("Number of Years"), NumberOfYears, ShowTable);

        ScrollPane scrollPane = new ScrollPane(textArea);

        BorderPane pane = new BorderPane();
        pane.setTop(hbox);
        pane.setCenter(textArea);

        ShowTable.setOnAction(event -> {
            String text;
            double monthlyInterestRate;
            double monthlyPayment;
            String Loanamount = LoanAmount.getText();
            String Numberofyears = NumberOfYears.getText();
            if (!checkNum(Loanamount)) {
                text = "Error: Loan amount must input number\n";
            } else if (!checkNum(Numberofyears)) {
                text = "Error: Number of years must input number\n";
            } else {
                text = "Interest Rate       Monthly Payment          Total Payment\n";
                for (double i = 5.0; i <= 8.0; i += 0.25) {
                    monthlyInterestRate = i / 1200;
                    monthlyPayment = Double.parseDouble(Loanamount) * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, Double.parseDouble(Numberofyears) * 12));
                    text += String.format("%-24.3f%-34.2f%-8.2f\n", i, monthlyPayment, (monthlyPayment * 12) * Double.parseDouble(Numberofyears));
                }
            }
            textArea.setText(text);
        });

        Scene scene = new Scene(pane, 600, 240);
        stage.setTitle("LoanGUI");
        stage.setScene(scene);
        stage.show();
    }

    public boolean checkNum(String st) {
        for (int i = 0; i < st.length(); i++) {
            if (!(st.charAt(i) >= '0' && st.charAt(i) <= '9')) {
                System.out.println("Input must be number");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        launch(args);
    }
}