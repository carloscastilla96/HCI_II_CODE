package pantallas;

import setup.AdministradorPantalla;
import setup.Pantalla;

public class PantallaInicial extends Pantalla {

	@Override
	public void iniciar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pintar() {

		app.background(200);
		app.text("pantalla de presentación", 100, 100);
	}

	@Override
	public void finalizar() {

	}

	@Override
	public void mousePressed() {
		// TODO Auto-generated method stub
		AdministradorPantalla.setPantallaVisible(new Instrucciones());
		super.mousePressed();
	}
	
}
