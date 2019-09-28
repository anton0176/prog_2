package Flaggor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Stack;

public class Flagga_Sverige extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Rectangle yellow2 = new Rectangle();
        Rectangle yellow3 = new Rectangle();
        Rectangle blue = new Rectangle();
        blue.setHeight(300);
        blue.setWidth(600);
        blue.setFill(Color.BLUE);


        yellow2.setHeight(300);
        yellow2.setWidth(50);
        yellow2.setFill(Color.YELLOW);
        yellow2.setTranslateX(-100);



        yellow3.setWidth(600);
        yellow3.setHeight(50);
        yellow3.setFill(Color.YELLOW);


        StackPane flagg= new StackPane(blue);
        flagg.getChildren().addAll(yellow2,yellow3);



        Scene scene = new Scene(flagg,600,300);

        primaryStage.setTitle("Drwaing a circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
