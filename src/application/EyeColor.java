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
		if(mEye.equals("brown")|| fEye.equals("brown")) {
    		bEye = "brown";
    		if(mEye.equals("blue")|| fEye.equals("blue"))
    			bEye = "brown or blue";
    	}
		
		if(mEye.equals(fEye)) {
			bEye=mEye;
		}
		if((mEye.equals("blue")&& fEye.equals("green"))||(fEye.equals("blue")&& mEye.equals("green"))) {
			bEye="Blue or Green";
		}
		
		return bEye;
	}
}
