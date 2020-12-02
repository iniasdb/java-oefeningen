package application;


import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
	
	public ImageView image = new ImageView();
	public ListView<String> list = new ListView<String>();
	private String[] fruitArray = {"aardbei", "ajuin", "ananas", "appel", "asperge", "banaan", "broccoli", "druiven", "framboos", "kiwi", "mais", "meloen", "peer", "peper", "perzik", "pickle", "pompelmoes", "tomaat", "watermeloen", "wortel"};
	
	public void initialize() {
		for (int i = 0; i < fruitArray.length; i++) {
			list.getItems().add(fruitArray[i]);
		}
		
		image.setImage(new Image("application/fruit/unknown.png"));
		
		list.getSelectionModel().selectedItemProperty().addListener(ChangeListener -> getSelected());
	}
	
	
	public void getSelected() {
		String selected = list.getSelectionModel().getSelectedItem();
		String link = "application/fruit/"+selected+".png";
		image.setImage(new Image(link));
	}

}
