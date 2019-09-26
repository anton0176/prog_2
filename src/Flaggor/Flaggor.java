package Flaggor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Flaggor extends Application {
    Stage primaryStage = new Stage();


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Frankrike();
        //Belgien();

    }

    public void Frankrike() {
        Rectangle bla = new Rectangle();
        bla.setHeight(300);
        bla.setWidth(200);
        bla.setFill(Color.BLUE);

        Rectangle red = new Rectangle();
        red.setHeight(300);
        red.setWidth(200);
        red.setFill(Color.RED);

        BorderPane fra = new BorderPane();
        Scene scene = new Scene(fra,600,300);
        fra.setLeft(bla);
        fra.setRight(red);


        primaryStage.setTitle("Flagga");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void Belgien() {
        Rectangle bla = new Rectangle();
        bla.setHeight(300);
        bla.setWidth(200);
        bla.setFill(Color.BLACK);

        Rectangle red = new Rectangle();
        red.setHeight(300);
        red.setWidth(200);
        red.setFill(Color.RED);

        Rectangle yellow = new Rectangle();
        yellow.setHeight(300);
        yellow.setWidth(200);
        yellow.setFill(Color.YELLOW);


        BorderPane fra = new BorderPane();
        Scene scene = new Scene(fra,600,300);
        fra.setLeft(bla);
        fra.setRight(red);
        fra.setCenter(yellow);


        primaryStage.setTitle("Flagga");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
}
