package application;



import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BabyCalController  {
	Stage applicationStage;
	
    @FXML
    private ChoiceBox<?> motherEarLobeChoiceBox;

    @FXML
    private ChoiceBox<?> motherHairColorChoiceBox;

    @FXML
    private TextField motherHeightTextField;

    @FXML
    private Button finalCalculate;
    
    @FXML
    private Button continueButton;
    
    @FXML
    private Button goBackButton;
    

    @FXML
    private ChoiceBox<String> eyeColorFatherChoiceBox;

    @FXML
    private ChoiceBox<String> fatherEarLobeChoiceBox;

    @FXML
    private ChoiceBox<String> fatherDimplesChoiceBox;

    @FXML
    private ChoiceBox<String> motherDimplesChoiceBox;

    @FXML
    private ChoiceBox<String> fatherHairColorChoiceBox;

    @FXML
    private TextField fatherHeightTextField;

    @FXML
    private ChoiceBox<String> eyeColorMotherChoiceBox;
    
    @FXML
    private HBox hBox1;
    
    @FXML
    private HBox hBox2;
    
    @FXML
    private HBox hBox3;
    
    @FXML
    private HBox hBox4;
    
    @FXML
    private HBox hBox5;
    
    @FXML
    private HBox hBox6;
    
    @FXML
    private HBox hBox7;
    
    @FXML 
    private Label fatherNameLabel;
    
    @FXML 
    private Label motherNameLabel;
    
    @FXML
    private Label heightErrorLabel;
    
    
    
 
    
    
    @FXML
    /**
     * executes when the "continue' button is clicked in scene 2
     * previously hidden hBoxes with all the labels and the choiceboxes become visible
     * method setNameLabel executes
     * */
    void addParentInformation(ActionEvent event2) {
    	
    	hBox1.setVisible(true);
    	hBox2.setVisible(true);
    	hBox3.setVisible(true);
    	hBox4.setVisible(true);
    	hBox5.setVisible(true);
    	hBox6.setVisible(true);
    	hBox7.setVisible(true);
        setNameLabel();    	
    }
    
    // collects information of father and mother name from the previous scene
    //and shows in respective labels.
    void setNameLabel() {
    	String fatherName = BabyFeatureController.fName;
    	fatherNameLabel.setText(fatherName);
    	
    	String motherName = BabyFeatureController.mName;
    	motherNameLabel.setText(motherName);
    	
    }
    
    @FXML
    // 'go back' button takes user to home screen
    void goToHomeScreen(ActionEvent event3) throws IOException {
    	VBox root = FXMLLoader.load( getClass().getResource("MainPageView.fxml"));
    	Stage window = (Stage) finalCalculate.getScene().getWindow();
    	window.setScene(new Scene(root, 300, 300));
    	
    }
    
    
    
   
    @FXML
    void calculateBaby(ActionEvent event)throws Exception {
    	
    	displayResults();
    	if (heightErrorMessage!="") {
    	heightErrorLabel.setText(heightErrorMessage);
    	
    	}
    	else {
    		 // got this code on how to open another scene from https://youtu.be/qnwBZveyUtA
        	VBox root = FXMLLoader.load( getClass().getResource("BabyFeatures.fxml"));
        	Stage window = (Stage) finalCalculate.getScene().getWindow();
        	window.setScene(new Scene(root, 300, 300));
    	}
    }
    
    // defining some useful strings
   static String  finalBabyHair = "";
   static String  finalBabyEye = "";
   static String  finalBabyLobe = "";
   static String  finalBabyDimples = "";
   static String finalBabyHeight = "";
    String heightErrorMessage = "";
    
    // gets input from the choice boxes and text field and passes it through appropriate methods.
    // the result gets stored in a string for future use
    void displayResults(){
    	
    	//HairColor
    	String motherHair = motherHairColorChoiceBox.getValue().toString();
    	String fatherHair = fatherHairColorChoiceBox.getValue().toString();
    	String babyHair = calculateHair(motherHair, fatherHair);
    	finalBabyHair = babyHair;
    	
    	//EyeColor
    	String motherEye = eyeColorMotherChoiceBox.getValue().toString();
    	String fatherEye = eyeColorFatherChoiceBox.getValue().toString();
    	String babyEye = calculateEye(motherEye, fatherEye);
    	finalBabyEye = babyEye;
    	
    	//EarLobe
    	String motherLobe = motherEarLobeChoiceBox.getValue().toString();
    	String fatherLobe = fatherEarLobeChoiceBox.getValue().toString();
    	String babyLobe = calculateEarLobe(motherLobe, fatherLobe);
    	finalBabyLobe = babyLobe;
    	
    	//Dimples
    	String motherDimples = motherDimplesChoiceBox.getValue().toString();
    	String fatherDimples = fatherDimplesChoiceBox.getValue().toString();
    	String babyDim = calculateDimples(motherDimples, fatherDimples);
    	finalBabyDimples = babyDim;
    	
    	//Height
    	String motherHeight = motherHeightTextField.getText();
    	String fatherHeight = fatherHeightTextField.getText();
		String babyHeight = calculateHeight(motherHeight, fatherHeight);
		finalBabyHeight = babyHeight;
		
		
		}
    
    // getter methods for all strings needed to be shown in the next scene
    static String GetBabyHair() {
    	return finalBabyHair;
    }
    
    static String GetBabyEye() {
    	return finalBabyEye;
    }
    
    static String GetBabyLobe() {
    	return finalBabyLobe;
    }
    
    static String GetBabyDimples() {
    	return finalBabyDimples;
    }
    
    static String GetBabyHeight() {
    	return finalBabyHeight;
    }
    
    
    // all these methods calculate features by creating a new object in the respective classes
    // and invoking the 'predict' methods
    String calculateHair(String mHair, String fHair) {
    	
      HairColor babyHair = new HairColor(mHair, fHair);
      String hairResult = babyHair.predictHair();
      return hairResult;
    }
    
    String calculateEye(String mEye, String fEye) {
    	
        EyeColor babyEye = new EyeColor(mEye, fEye);
        String eyeResult = babyEye.predictEye();
        return eyeResult;
      }
    
    String calculateEarLobe(String mLobe, String fLobe) {
    	
    	EarLobe babyLobe = new EarLobe(mLobe, fLobe);
    	String lobeResult = babyLobe.predictEarlobe();
    	return lobeResult;
    }
    
   String calculateDimples(String mDim, String fDim) {
	   
	   Dimples babyDim = new Dimples(mDim, fDim);
	   String dimResult = babyDim.predictDimples();
	   return dimResult;
   }
   
   String calculateHeight(String mHeight, String fHeight) {
	   
	   Height babyHeight = new Height(mHeight, fHeight);
	   String heightResult = babyHeight.predictHeight();
	   
	   // stores error message by invoking appropriate method from the class Height
	  heightErrorMessage = babyHeight.errorMessage();
	   return heightResult;
   }
}
