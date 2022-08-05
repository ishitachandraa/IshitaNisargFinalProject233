package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BabyFeatureController {

    @FXML
    private TextField fatherNameTextField;

    @FXML
    private TextField motherNameTextField;

    @FXML
    private Button addInfoButton;

   
    @FXML
    void addInfo(ActionEvent event) {
    	String motherName = motherNameTextField.getText();
    	String fatherName = fatherNameTextField.getText();
    	
    }

  

}
