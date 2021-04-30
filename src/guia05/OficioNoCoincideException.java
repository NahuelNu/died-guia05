package guia05;

public class OficioNoCoincideException extends Exception {
	
	public OficioNoCoincideException() {
		super("Oficio del trabajo no coincide con el del trabajador.");
	}
}
