package info;

public class Resources {
	private static Resources r;

	// Aqu� se deber�n guardar todas las imagenes que se van a utilizar para
	// cada nivel;

	public Resources() {

	}

	public static Resources getInstance() {
		if (r == null) {
			r = new Resources();
		}
		return r;
	}
}
