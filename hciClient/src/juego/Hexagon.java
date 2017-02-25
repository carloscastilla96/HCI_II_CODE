package juego;

import pantallas.Juego;
import processing.core.PApplet;
import processing.core.PVector;
import root.client.Main;
import setup.Pantalla;

public class Hexagon {
	private PApplet app = Pantalla.app;

	float xReal, yReal;
	float x, y;

	private float radio;
	private float ancho;
	private boolean selected = false;
	private Juego j;
	private PVector rPos;

	public Hexagon(Juego j, float x, float y, float radio) {
		this.j = j;
		this.xReal = x;
		this.yReal = y;
		this.rPos = new PVector(x, y);
		this.radio = radio;
		this.ancho = (app.sqrt(3) / 2 * (radio * 2));
	}

	public void pintar(float xCenter, float yCenter) {
		x = xReal - xCenter;
		y = yReal - yCenter;
		app.fill(255);
		if (selected)
			app.fill(20);
		dHexagon(x, y);
	}

	public void dHexagon(float x, float y) {
		app.stroke(0);
		app.beginShape();
		float angle = app.TWO_PI / 6;
		for (float a = app.PI / 6; a < app.TWO_PI; a += angle) {
			float vx = x + app.cos(a) * radio;
			float vy = y + app.sin(a) * radio;
			app.vertex(vx, vy);
		}
		app.endShape(app.CLOSE);
	}

	public void drawVecino(float xFix, float yFix) {
		float angle = app.TWO_PI / 6;
		for (int i = 0; i < 6; i++) {
			float xVecino = app.cos(angle * i) * ancho;
			float yVecino = app.sin(angle * i) * ancho;
			// app.noStroke();

			if (app.dist(app.mouseX, app.mouseY, x + xVecino, y + yVecino) < ancho / 2) {
				app.fill(200);
				app.beginShape();

				for (float a = app.PI / 6; a < app.TWO_PI; a += angle) {
					float vx = x + xVecino + app.cos(a) * radio;
					float vy = y + yVecino + app.sin(a) * radio;
					app.vertex(vx, vy);
				}

				app.endShape(app.CLOSE);

				app.fill(0);
				app.ellipse(xVecino, yVecino, 10, 10);

				if (app.mousePressed) {
					this.selected = false;

					// xr= xReal

					Hexagon h = new Hexagon(j, xReal + xVecino, yReal + yVecino, radio);
					j.sethSelected(h);
					h.setSelected(true);
					j.getHexagons().add(h);

					app.mousePressed = false;
				}
			} else {
				// app.fill(255);
			}
		}
	}

	private void drawSelected() {
		// app.fill(gray);
	}

	public void mover() {

	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public float getX() {
		return xReal;
	}

	public void setX(float x) {
		this.xReal = x;
	}

	public float getY() {
		return yReal;
	}

	public void setY(float y) {
		this.yReal = y;
	}

	public PVector getrPos() {
		return rPos;
	}

	public void setrPos(PVector rPos) {
		this.rPos = rPos;
	}

}
