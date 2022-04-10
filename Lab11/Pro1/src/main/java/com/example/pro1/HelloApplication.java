package com.example.pro1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;

public class HelloApplication extends Application {
    TextField annualInterestRate = new TextField();
    TextField NumberofYears = new TextField();
    TextField LoanAmount = new TextField();
    TextField MonthlyPayment = new TextField();
    TextField TotalPayment = new TextField();
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane borderPane = new BorderPane();

        Button save = new Button("Save");
        save.setOnAction(e->{save();});
        Button load = new Button("Load");
        load.setOnAction(e->{load();});
        Button clear = new Button("Clear");
        clear.setOnAction(e-> {clear();});
        Button calculate = new Button("Calculate");
        calculate.setOnAction(e->{calculate();});

        VBox vbox = new VBox(5);
        HBox[] hbox = {
                new HBox(20,new Label("Annual Interest Rate:  "),annualInterestRate),
                new HBox(20,new Label("Number of Years:       "),NumberofYears),
                new HBox(20,new Label("Loan Amount:            "),LoanAmount),
                new HBox(20,new Label("Monthly Payment:      "),MonthlyPayment),
                new HBox(20,new Label("Total Payment:           "),TotalPayment),
                new HBox(10,save,load,new Label("                 "),clear,calculate)
        };
        for(int i=0;i<6;i++){
            hbox[i].setAlignment(Pos.CENTER);
            vbox.getChildren().add(hbox[i]);
        }
        vbox.setAlignment(Pos.CENTER);
        borderPane.setCenter(vbox);

        Scene scene = new Scene(borderPane, 480, 360);
        stage.setTitle("Loan Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    public void save(){
        File file = new File("loan.dat");
        try {
            PrintWriter output = new PrintWriter(file);
            output.println(annualInterestRate.getText());
            output.println(NumberofYears.getText());
            output.println(LoanAmount.getText());
            output.close();
        }catch(IOException e){
            System.out.println("Error while creating file.");
        }
    }
    public void load(){
        File file = new File("loan.dat");
        try{
            Scanner in = new Scanner(file);
            annualInterestRate.setText(in.next());
            NumberofYears.setText(in.next());
            LoanAmount.setText(in.next());
            MonthlyPayment.setText("");
            TotalPayment.setText("");
        }catch(IOException e){
            System.out.println("File is not found!!!");
        }
    }
    public void clear(){
        annualInterestRate.setText("");
        NumberofYears.setText("");
        LoanAmount.setText("");
        MonthlyPayment.setText("");
        TotalPayment.setText("");
    }
    public void calculate(){
        double monthlyInterestRate = Double.parseDouble(annualInterestRate.getText())/1200.0;
        double monthysum=Double.parseDouble(LoanAmount.getText())*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate, Double.parseDouble(NumberofYears.getText())*12)));
        double total= monthysum*Double.parseDouble(NumberofYears.getText())*12;
        monthysum = Math.round(monthysum*100.0)/100.0;
        total = Math.round(total*100.0)/100.0;
        MonthlyPayment.setText(monthysum+"");
        TotalPayment.setText(total+"");
    }
}