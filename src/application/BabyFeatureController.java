package application;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

   
    @FXML
    void addInfo(ActionEvent event)throws IOException {
    	String motherName = motherNameTextField.getText();
    	String fatherName = fatherNameTextField.getText();
    	
    	FXMLLoader loader = new FXMLLoader();
    	VBox root = loader.load(new FileInputStream("src/application/ParentsInfo.fxml"));
    	
    	Scene scene2 = new Scene(root,500,350);
    	applicationStage.setScene(scene2);
    	
    }

  

}
