package application;

public class HairColor {   
	         String mHair;
	         String fHair;
	         
	        
	         
	         HairColor( String motherHair, String fatherHair){
	        	 mHair = motherHair;
	        	 fHair = fatherHair;
	         }
	        	
	         
	         String predictHair() {
	        	String bHair = "";
	        	
	        	if (mHair.equals("Brown") || fHair.equals("Brown")) {
	        		bHair = "Brown";
	        	}else {
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




	         

