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
	        	
	        	if(mHair=="brown"|| fHair == "brown") {
	        		bHair = "brown";
	        	}
	        	else {
	        		if (mHair=="blonde" || fHair =="blonde") {
	        			bHair = "blonde";
	        		}
	        		else {
	        			bHair = "red";
	        		}
	        	}
	
	        	
	        	return bHair;
}
	         
	         public  void main(String[] args) {
	        	 System.out.println("hello");
	         }	         }




	         

