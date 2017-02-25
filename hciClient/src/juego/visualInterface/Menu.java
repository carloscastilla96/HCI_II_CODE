package juego.visualInterface;

import info.AdministradorInfo;
import pantallas.Juego;
import setup.AdministradorPantalla;
import setup.Interfaz;
import setup.Pantalla;

public class Menu extends Interfaz {

	Juego j;

	@Override
	public void iniciar() {
		validar();

	}

	public void validar() {

		if (AdministradorPantalla.getPantallaVisible() instanceof Juego) {
			j = (Juego) AdministradorPantalla.getPantallaVisible();
		}
		System.out.println("sisas mi pai");
	}

	@Override
	public void pintar() {
		app.translate(0, 0);
		app.fill(40, 40, 40);
		app.rect(0, 0, app.height / 2, app.width);
		app.fill(255);

		app.text("aqui deberia de haber un menu...", 100, 200);

	}

	@Override
	public void finalizar() {

	}

}
