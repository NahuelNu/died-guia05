package guia05;

public class AgendaOcupadaException extends Exception {
	
	public AgendaOcupadaException() {
		super("El trabajador ya tiene un trabajo en esta fecha.");
	}

}
