package patrones2;

public class Busca extends Dispositivo implements IObserver {

	private String texto;

	public Busca(String pString) {
		super();
		texto = pString;
	}

	public void update() {
	}

	public String getInfo() {
		return texto;
	}
}
