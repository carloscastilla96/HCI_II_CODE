package juego;

import processing.core.PApplet;
import processing.core.PVector;
import root.client.Main;
import setup.Pantalla;

public class Jugador {

	private PVector pos, acel, vel;

	float x, y;
	float xReal, yReal;

	PApplet app = Pantalla.app;

	private float maxspeed = 3;
	private float maxforce = 1;

	public Jugador(float x, float y) {
		pos = new PVector(x, y);
		vel = new PVector(0, 0);
		acel = new PVector(0, 0);
	}

	public void mover() {
		xReal += 0.2f;
	}

	public void pintar(float xCenter, float yCenter) {
		app.fill(200);
		app.ellipse(pos.x - xCenter, pos.y - yCenter, 20, 20);
		// acel = new PVector(0.1f, 0);

	}

	public void seek(PVector target) {
		PVector desired = PVector.sub(target, pos);
		desired.normalize();
		desired.mult(maxspeed);
		PVector steer = PVector.sub(desired, vel);

		// Limit the magnitude of the steering force.
		steer.limit(maxforce);

		applyForce(steer);

	}

	// Method to update location
	public void update() {
		// Update velocity
		vel.add(acel);
		// Limit speed
		vel.limit(maxspeed);
		pos.add(vel);
		// Reset accelerationelertion to 0 each cycle
		acel.mult(0);
	}

	public void applyForce(PVector force) {
		// We could add mass here if we want A = F / M
		acel.add(force);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public PVector getPos() {
		return pos;
	}

	public void setPos(PVector pos) {
		this.pos = pos;
	}

	public PVector getAcel() {
		return acel;
	}

	public void setAcel(PVector acel) {
		this.acel = acel;
	}

	public PVector getVel() {
		return vel;
	}

	public void setVel(PVector vel) {
		this.vel = vel;
	}

}
