package root.client;

import info.AdministradorInfo;
import info.Info;
import juego.visualInterface.Menu;
import pantallas.Juego;
import pantallas.PantallaInicial;
import red.ComunicacionCliente;
import setup.AdministradorPantalla;

public class LogicaClient {

	LogicaClient() {
		Info.getInstance();
		AdministradorPantalla.cambiarPantalla(new PantallaInicial());
		// AdministradorPantalla.cambiarInterfaz(new Menu());

		AdministradorPantalla.getCurrentScreen().iniciar();

		if (AdministradorPantalla.getInterfazVisible() != null)
			AdministradorPantalla.getInterfazVisible().iniciar();
		ComunicacionCliente.getInstance();
	}

	public void pintar() {
		AdministradorPantalla.getCurrentScreen().pintar();

		if (AdministradorPantalla.getInterfazVisible() != null)
			AdministradorPantalla.getInterfazVisible().pintar();
	}

	public void mousePressed() {

		if (AdministradorPantalla.getInterfazVisible() != null)
			AdministradorPantalla.getInterfazVisible().mousePressed();
		AdministradorPantalla.getCurrentScreen().mousePressed();
	}

	public void mouseDragged() {
		if (AdministradorPantalla.getInterfazVisible() != null)
			AdministradorPantalla.getInterfazVisible().mouseDragged();
		AdministradorPantalla.getCurrentScreen().mouseDragged();
	}

	public void mouseReleased() {
		if (AdministradorPantalla.getInterfazVisible() != null)
			AdministradorPantalla.getInterfazVisible().mouseDragged();
		AdministradorPantalla.getCurrentScreen().mouseReleased();
	}

	public void keyPressed() {
		if (AdministradorPantalla.getInterfazVisible() != null)
			AdministradorPantalla.getInterfazVisible().KeyPressed();
		AdministradorPantalla.getCurrentScreen().KeyPressed();
	}
}
