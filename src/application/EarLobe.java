package application;

public class EarLobe {

	// if lobe attached then true
	Boolean mLobe=false;
	Boolean fLobe=false;
	
	EarLobe(String motherLobe, String fatherLobe){
		if(motherLobe=="Attached Earlobe") {
			mLobe=true;
		}
		if(fatherLobe=="Attached Earlobe") {
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
	
	