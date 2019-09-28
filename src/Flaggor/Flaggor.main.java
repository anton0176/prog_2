package programmering_2;

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

public class Flaggor3 extends Application {

    Button knapp1;
    Button knapp2;
    Button knapp3;
    Button knapp4;


    private Stage STAGE;


    public static void main(String[] args) {


    }

    @Override
    public void start(Stage primaryStage) {
        STAGE = primaryStage;

        knapp1 = new Button("Sverige");
        knapp1.setMinHeight(30);
        knapp1.setMinWidth(30);
        knapp1.setOnAction(this);

        knapp2 = new Button("Frankrike");
        knapp2.setMinHeight(30);
        knapp2.setMinWidth(30);
        knapp2.setOnAction(this);

        knapp3 = new Button("Tyskland");
        knapp3.setMinHeight(30);
        knapp3.setMinWidth(30);
        knapp3.setOnAction(this);

        knapp4 = new Button("Norge");
        knapp4.setMinHeight(30);
        knapp4.setMinWidth(30);
        knapp4.setOnAction(this);

        Group root = new Group();

        knapp1.setTranslateX(0);
        knapp1.setTranslateX(50);
        knapp1.setTranslateX(100);
        knapp1.setTranslateX(150);



        root.getChildren().add(knapp1);
        root.getChildren().add(knapp2);
        root.getChildren().add(knapp3);
        root.getChildren().add(knapp4);

        Scene scene = new Scene(root, 200, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
