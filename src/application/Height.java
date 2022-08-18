
package application;

import java.util.ArrayList;

public class Height {
	
	private String mHeight;
	private String fHeight;
    private String getmHeight() {
		return mHeight;
	}

	private void setmHeight(String mHeight) {
		this.mHeight = mHeight;
	}

	private String getfHeight() {
		return fHeight;
	}

	private void setfHeight(String fHeight) {
		this.fHeight = fHeight;
	}

	ArrayList<Character> badChar = new ArrayList<Character>();

    // constructor
	Height(String motherHeight, String fatherHeight){
		setmHeight(motherHeight);
		setfHeight(fatherHeight);
	}
	
	// predicts baby height based on parent heights
	String predictHeight() {
		String bHeight = "";
		boolean valueOkay = true;

		//checking if input for mother height is valid
		char[] mArray = mHeight.toCharArray();
		for(char m:mArray) {
			if (!Character.isDigit(m)) {
				valueOkay=false;
				badChar.add(m);
			}
		}

		// checking if input for father height is valid
		char[] fArray = fHeight.toCharArray();
		for(char f:fArray) {
			if (!Character.isDigit(f)) {
				valueOkay=false;
				badChar.add(f);
			}
		}

		// if input valid then calculate baby height
		if (valueOkay){
			int mInt = Integer.parseInt(mHeight);
			int fInt = Integer.parseInt(fHeight);
			int bInt = (mInt + fInt)/2;
			bHeight = String.valueOf(bInt);
		}
		
		// if input not valid then baby height is assigned 0
		else {
			bHeight = "0";
		}
		
		bHeight = bHeight+" cm";
		return bHeight;

}
	
	// returns string with message regarding what caused the input to be invalid
	String errorMessage() {
		String message = "";
		if (badChar.size()!=0) {
			message = "Only put valid numbers in the height field. '" + badChar.get(0).toString() + "' invalid.";
		}
		return message;
	}

}



