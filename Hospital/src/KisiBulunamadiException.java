
public class KisiBulunamadiException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2660840411933469055L;

	public KisiBulunamadiException(String hataMesaji){
		super(hataMesaji + " Bu TC Kimliğe sahip kişi sistemde kayıtlı değil !");		
	}
	
	
}