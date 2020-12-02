package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Controller {
	
	FileChooser fileChooser = new FileChooser();
	FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
	PrintWriter writer;
	String path = null;

	//file
	public MenuItem nieuw = new MenuItem();
	public MenuItem nieuwVenster = new MenuItem();
	public MenuItem sluiten = new MenuItem();
	public MenuItem open = new MenuItem();
	public MenuItem opslaan = new MenuItem();
	public MenuItem opslaanAls = new MenuItem();
	
	//edit
	public MenuItem kopieren = new MenuItem();
	public MenuItem plakken = new MenuItem();
	
	public TextArea textarea = new TextArea();

	

	public void initialize() {
		
		nieuw.setOnAction(e -> {
			textarea.clear();
		});
		
		nieuwVenster.setOnAction(e -> {
			Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource("sample.fxml"));
	            Stage stage = new Stage();
				stage.setScene(new Scene(root));
				stage.setTitle("Notepad FX");
				stage.show();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		open.setOnAction(e -> {
			    fileChooser.getExtensionFilters().add(extFilter);
				File file = fileChooser.showOpenDialog(null);
				
				if (file!= null) {
					//save path to opened file (to quick save)
					path = file.getAbsolutePath();
					
					//while there is another line in txt file, append the line to the textarea
					try (Scanner input = new Scanner(file)) {
					    while (input.hasNextLine()) {
					        textarea.appendText(input.nextLine() + "\r\n");
					    }
					} catch (FileNotFoundException ex) {
					    ex.printStackTrace();
					}
				}
		});
		
		opslaan.setOnAction(e -> {
			
			//check if txt file can be quicksaved else open filechooser
			if (path != null) {
	            File file = new File(path);
	            String text = textarea.getText();
	            
	            if (file != null) {
	            	saveFile(text, file);
	            }
			} else {
				fileChooser.getExtensionFilters().add(extFilter);
	            File file = fileChooser.showSaveDialog(null);
	            String text = textarea.getText();
	            
	            if (file != null) {
	            	saveFile(text, file);
	            }
			}

		});
		
		opslaanAls.setOnAction(e -> {
			//choose place to save
		    fileChooser.getExtensionFilters().add(extFilter);
            File file = fileChooser.showSaveDialog(null);
            String text = textarea.getText();
            
            if (file != null) {
            	saveFile(text, file);
            }
		});
		
		sluiten.setOnAction(e -> {
			Platform.exit();
		});
		
		//edit
		kopieren.setOnAction(e -> {
	        final Clipboard clipboard = Clipboard.getSystemClipboard();
	        final ClipboardContent content = new ClipboardContent();
			String text = textarea.getSelectedText();
	        content.putString(text);
	        //content.putHtml("<b>Some</b> text");
	        clipboard.setContent(content);
		});
	}
	
    private void saveFile(String text, File file) {
        try {
        	//write lines from textarea to txt file
            writer = new PrintWriter(file);
            writer.println(text);
            writer.close();
        } catch (IOException ex) {
        	ex.printStackTrace();
        }
    }
	
}
