package patrones2;

public class CorreoElectronico extends Dispositivo {

	private String correo;

	public CorreoElectronico(String pString) {
		super();
		correo = pString;
	}

	public void update() {
		
	}
	public String getInfo() {
		return correo;
	}
}
