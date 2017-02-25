package root.client;

import java.awt.event.MouseAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import processing.core.PApplet;
import processing.event.MouseEvent;
import setup.Pantalla;
import setup.ProcessingEvent;

public class Main extends PApplet {
	private LogicaClient logica;
	private static PApplet app;
	public static List<ProcessingEvent> processingEvents = Collections
			.synchronizedList(new ArrayList<ProcessingEvent>());

	// metodo para poder exportarse como una aplicación, NO TOCAR
	static public void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "root.client.Main" };
		if (passedArgs != null) {
			PApplet.main(concat(appletArgs, passedArgs));
		} else {
			PApplet.main(appletArgs);
		}
	}

	public void settings() {
		// fullScreen(app.FX2D);
		size(1200, 700, app.FX2D);
		smooth();
	}

	/**
	 * Configuraciones directas de processing con su lienzo.
	 */
	public void setup() {
		app = this;
		Pantalla.app = this;
		logica = new LogicaClient();
	}

	public void draw() {
		background(255);
		logica.pintar();
	}

	public void mousePressed() {
		for (ProcessingEvent p : processingEvents) {
			p.mousePressed();
		}
		logica.mousePressed();
	}

	public void mouseReleased() {
		for (ProcessingEvent p : processingEvents) {
			p.mouseReleased();
		}
		logica.mouseReleased();
	}

	public void mouseDragged() {
		for (ProcessingEvent p : processingEvents) {
			p.mouseDragged();
		}
		logica.mouseDragged();
	}

	public void keyPressed() {
		for (ProcessingEvent p : processingEvents) {
			p.keyPressed();
		}
		logica.keyPressed();
	}

	public static PApplet getApp() {
		return app;
	}

	public static void setApp(PApplet app) {
		Main.app = app;
	}
}
