public abstract class Kisi {
	
	String isim;
	String tcKimlik;
	
	Kisi(){
		
	}
	
	Kisi(String isim, String tcKimlik ) {
		this.isim = isim;
		this.tcKimlik = tcKimlik;
	}	
	
	String getIsim() {
		return isim;
	}
	
	String getTcKimlik() {
		return tcKimlik;
	}
}
