package patrones2;

public class TelefonoMovil extends Dispositivo implements IObserver {

	private String texto;

	public TelefonoMovil(String pString) {
		super();
		texto=pString;
	}

	public void update() {
		
	}
	public String getInfo() {
		return texto;
	}
}
