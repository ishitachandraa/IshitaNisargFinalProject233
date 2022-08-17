package application;

public class HairColor {  
	
	 String mHair;
	 String fHair;
	         
	        
	    // constructor
	 HairColor( String motherHair, String fatherHair){
	        mHair = motherHair;
	        fHair = fatherHair;
	         }
	        	
	     // returns baby hair color based on the same of parents    
	  String predictHair() {
	        String bHair = "";
	        	
	        if (mHair.equals("Brown") || fHair.equals("Brown")) {
	        	bHair = "Brown";
	        	}
	        else {
	        	if(mHair.equals("Blonde")|| fHair.equals("Blonde")) {
	        		bHair = "Blonde";
	        		}
	        	else {
	        		bHair = "Red";
	        		}
	        	}
	        	
	        	return bHair;
}
	         
	         	         }




	         

