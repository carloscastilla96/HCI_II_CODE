package pantallas;

import java.util.ArrayList;
import java.util.Collections;
import juego.Hexagon;
import juego.Jugador;
import processing.core.PVector;
import setup.Pantalla;

public class Juego extends Pantalla {

	Jugador j;
	float angle;

	ArrayList<Hexagon> hexagons = new ArrayList<>();
	private float fixNx;
	private float fixNy;

	// hexagono donde se va a estar parado;
	private Hexagon hSelected = null;
	private int nPosX;
	private int nPosY;

	// posiciones que se usarán para pintar en el centro
	private float xCenter;
	private float yCenter;

	public void iniciar() {
		System.out.println("asd");
		crearMatrix(0, 0, 1, 1, app.width / 5);
		j = new Jugador(hexagons.get(0).getX(), hexagons.get(0).getY());
		hSelected = hexagons.get(0);
		hSelected.setSelected(true);
		
		
	}

	

	public void crearMatrix(int x, int y, int ancho, int alto, float radio) {
		float width = (app.sqrt(3) / 2 * (radio * 2));
		for (int i = 0; i < ancho; i++) {
			for (int j = 0; j < alto; j++) {
				float nx = x + (i * width);
				float ny = y + (j * (radio + radio / 2));
				if (j % 2 == 0) {
					nx += width / 2;
				}
				hexagons.add(new Hexagon(this, nx, ny, radio));
			}
		}
		Collections.shuffle(hexagons);
	}

	public void fixCenter() {
		// el lienzo siempre se va a centrar de acuerdo al hexagono seleccionado
		xCenter = j.getPos().x - (app.width / 2);
		yCenter = j.getPos().y - (app.height / 2);
	}

	public void pintar() {
		fixCenter();

		// pinta los hexagonos, y los posiciona al centro de acuerdo al
		// seleccionado

		for (Hexagon h : hexagons) {
			h.pintar(xCenter, yCenter);
		}

		j.seek(hSelected.getrPos());
		j.update();
		j.pintar(xCenter, yCenter);

		hSelected.drawVecino(0, 0);
	}

	public void finalizar() {

	}

	public void centerCamera() {

	}

	public ArrayList<Hexagon> getHexagons() {
		return hexagons;
	}

	public void setHexagons(ArrayList<Hexagon> hexagons) {
		this.hexagons = hexagons;
	}

	public Hexagon gethSelected() {
		return hSelected;
	}

	public void sethSelected(Hexagon hSelected) {
		this.hSelected = hSelected;
	}

}
