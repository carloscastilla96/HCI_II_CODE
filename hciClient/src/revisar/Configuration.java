package revisar;

import processing.core.PApplet;
import root.client.Main;

public class Configuration {
	static PApplet app;
	static Configuration c;

	public Configuration() {
		app = Main.getApp();

	}

	public Configuration getInstance() {
		if (c == null) {
			c = new Configuration();
		}
		return c;
	}

	public static void pantalla() {

	}

	public static PApplet getApp() {
		return app;
	}

	public static void setApp(PApplet app) {
		Configuration.app = app;
	}

}
