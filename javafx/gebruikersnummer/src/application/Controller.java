package application;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	public TextField voornaam;
	public Label voornaamerror;
	public TextField familienaam;
	public Label familienaamerror;
	public Label usernumber;

	
    public  void showUserNumber(ActionEvent event) {
    	String fname = voornaam.getText();
    	String lname = familienaam.getText().replaceAll("\\s", "");  
    	
    	voornaamerror.setText("");
    	familienaamerror.setText("");
    	
    	if (fname.isEmpty() && lname.isEmpty()) {
    		voornaamerror.setText("kutje");
    		familienaamerror.setText("kutje");
    	} else if (fname.isEmpty()) {
    		voornaamerror.setText("kutje");
    	} else if (lname.isEmpty()){
    		familienaamerror.setText("kutje");
    	} else {
        	String fnamePart = fname.substring(0, 1);
        	String lnamePart;
        	
        	if (lname.length() < 7) {
        		lnamePart = lname.substring(0, lname.length());
        	} else {
        		lnamePart = lname.substring(0, 7);
        	}
        	
        	String user = fnamePart  + lnamePart;
        	
        	usernumber.setText(user);
    	}
    }
}
