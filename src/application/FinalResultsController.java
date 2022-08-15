package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FinalResultsController {

    @FXML
    private Label hairColorResultLabel;

    @FXML
    private Label dimplesResultLabel;

    @FXML
    private Label heightResultLabel;

    @FXML
    private Label earLobeLabel;

    @FXML
    private Label eyeColorResultLabel;
    
   
    @FXML
    void showResults(ActionEvent event) {
    	// hair color
    	String hairColor = BabyCalController.GetBabyHair();
    	hairColorResultLabel.setText(hairColor);
    	
    	String eyeColor = BabyCalController.GetBabyEye();
    	eyeColorResultLabel.setText(eyeColor);
    	
    	String dimples = BabyCalController.GetBabyDimples();
    	dimplesResultLabel.setText(dimples);
    	
    	String lobe = BabyCalController.GetBabyLobe();
    	earLobeLabel.setText(lobe);
    	
    	String height = BabyCalController.GetBabyHeight();
    	heightResultLabel.setText(height);
    	
    	
    	
    	
    }
    
   
    
}