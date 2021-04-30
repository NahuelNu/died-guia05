package guia05;

import java.time.Instant;
import java.util.Objects;

public class Trabajo implements Contratable{
	//private Trabajador trabajador;
	private Servicio servicio;
	private Instant fecha;
	
	public Boolean finalizado() {
		return !Objects.isNull(fecha);
	}

	public Servicio getServicio() {
		return this.servicio;
	}

	public Instant getFecha() {
		
		return this.fecha;
	}

}
