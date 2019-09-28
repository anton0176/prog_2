package Flaggor;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import sun.plugin.dom.css.Rect;

public class test extends Application implements EventHandler<ActionEvent> {
    Button knappen;
    Button knappen2;
    Button knappen3;
    Button knappen4;
    Button knappen5;
    public static void main(String[] args) {
        launch(args);
    }

    private Stage wooh;

    @Override
    public void start(Stage primaryStage) throws Exception {
        wooh = primaryStage;

        knappen = new Button("Frankrike");
        knappen.setMinHeight(30);
        knappen.setMinWidth(30);
        knappen.setOnAction(this);

        knappen2 = new Button("Sverige");
        knappen2.setMinHeight(30);
        knappen2.setMinWidth(30);
        knappen2.setOnAction(this);


        knappen3 = new Button("Tyskland");
        knappen3.setMinHeight(30);
        knappen3.setMinWidth(30);
        knappen3.setOnAction(this);


        knappen4 = new Button("Norge");
        knappen4.setMinHeight(30);
        knappen4.setMinWidth(30);
        knappen4.setOnAction(this);


        knappen5 = new Button("libyen");
        knappen5.setMinHeight(30);
        knappen5.setMinWidth(30);
        knappen5.setOnAction(this);


        Group root = new Group();
        knappen.setTranslateX(0);
        knappen2.setTranslateX(100);
        knappen3.setTranslateX(200);
        knappen4.setTranslateX(300);
        knappen5.setTranslateX(400);

        root.getChildren().add(knappen);
        root.getChildren().add(knappen2);
        root.getChildren().add(knappen3);
        root.getChildren().add(knappen4);
        root.getChildren().add(knappen5);

        Scene scene = new Scene(root, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        // TODO Auto-generated method stub

        if (event.getSource() == knappen)
        {
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
            wooh.setTitle("Drwaing a circle");
            wooh.setScene(scene);
            wooh.show();
        }
        else if (event.getSource() == knappen2) {
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

            wooh.setTitle("Flaggor");
            wooh.setScene(scene);
            wooh.show();
        }
        else if (event.getSource() == knappen3){

        }
        else if (event.getSource() == knappen4){}







        else if (event.getSource() == knappen5){
            Rectangle green = new Rectangle();
            green.setHeight(300);
            green.setWidth(600);
            green.setFill(Color.GREEN);

            StackPane flagg= new StackPane();
            flagg.getChildren().add(green);
            Scene scene = new Scene(flagg,600,300);

            wooh.setTitle("Flaggor");
            wooh.setScene(scene);
            wooh.show();
             }
        }

    }


