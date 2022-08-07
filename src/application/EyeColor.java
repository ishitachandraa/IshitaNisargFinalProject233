package application;

public class EyeColor {
	
	String mEye;
	String fEye;
	
	EyeColor(String motherEye, String fatherEye){
		mEye = motherEye;
		fEye = fatherEye;
	}

	String predictEye() {
		String bEye = "";
		if(mEye=="brown"|| fEye == "brown") {
    		bEye = "brown";
    		if(mEye=="blue"|| fEye == "blue")
    			bEye = "brown or blue";
    	}
		
		if(mEye==fEye) {
			bEye=mEye;
		}
		if((mEye=="blue"&& fEye=="green")||(fEye=="blue"&& mEye=="green")) {
			bEye="Blue or Green";
		}
		
		return bEye;
	}
}
