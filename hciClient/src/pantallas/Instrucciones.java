package pantallas;

import setup.AdministradorPantalla;
import setup.Pantalla;

public class Instrucciones extends Pantalla {

	@Override
	public void iniciar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pintar() {
		app.fill(0);
		app.text("aqui deberian de ir las instrucciones", 50, 50);
		// TODO Auto-generated method stub

	}

	@Override
	public void finalizar() {

		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed() {
		AdministradorPantalla.cambiarPantalla(new Juego());
		// TODO Auto-generated method stub
		super.mousePressed();
	}
}
