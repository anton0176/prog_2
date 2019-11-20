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

import javax.xml.soap.Text;
import java.util.ArrayList;

public class Kalk extends Application implements EventHandler<ActionEvent> {

    TextField inputField;
    TextField outputField;
    ArrayList<Button> numpad;
    GridPane numpadLayout;
    HBox utilContainer;
    BorderPane mainLayout;
    VBox displayLayout;


    String tal1;
    String operation;
    String tal2;

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


    public static void main(String[] args) {
        launch(args);
    }
    @Override

    public void start(Stage primaryStage) throws Exception {

        knappar();
        displayLayout.getChildren().add(inputField);

        mainLayout.setTop(displayLayout);
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
        numpadLayout.add(knappen0, 0, 3);
        Scene scene = new Scene(mainLayout, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
        private void knappar(){
            knappen1 = new Button("1");
            knappen1.setMinHeight(30);
            knappen1.setMinWidth(30);
            knappen1.setOnAction(this);

            knappen2 = new Button("2");
            knappen2.setMinHeight(30);
            knappen2.setMinWidth(30);
            knappen2.setOnAction(this);


            knappen3 = new Button("3");
            knappen3.setMinHeight(30);
            knappen3.setMinWidth(30);
            knappen3.setOnAction(this);


            knappen4 = new Button("4");
            knappen4.setMinHeight(30);
            knappen4.setMinWidth(30);
            knappen4.setOnAction(this);


            knappen5 = new Button("5");
            knappen5.setMinHeight(30);
            knappen5.setMinWidth(30);
            knappen5.setOnAction(this);

            knappen6 = new Button("6");
            knappen6.setMinHeight(30);
            knappen6.setMinWidth(30);
            knappen6.setOnAction(this);

            knappen7 = new Button("7");
            knappen7.setMinHeight(30);
            knappen7.setMinWidth(30);
            knappen7.setOnAction(this);

            knappen8 = new Button("8");
            knappen8.setMinHeight(30);
            knappen8.setMinWidth(30);
            knappen8.setOnAction(this);

            knappen9 = new Button("9");
            knappen9.setMinHeight(30);
            knappen9.setMinWidth(30);
            knappen9.setOnAction(this);

            knappen0 = new Button("0");
            knappen0.setMinHeight(30);
            knappen0.setMinWidth(30);
            knappen0.setOnAction(this);

            inputField = new TextField();
            numpad = new ArrayList<Button>();
            numpadLayout = new GridPane();
            utilContainer = new HBox();
            displayLayout = new VBox();
            mainLayout = new BorderPane();
        }





    @Override
    public void handle(ActionEvent event) {

    }
}