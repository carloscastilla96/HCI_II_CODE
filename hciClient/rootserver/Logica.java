package rootserver;

import info.AdministradorInfo;
import info.Info;
import juego.visualInterface.Menu;
import pantallas.Juego;
import pantallas.PantallaInicial;
import red.ComunicacionServidor;
import setup.AdministradorPantalla;

public class Logica {

	ComunicacionServidor c;

	Logica() {
		Info.getInstance();
		AdministradorPantalla.cambiarPantalla(new Juego());
		AdministradorPantalla.cambiarInterfaz(new Menu());

		AdministradorPantalla.getCurrentScreen().iniciar();
		AdministradorPantalla.getInterfazVisible().iniciar();
		ComunicacionServidor.getInstance();
	}

	public void pintar() {
		AdministradorPantalla.getCurrentScreen().pintar();
		AdministradorPantalla.getInterfazVisible().pintar();
	}

	public void mousePressed() {
		AdministradorPantalla.getInterfazVisible().mousePressed();
		AdministradorPantalla.getCurrentScreen().mousePressed();

	}

	public void mouseDragged() {
		AdministradorPantalla.getInterfazVisible().mouseDragged();
		AdministradorPantalla.getCurrentScreen().mouseDragged();

	}

	public void mouseReleased() {
		AdministradorPantalla.getInterfazVisible().mouseDragged();
		AdministradorPantalla.getCurrentScreen().mouseReleased();

	}

	public void keyPressed() {
		AdministradorPantalla.getInterfazVisible().KeyPressed();
		AdministradorPantalla.getCurrentScreen().KeyPressed();
	}
}
