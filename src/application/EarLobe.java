package application;

public class EarLobe {

	
	Boolean mLobe=false;
	Boolean fLobe=false;
	
	
	// constructor (if ear lobes attached, then boolean is true)
	EarLobe(String motherLobe, String fatherLobe){
		if(motherLobe.equals("Attached Earlobe")) {
			mLobe=true;
		}
		if(fatherLobe.equals("Attached Earlobe")) {
			fLobe=true;
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
	
	