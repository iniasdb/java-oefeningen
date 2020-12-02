package application;

import java.io.IOException;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controller {
	//public ImageView one;
	public ImageView two;
	public ImageView three;
	public ImageView one = new ImageView();
	public Doos doos;
	public Label tWon;
	
	int timesWon = 0;
	int timesRolled = 0;
	boolean playing = true;
	
	public TextField leeftijd;
	public Label errorMessage;
	
	private Timeline tl;
	public Label time;
	int remaining = 60;
	
	public void initialize() {
		doos = new Doos();
		
		time.setText(String.valueOf(remaining));
		tl = new Timeline(new KeyFrame(Duration.seconds(1.0), ob -> {
			if (remaining > 0) {
				if (remaining <= 11) {
					time.getStyleClass().add("red");
				}
				remaining--;
				time.setText(String.valueOf(remaining));
			}

		}));
		tl.setCycleCount(10);
	}
	
	public void verify(ActionEvent event) throws IOException {
		int age = Integer.valueOf(leeftijd.getText());
		
		if (age < 18) {
			errorMessage.setText("U moet 18 of ouder zijn");
		} else {
			Stage secondaryStage = new Stage();
			Parent rootTwo = FXMLLoader.load(getClass().getResource("sample.fxml"));
			secondaryStage.setScene(new Scene(rootTwo));
			secondaryStage.setTitle("dobbelsteen");
			secondaryStage.show();
		}
		
	}
	
	public void roll(ActionEvent event) {
		if (playing) {
			if (timesRolled == 0) {
				tl.playFromStart();
			}
			
			doos.schud();
			int d1 = doos.dob1.getAmountOfEyes();
			int d2 = doos.dob2.getAmountOfEyes();
			int d3 = doos.dob3.getAmountOfEyes();

			try {
				one.setImage(new Image("application/dobbelstenen/" + d1 + ".jpg"));
				two.setImage(new Image("application/dobbelstenen/" + d2 + ".jpg"));
				three.setImage(new Image("application/dobbelstenen/" +d3+ ".jpg"));
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			if (d1 == d2 && d2 == d3) {
				timesWon++;
				tWon.setText(Integer.toString(timesWon));
			}
			
			if (timesWon == 3) {
				tl.stop();
				tWon.setText("You won");
				playing = false;
			} else if (remaining <= 0) {
				playing = false;
			}
			
			timesRolled++;

		} else {
			time.setText("tijd is op");
		}
	}
}
