package patrones2;

public class TelefonoFijo extends Dispositivo implements IObserver{

	private String numero;

	public TelefonoFijo(String pString) {
		super();
		numero = pString;
	}

	public void update() {

	}

	public String getInfo() {
		return numero;
	}
}
