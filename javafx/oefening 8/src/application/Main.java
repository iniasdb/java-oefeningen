package application;
	

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("punten ingeven");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void stop() throws IOException{
		Controller.writeToFile();
	}
}
