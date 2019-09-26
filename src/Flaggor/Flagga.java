package Flaggor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import static javafx.scene.paint.Color.RED;

public class Flagga extends Application {



    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        root.setTop(getTopLabel());
        root.setBottom(new Label("Bottom"));
        root.setLeft(new Label("Left"));
        root.setRight(new Label("Right"));
        root.setCenter(new Label("Center"));

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Hbox,Pane");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
        public Label getTopLabel()
    {
            Label lbl = new Label("Top Label");


            lbl.setStyle("-fx-border-style: dotted; -fx-border-width: 0 0 1 0; -fx-background-color:#0000FF;-fx-font-weight:bold;");

            lbl.setPrefHeight(60);
            lbl.setPrefWidth(100);



            return lbl;
    }




    public static void main(String[] args) {
        launch(args);
    }
}
