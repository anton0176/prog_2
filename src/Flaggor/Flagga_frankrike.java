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

public class Flagga_frankrike extends Application {



    @Override
    public void start(Stage primaryStage) {
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
        primaryStage.setTitle("Drwaing a circle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
