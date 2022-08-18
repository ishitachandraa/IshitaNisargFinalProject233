package application;

public class Dimples {
	
	private Boolean mDim=false;
	private Boolean fDim=false;
	
	
	
	private Boolean getmDim() {
		return mDim;
	}

	private void setmDim(Boolean mDim) {
		this.mDim = mDim;
	}

	private Boolean getfDim() {
		return fDim;
	}

	private void setfDim(Boolean fDim) {
		this.fDim = fDim;
	}

	// Constructor which assigns 'true' if dimple present
	Dimples(String motherDimples, String fatherDimples){
		if(motherDimples.equals("Dimples")) {
			setmDim(true);
		}
		if(fatherDimples.equals("Dimples")) {
			setfDim(true);
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