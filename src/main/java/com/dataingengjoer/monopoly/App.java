package com.dataingengjoer.monopoly;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        FXMLLoader loader = new FXMLLoader(
              getClass().getResource("/com.dataingengjoer.monopoly/ui/main/MainView.fxml")
        );

        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
	        throw new RuntimeException(e);
        }

        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Monopoly");
        stage.show();
    }

    static void main( String[] args ) {
        launch(args);
    }
}
