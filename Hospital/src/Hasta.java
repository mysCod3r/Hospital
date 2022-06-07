public class Hasta extends Kisi{
	
	int dogumYili;
	
	Hasta() {	
	}
	
	Hasta(String isim, String tcKimlik, int dogumYili) {
		super(isim,tcKimlik);
		this.dogumYili = dogumYili;		
	}
	
	int getDogumYili(){
		return dogumYili;
	}	
}
