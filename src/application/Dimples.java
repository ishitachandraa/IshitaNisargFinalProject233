package application;

public class Dimples {
	
	Boolean mDim=false;
	Boolean fDim=false;
	
	Dimples(String motherDimples, String fatherDimples){
		if(motherDimples.equals("Dimples")) {
			mDim=true;
		}
		if(fatherDimples.equals("Dimples")) {
			fDim=true;
		}
	}
	
	String predictDimples() {
		String bDim = "";
		
		if (mDim || fDim) {
			bDim="63% Dimples";
			if(mDim && fDim) {
				bDim = "99% Dimples";
			}
		}
		else {
			bDim = "No Dimples";
		}
		
		
		
		return bDim;

}
}