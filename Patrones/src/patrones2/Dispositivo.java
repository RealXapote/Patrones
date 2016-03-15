package patrones2;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Dispositivo implements IObserver {

	private ArrayList<IObserver> dispositivos = new ArrayList<IObserver>();

	public void suscribir(Dispositivo pDispositivo) {
		dispositivos.add(pDispositivo);
	}

	public void baja(Dispositivo pDispositivo) {
		dispositivos.remove(pDispositivo);
	}

	public void llamada(Dispositivo pDispositivo) {
		IObserver observador;
		Iterator it = dispositivos.iterator();
		while (it.hasNext()) {
			observador = (IObserver) it.next();
			observador.update();
			System.out.println(
					"Mensaje al " + observador + ", en " + observador + " se ha recibido una llamada de " + observador);
		}
	}
}
