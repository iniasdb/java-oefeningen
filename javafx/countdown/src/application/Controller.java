package application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class Controller {
	
	private Timeline tl;
	public Label time;
	int x = 120;
	
	public void initialize() {
		time.setText(String.valueOf(x));
		tl = new Timeline(new KeyFrame(Duration.seconds(1.0), ob -> {
			if (x > 0) {
				if (x <= 11) {
					time.getStyleClass().add("red");
				}
				x--;
				time.setText(String.valueOf(x));
			}

		}));
		tl.setCycleCount(10);
	}
	
	public void startCountdown() {
		tl.playFromStart();
	}
}
