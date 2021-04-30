package guia05;

public class AlquilerNoEntregadoException extends Exception {
	
	public AlquilerNoEntregadoException() {
		super("Ya posee dos alquileres.");
	}
}
