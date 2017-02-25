package setup;

import processing.core.PApplet;
import processing.core.PVector;
import root.client.Main;

public class Camera {

	static Seguible target;
	static PApplet app = Main.getApp();

	public static void update(PVector pos) {
		app.translate(pos.x, pos.y);
	}
	
}
