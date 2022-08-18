package application;

public class HairColor {  
	
	 private String mHair;
	 private String fHair;
	 
	 private String getmHair() {
		return mHair;
	}

	private void setmHair(String mHair) {
		this.mHair = mHair;
	}

	private String getfHair() {
		return fHair;
	}

	private void setfHair(String fHair) {
		this.fHair = fHair;
	}

	 
         
	        
	    // constructor
	 HairColor( String motherHair, String fatherHair){
	        setmHair(motherHair);
	        setfHair(fatherHair);
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




	         

