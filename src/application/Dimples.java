package application;

public class Dimples {
	
	Boolean mDim=false;
	Boolean fDim=false;
	
	// Constructor which assigns 'true' if dimple present
	Dimples(String motherDimples, String fatherDimples){
		if(motherDimples.equals("Dimples")) {
			mDim=true;
		}
		if(fatherDimples.equals("Dimples")) {
			fDim=true;
		}
	}
	
	// returns the occurrence of dimples in child on the basis of dimples of the parents.
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