public class Main {

	public static void main(String[] args) throws KisiBulunamadiException {

	
		BilgiSistemi bS = new BilgiSistemi();
		
		/*
		 * doktorBul() ve hastaBul() methodlarında boolean değer eklenme sebebi: 
		 * 		tedaviEkle() methodu çağrılırken "hasta/doktor bulundu" mesajını tekrar almamak
		 * 
		 * Kod kalabalığı olmaması için fonksiyonları değişkene atamadan doğrudan çağırdım.
		 * get ve set methodları çalışıyor.
		 * 
		 */
		
		// Yeni doktor ekleyelim..
		bS.doktorEkle("Erkam Demirci", "12345678901", 123456789);	
		bS.doktorEkle("Al Pacino", "22345678901", 223456789);	
		bS.doktorEkle("Michael Corleone", "32345678901", 323456789);	
		bS.doktorEkle("John Milton", "42345678901", 423456789);	
		// Var olan doktoru tekrar ekleyelim..
		bS.doktorEkle("Michael Corleone", "32345678901", 323456789);	
		bS.doktorEkle("John Milton", "42345678901", 423456789);	
		System.out.println("---> Toplam Doktor Sayısı: " + BilgiSistemi.doktorlar.size());
		
		// Yeni hasta ekleyelim..
		bS.hastaEkle("Yasin Şenocak", "1234", 1234);
		bS.hastaEkle("Tony Montana", "2134", 2134);
		bS.hastaEkle("Fatih Yüzgül", "5621", 5621);
		bS.hastaEkle("Gürkan Mutlu", "4356", 4356);
		bS.hastaEkle("Yusuf Yiğit", "76421", 76421);		
		// Var olan hastayı tekrar ekleyelim..
		bS.hastaEkle("Gürkan Mutlu", "4356", 4356);
		bS.hastaEkle("Yusuf Yiğit", "76421", 76421);	
		System.out.println("---> Toplam Hasta Sayısı: " + BilgiSistemi.hastalar.size());		
		
		// Sistemde kayıtlı olan doktoru bulalım..
		bS.doktorBul("12345678901", false);
		bS.doktorBul("22345678901", false);
		// Sistemde kayıtlı olmayan doktoru bulmaya çalışalım..
		bS.doktorBul("1230000", false);
		bS.doktorBul("3210000", false);
		
		// Sistemde kayıtlı olan hastayı bulalım.
		bS.hastaBul("1234", false);
		bS.hastaBul("5621", false);
		// Sistemde kayıtlı olmayan hastayı bulmaya çalışalım..
		bS.hastaBul("100001", false);
		bS.hastaBul("200213", false);
		
		// Tedavi Ekleyelim.
		bS.tedaviEkle(bS.doktorBul("12345678901", true), bS.hastaBul("1234", true)).setAyrintilar("B12 Vitamin Eksikliği Tespit Edildi.");;
		bS.tedaviEkle(bS.doktorBul("22345678901", true), bS.hastaBul("4356", true)).getAyrintilar();

		
		
	}
}
