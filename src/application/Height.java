
package application;

import java.util.ArrayList;

public class Height {
	String mHeight;
	String fHeight;
    ArrayList<Character> badChar = new ArrayList<Character>();


	Height(String motherHeight, String fatherHeight){
		mHeight = motherHeight;
		fHeight = fatherHeight;
	}
	String predictHeight() {
		String bHeight = "";
		boolean valueOkay = true;

		char[] mArray = mHeight.toCharArray();
		for(char m:mArray) {
			if (!Character.isDigit(m)) {
				valueOkay=false;
				badChar.add(m);
			}
		}

		char[] fArray = fHeight.toCharArray();
		for(char f:fArray) {
			if (!Character.isDigit(f)) {
				valueOkay=false;
				badChar.add(f);
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
		bHeight = bHeight+" cm";
		return bHeight;

}
	
	String errorMessage() {
		String message = "";
		if (badChar.size()!=0) {
			message = "Only put valid numbers in the height field. '" + badChar.get(0).toString() + "' invalid.";
		}
		return message;
	}

}



