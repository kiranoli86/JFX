package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.*;

public class Main extends Application {



    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root,Color.DARKCYAN);
        stage.setTitle("JavaFX");
        stage.setScene(scene);
        Image icon = new Image("");
        stage.getIcons().add(icon);

        stage.show();
    }
}
