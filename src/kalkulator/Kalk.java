package Calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import javax.xml.soap.Text;
import java.util.ArrayList;



public class Kalk extends Application implements EventHandler<ActionEvent> {

    public static TextField inputField = new TextField();
    public static TextField outputField  = new TextField();


    ArrayList<Button> numpad;
    GridPane numpadLayout;
    HBox utilContainer;
    BorderPane mainLayout;

    String _expression;
    String nummer;

    Button knappen1;
    Button knappen2;
    Button knappen3;
    Button knappen4;
    Button knappen5;
    Button knappen6;
    Button knappen7;
    Button knappen8;
    Button knappen9;
    Button knappen0;
    Button knappenlika;
    Button knappendelete;
    Button knappenplus;
    Button knappenminus;
    Button knappenmulti;
    Button knappendiv;
    Button knappenpunkt;


    public static void main(String[] args) {
        launch(args);
    }
    @Override

    public void start(Stage primaryStage) throws Exception {

        knappar();
        outputField.setDisable(true);
        inputField.setDisable(true);
        outputField.setPrefHeight(50);
        inputField.setPrefHeight(100);
        inputField.setStyle("-fx-font: 20 arial;");
        outputField.setStyle("-fx-font: 20 arial;");

        mainLayout.setTop(inputField);
        mainLayout.setRight(outputField);
        mainLayout.setCenter(numpadLayout);
        mainLayout.setBottom(utilContainer);

        numpadLayout.add(knappen1, 0, 0);
        numpadLayout.add(knappen2, 1, 0);
        numpadLayout.add(knappen3, 2, 0);
        numpadLayout.add(knappen4, 0, 1);
        numpadLayout.add(knappen5, 1, 1);
        numpadLayout.add(knappen6, 2, 1);
        numpadLayout.add(knappen7, 0, 2);
        numpadLayout.add(knappen8, 1, 2);
        numpadLayout.add(knappen9, 2, 2);
        numpadLayout.add(knappen0, 1, 3);
        numpadLayout.add(knappenlika,1,4);
        numpadLayout.add(knappendelete,2,3);
        numpadLayout.add(knappenplus,3,0);
        numpadLayout.add(knappenminus,3,1);
        numpadLayout.add(knappenmulti,3,2);
        numpadLayout.add(knappendiv,3,3);
        numpadLayout.add(knappenpunkt,0,3);

        Scene scene = new Scene(mainLayout, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
        private void knappar(){
            knappen1 = new Button("1");
            knappen1.setMinHeight(60);
            knappen1.setMinWidth(60);
            knappen1.setOnAction(this);

            knappen2 = new Button("2");
            knappen2.setMinHeight(60);
            knappen2.setMinWidth(60);
            knappen2.setOnAction(this);


            knappen3 = new Button("3");
            knappen3.setMinHeight(60);
            knappen3.setMinWidth(60);
            knappen3.setOnAction(this);


            knappen4 = new Button("4");
            knappen4.setMinHeight(60);
            knappen4.setMinWidth(60);
            knappen4.setOnAction(this);


            knappen5 = new Button("5");
            knappen5.setMinHeight(60);
            knappen5.setMinWidth(60);
            knappen5.setOnAction(this);

            knappen6 = new Button("6");
            knappen6.setMinHeight(60);
            knappen6.setMinWidth(60);
            knappen6.setOnAction(this);

            knappen7 = new Button("7");
            knappen7.setMinHeight(60);
            knappen7.setMinWidth(60);
            knappen7.setOnAction(this);

            knappen8 = new Button("8");
            knappen8.setMinHeight(60);
            knappen8.setMinWidth(60);
            knappen8.setOnAction(this);

            knappen9 = new Button("9");
            knappen9.setMinHeight(60);
            knappen9.setMinWidth(60);
            knappen9.setOnAction(this);

            knappen0 = new Button("0");
            knappen0.setMinHeight(60);
            knappen0.setMinWidth(60);
            knappen0.setOnAction(this);

            knappenlika = new Button("=");
            knappenlika.setMinHeight(60);
            knappenlika.setMinWidth(60);
            knappenlika.setOnAction(this);

            knappendelete = new Button("C");
            knappendelete.setMinHeight(60);
            knappendelete.setMinWidth(60);
            knappendelete.setOnAction(this);

            knappenplus = new Button("+");
            knappenplus.setMinHeight(60);
            knappenplus.setMinWidth(60);
            knappenplus.setOnAction(this);

            knappenminus = new Button("-");
            knappenminus.setMinHeight(60);
            knappenminus.setMinWidth(60);
            knappenminus.setOnAction(this);

            knappenmulti = new Button("*");
            knappenmulti.setMinHeight(60);
            knappenmulti.setMinWidth(60);
            knappenmulti.setOnAction(this);

            knappendiv = new Button("/");
            knappendiv.setMinHeight(60);
            knappendiv.setMinWidth(60);
            knappendiv.setOnAction(this);

            knappenpunkt = new Button(".");
            knappenpunkt.setMinHeight(60);
            knappenpunkt.setMinWidth(60);
            knappenpunkt.setOnAction(this);

            inputField = new TextField();
            numpad = new ArrayList<Button>();
            numpadLayout = new GridPane();
            utilContainer = new HBox();
            mainLayout = new BorderPane();


        }





    @Override
    public void handle(ActionEvent event) {

        if (event.getSource().equals(knappen1)) {
            inputField.appendText("1");
        }

        if (event.getSource().equals(knappen2)) {
            inputField.appendText("2");
        }

        if (event.getSource().equals(knappen3)) {
            inputField.appendText("3");
        }
        if (event.getSource().equals(knappen4)) {
            inputField.appendText("4");
        }
        if (event.getSource().equals(knappen5)) {
            inputField.appendText("5");
        }
        if (event.getSource().equals(knappen6)) {
            inputField.appendText("6");
        }
        if (event.getSource().equals(knappen7)) {
            inputField.appendText("7");
        }
        if (event.getSource().equals(knappen8)) {
            inputField.appendText("8");
        }
        if (event.getSource().equals(knappen9)) {
            inputField.appendText("9");
        }
        if (event.getSource().equals(knappen0)) {
            inputField.appendText("0");
        }
        if (event.getSource().equals(knappenplus)) {
            inputField.appendText("+");
        }
        if (event.getSource().equals(knappenminus)) {
            inputField.appendText("-");
        }
        if (event.getSource().equals(knappenmulti)) {
            inputField.appendText("*");
        }
        if (event.getSource().equals(knappendiv)) {
            inputField.appendText("/");
        }
        if (event.getSource().equals(knappendelete)) {
            inputField.clear();
            outputField.clear();
            _expression = "";
        }
        if (event.getSource().equals(knappenlika)) {
            _expression = inputField.textProperty().get();
            calculate();
        }
        if (event.getSource().equals(knappenpunkt)) {
            inputField.appendText(".");
        }
    }

    private void calculate() {

        if (_expression.contains("+"))
        {
            String[] talen = _expression.split("\\+");
            double tal1 = Double.parseDouble(talen[0]);
            double tal2 = Double.parseDouble(talen[1]);
            double  summa = tal1 + tal2;
            outputField.appendText(String.valueOf(summa));
        }
        else if (_expression.contains("-"))
        {
            String[] talen = _expression.split("\\-");
            double tal1 = Double.parseDouble(talen[0]);
            double tal2 = Double.parseDouble(talen[1]);
            double  summa = tal1 - tal2;
            outputField.appendText(String.valueOf(summa));
        }
        else if (_expression.contains("*"))
        {
            String[] talen = _expression.split("\\*");
            double tal1 = Double.parseDouble(talen[0]);
            double tal2 = Double.parseDouble(talen[1]);
            double  summa = tal1 * tal2;
            outputField.appendText(String.valueOf(summa));
        }
        else if (_expression.contains("/"))
        {
            String[] talen = _expression.split("\\/");
            double tal1 = Double.parseDouble(talen[0]);
            double tal2 = Double.parseDouble(talen[1]);
            double  summa = tal1 / tal2;
            outputField.appendText(String.valueOf(summa));

        }

    }


}