package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BabyFeatureController {
	Stage applicationStage;

    @FXML
    private TextField fatherNameTextField;

    @FXML
    private TextField motherNameTextField;

    @FXML
    private Button addInfoButton;
    
    static String mName = "";
    static String fName = "";
  
   
    @FXML
    // executes when START! button is pressed
    void addInfo(ActionEvent event)throws IOException {
    	// stores data from the two text fields in variables for future use
        String motherName = motherNameTextField.getText();
    	String fatherName = fatherNameTextField.getText();
    	
    	mName = motherName;
    	fName = fatherName;
   
    	// creates and opens scene 2
    	VBox root = FXMLLoader.load(getClass().getResource("ParentsInfo.fxml"));
    	applicationStage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	Scene Scene2 = new Scene(root,600,550);
    	applicationStage.setScene(Scene2);
    	applicationStage.show();
    	
    	} 
   
    }

  


