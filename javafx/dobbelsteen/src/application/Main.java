package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
		
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Parent root = FXMLLoader.load(getClass().getResource("build.fxml"));
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("dobbelsteen");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
