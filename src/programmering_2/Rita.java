package programmering_2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.*;




public class Rita extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle();

        circle.setCenterX(300);
        circle.setCenterY(135);
        circle.setRadius(100);
        circle.setFill(Color.RED);

       Group root = new Group(circle);

        Scene scene = new Scene(root, 600, 300);

        primaryStage.setTitle("Drwaing a circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
