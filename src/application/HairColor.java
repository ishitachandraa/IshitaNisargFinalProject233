package application;

public class HairColor {   
	         String mHair;
	         String fHair;
	         
	        
	         
	         HairColor( String motherHair, String fatherHair){
	        	 mHair = motherHair;
	        	 fHair = fatherHair;
	         }
	        	
	         
	         String predictHair() {
	        	String bHair = "nothing";
	        	
	        	if (mHair.equals("brown") || fHair.equals("brown")) {
	        		bHair = "brown";
	        	}else {
	        		if(mHair.equals("blonde")|| fHair.equals("blonde")) {
	        			bHair = "blonde";
	        		}
	        		else {
	        			bHair = "red";
	        		}
	        	}
	        	
	        	
	
	        	
	        	return bHair;
}
	         
	         	         }




	         

