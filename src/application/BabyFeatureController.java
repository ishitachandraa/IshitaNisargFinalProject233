package application;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BabyFeatureController {
	Stage applicationStage;

    @FXML
    private static TextField fatherNameTextField;

    @FXML
    private static TextField motherNameTextField;

    @FXML
    private Button addInfoButton;

   
    static String motherName = "";
    static String fatherName = "";
    
     static void setNames() {
    String mName = motherNameTextField.getText();
	String fName = fatherNameTextField.getText();
	motherName = mName;
	fatherName = fName;
	BabyCalController.fNameLabel.setText("hi");
    }
    
    @FXML
    void addInfo(ActionEvent event)throws IOException {
    	
    	
    	FXMLLoader loader = new FXMLLoader();
    	VBox root = loader.load(new FileInputStream("src/application/ParentsInfo.fxml"));
    	
    	Scene scene2 = new Scene(root,600,550);
    	applicationStage.setScene(scene2);
    	
    	setNames();
    	
    	
    	
    }

  static String getMotherName(){
	  return motherName;
	  
  }
  
  static String getFatherName() {
	  return fatherName;
  }

}
