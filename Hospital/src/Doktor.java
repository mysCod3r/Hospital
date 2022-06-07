public class Doktor extends Kisi{
	
	int diplomaNo;
	
	Doktor() {	
	}

	Doktor(String isim, String tcKimlik, int diplomaNo) {
		super(isim,tcKimlik);
		this.diplomaNo = diplomaNo;		
	}
	
	int getDiplomaNo(){
		return diplomaNo;
	}	
}
