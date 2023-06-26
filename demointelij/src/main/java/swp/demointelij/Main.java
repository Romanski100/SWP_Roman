package swp.demointelij;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends Application {

    public static final String FILE1_PATH = "file1.txt";
    public static final String FILE2_PATH = "file2.txt";

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Text File Loader");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();

        Controller controller = loader.getController();
        controller.initialize();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
