import java.util.ArrayList;
import java.util.Collections;

public class BilgiSistemi {
	
    static ArrayList<Doktor> doktorlar = new ArrayList<Doktor>();
    static ArrayList<Hasta> hastalar = new ArrayList<Hasta>();
    static ArrayList<String> tcKimliklerDoktor = new ArrayList<String>();
    static ArrayList<String> tcKimliklerHasta = new ArrayList<String>();
	
	
	public boolean doktorEkle(String isim, String tcKimlik, int diplomaNo) throws KisiBulunamadiException {
		Collections.sort(tcKimliklerDoktor);
		try {
			if(Collections.binarySearch(tcKimliklerDoktor, tcKimlik) >= 0) {
				System.out.println(tcKimlik + " TC Kimlikli Doktor " + isim + " Zaten Sistemde Kayıtlı.!");
				return false;
			}else {
				Doktor doktor = new Doktor(isim, tcKimlik, diplomaNo);
				doktorlar.add(doktor);
				tcKimliklerDoktor.add(tcKimlik);
				System.out.println("[Doktor]" + isim + " TC --> " + tcKimlik +  " Eklendi.");
				return true;
			}
		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}	
	
	public Doktor doktorBul(String tcKimlik, boolean fromTedaviEkle) throws KisiBulunamadiException {
		try {
			Collections.sort(tcKimliklerDoktor);
			int deger = Collections.binarySearch(tcKimliklerDoktor, tcKimlik);
			if(deger >= 0) {
				if(!fromTedaviEkle) {
					System.out.println(tcKimlik + " TC Kimlikli Doktor Sistemde "  + deger + ". Sırada Kayıtlı.");
				}
				return doktorlar.get(deger);
			}else {
				throw new KisiBulunamadiException(tcKimlik);
			}		
		}catch (KisiBulunamadiException e) {
			System.out.println(e);
			return null;
		}
	}
	
	public boolean hastaEkle(String isim, String tcKimlik, int diplomaNo) throws KisiBulunamadiException {
		Collections.sort(tcKimliklerHasta);
		try {
			if(Collections.binarySearch(tcKimliklerHasta, tcKimlik) >= 0) {
				System.out.println(tcKimlik + " TC Kimlikli Hasta " + isim + " Zaten Sistemde Kayıtlı.!");
				return false;
			}else {
				Hasta hasta = new Hasta(isim, tcKimlik, diplomaNo);
				hastalar.add(hasta);
				tcKimliklerHasta.add(tcKimlik);
				System.out.println("[Hasta]" + isim + " TC --> " + tcKimlik +  " Eklendi.");
				return true;
			}
		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}	
	
	public Hasta hastaBul(String tcKimlik, boolean fromTedaviEkle) throws KisiBulunamadiException {
		try {
			Collections.sort(tcKimliklerHasta);
			int deger = Collections.binarySearch(tcKimliklerHasta, tcKimlik);
			if(deger >= 0) {
				if(!fromTedaviEkle) {
					System.out.println(tcKimlik + " TC Kimlikli Hasta Sistemde "  + deger + ". Sırada Kayıtlı.");					
				}
				return hastalar.get(deger);
			}else {
				throw new KisiBulunamadiException(tcKimlik);
			}		
		}catch (KisiBulunamadiException e) {
			System.out.println(e);
			return null;
		}
	}
	
	public Tedavi tedaviEkle(Doktor doktor, Hasta hasta) throws KisiBulunamadiException {
		try {
			Tedavi tedavi = new Tedavi(hasta, doktor);
			return tedavi;
		}catch (Exception e) {
			return null;
		}
		
	}	
}
