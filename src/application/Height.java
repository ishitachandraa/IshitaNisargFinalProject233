package application;

public class Height {
	String mHeight;
	String fHeight;
	
	
	
	Height(String motherHeight, String fatherHeight){
		mHeight = motherHeight;
		fHeight = fatherHeight;
	}
	String predictHeight() {
		String bHeight = "";
		boolean valueOkay = true;
		
		int i = 0;
		while (i<mHeight.length()) {
			char letter = mHeight.charAt(i);
			if (!Character.isDigit(letter)){
				valueOkay = false;
			}
			
		}
		if (valueOkay){
		int mInt = Integer.parseInt(mHeight);
		int fInt = Integer.parseInt(fHeight);
		int bInt = (mInt + fInt)/2;
		bHeight = String.valueOf(bInt);
		}
		else {
			bHeight = "0";
		}
		
		
		return bHeight;
		
	}
		
	
}	



