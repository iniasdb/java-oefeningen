package application;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import javafx.application.Platform;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

public class Controller {
	
	public MenuItem open = new MenuItem();
	public MenuItem close = new MenuItem();
	public ImageView imageView = new ImageView();
	FileChooser fileChooser = new FileChooser();
    FileChooser.ExtensionFilter extFilter = 
            new FileChooser.ExtensionFilter("PNG files (*.png)", "*.png", "JPG files (*.jpg)", "*.jpg");


	public void initialize() {
		open.setOnAction(e -> {
		    fileChooser.getExtensionFilters().add(extFilter);

			File file = fileChooser.showOpenDialog(null);
			
			if (file!= null) {
				try {
					InputStream is = Files.newInputStream(file.toPath());
					Image img = new Image(is);
					imageView.setImage(img);
					is.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		});
		
		close.setOnAction(e -> {
			Platform.exit();
		});
}
}
