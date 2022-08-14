package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BabyCalController {
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

    
    
    // got this code from https://youtu.be/qnwBZveyUtA
    @FXML
    void calculateBaby(ActionEvent event)throws Exception {
    	
    	
    	VBox root = FXMLLoader.load( getClass().getResource("BabyFeatures.fxml"));
    	Stage window = (Stage) finalCalculate.getScene().getWindow();
    	window.setScene(new Scene(root, 300, 300));
        displayResults();
    	
    }
    
    void displayResults(){
    	
    	//HairColor
    	String motherHair = motherHairColorChoiceBox.getValue().toString();
    	String fatherHair = fatherHairColorChoiceBox.getValue().toString();
    	String babyHair = calculateHair(motherHair, fatherHair);
    	System.out.println(babyHair);
    	
    	//EyeColor
    	String motherEye = eyeColorMotherChoiceBox.getValue().toString();
    	String fatherEye = eyeColorFatherChoiceBox.getValue().toString();
    	String babyEye = calculateEye(motherEye, fatherEye);
    	System.out.println(babyEye);
    	
    	//EarLobe
    	String motherLobe = motherEarLobeChoiceBox.getValue().toString();
    	String fatherLobe = fatherEarLobeChoiceBox.getValue().toString();
    	String babyLobe = calculateEarLobe(motherLobe, fatherLobe);
    	System.out.println(babyLobe);
    	
    	//Dimples
    	String motherDimples = motherDimplesChoiceBox.getValue().toString();
    	String fatherDimples = fatherDimplesChoiceBox.getValue().toString();
    	String babyDim = calculateEarLobe(motherDimples, fatherDimples);
    	System.out.println(babyDim);
    	
    	
 
    
    }
    
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
    
}
