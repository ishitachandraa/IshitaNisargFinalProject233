package application;

public class EyeColor {
	
	String mEye;
	String fEye;
	
	// constructor
	EyeColor(String motherEye, String fatherEye){
		mEye = motherEye;
		fEye = fatherEye;
	}

	// returns baby eye color based on parent's eye colors
	String predictEye() {
		String bEye = "";
		if(mEye.equals("Brown")|| fEye.equals("Brown")) {
    		bEye = "Brown";
    		if(mEye.equals("Blue")|| fEye.equals("Blue"))
    			bEye = "Brown or Blue";
    	}
		
		if(mEye.equals(fEye)) {
			bEye=mEye;
		}
		if((mEye.equals("Blue")&& fEye.equals("Green"))||(fEye.equals("Blue")&& mEye.equals("Green"))) {
			bEye="Blue or Green";
		}
		
		return bEye;
	}
}
