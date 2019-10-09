import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Kalk extends Application implements EventHandler<ActionEvent> {
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
    private Stage stage;


    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

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


        Group root = new Group();
        knappen1.setTranslateX(0);

        knappen2.setTranslateX(100);
        knappen3.setTranslateX(200);

        knappen4.setTranslateX(0);
        knappen4.setTranslateY(50);

        knappen5.setTranslateY(50);
        knappen5.setTranslateX(100);

        knappen6.setTranslateY(50);
        knappen6.setTranslateX(200);

        knappen7.setTranslateY(100);
        knappen7.setTranslateX(0);

        knappen8.setTranslateY(100);
        knappen8.setTranslateX(100);

        knappen9.setTranslateY(100);
        knappen9.setTranslateX(200);

        knappen0.setTranslateY(150);
        knappen0.setTranslateX(100);

        root.getChildren().add(knappen1);
        root.getChildren().add(knappen2);
        root.getChildren().add(knappen3);
        root.getChildren().add(knappen4);
        root.getChildren().add(knappen5);
        root.getChildren().add(knappen6);
        root.getChildren().add(knappen7);
        root.getChildren().add(knappen8);
        root.getChildren().add(knappen9);
        root.getChildren().add(knappen0);






        Scene scene = new Scene(root, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    @Override
    public void handle(ActionEvent event) {

    }
}