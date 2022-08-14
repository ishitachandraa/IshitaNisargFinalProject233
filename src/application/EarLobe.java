package application;

public class EarLobe {

	// if lobe attached then true
	Boolean mLobe=false;
	Boolean fLobe=true;
	
	EarLobe(String motherLobe, String fatherLobe){
		if(motherLobe.equals("Attached Earlobe")) {
			mLobe=true;
		}
		if(fatherLobe.equals("Attached Earlobe")) {
			fLobe=true;
		}
	}
		
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
	
	