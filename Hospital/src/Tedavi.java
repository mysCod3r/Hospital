public class Tedavi {

	Hasta hasta = new Hasta();
	Doktor doktor = new Doktor();
	String ayrintilar;
	
	Tedavi(){
	}
	
	public Tedavi(Hasta hasta, Doktor doktor) {
		this.hasta = hasta;
		this.doktor = doktor;
		System.out.println("[Hasta: " + hasta.isim + "]" + " [Doktor: " + doktor.isim + "] Tarafından Tedavi Edildi.");
	}
	
	public String getAyrintilar() {
		if(ayrintilar == null) {
			ayrintilar = "Ayrıntı belirtilmedi.";
		}
		System.out.println(ayrintilar);
		return ayrintilar;
	}

	public void setAyrintilar(String ayrintilar) {
		this.ayrintilar = ayrintilar;
		System.out.println("Ayrıntılar: " + ayrintilar);
	}

	public Hasta getHasta() {
		return hasta;
	}

	public Doktor getDoktor() {
		return doktor;
	}	
}
