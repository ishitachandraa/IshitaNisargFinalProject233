package application;

public class Height {
	float mHeight;
	float fHeight;
	
	
	Height(float motherHeight, float fatherHeight){
		mHeight = motherHeight;
		fHeight = fatherHeight;
	}
	String predictHeight() {
		float bHeight = 0.0f;
		float childHeight = (mHeight + fHeight)/2;
		bHeight = childHeight;
        String babyHeight = String.valueOf(bHeight);		
		
		
		return babyHeight;
		
	}
		
	
}	



