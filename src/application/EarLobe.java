package application;

public class EarLobe {

	
	private Boolean mLobe=false;
	private Boolean fLobe=false;
	
	
	private Boolean getmLobe() {
		return mLobe;
	}

	private void setmLobe(Boolean mLobe) {
		this.mLobe = mLobe;
	}

	private Boolean getfLobe() {
		return fLobe;
	}

	private void setfLobe(Boolean fLobe) {
		this.fLobe = fLobe;
	}

	// constructor (if ear lobes attached, then boolean is true)
	EarLobe(String motherLobe, String fatherLobe){
		if(motherLobe.equals("Attached Earlobe")) {
			setmLobe(true);
		}
		if(fatherLobe.equals("Attached Earlobe")) {
			setfLobe(true);
		}
	}
		
	// returns baby's ear lobe shape according to the same of parents.
		String predictEarlobe() {
			String bLobe = "";
			
			if (mLobe && fLobe) {
				bLobe = "Attached Earlobes";	
			}
			else {
				bLobe = "Dettached Earlobes";
			}
			
			return bLobe;
	}
}
	
	