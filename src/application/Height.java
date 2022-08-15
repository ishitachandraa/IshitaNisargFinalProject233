package application;

public class Height {
	float mHeight;
	float fHeight;
	
	
	Height(float motherHeight, float fatherHeight){
		mHeight = motherHeight;
		fHeight = fatherHeight;
	}
	float predictHeight() {
		float bHeight = 0;
		float childHeight = (mHeight + fHeight)/2;
		bHeight = childHeight;
		System.out.println(bHeight);
		
		
		
		return bHeight;
		
	}
		
	
}	



