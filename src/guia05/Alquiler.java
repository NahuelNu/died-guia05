package guia05;

import java.time.Duration;
import java.time.Instant;
import java.util.Objects;

public class Alquiler implements Contratable{
	private Herramienta herramienta;
	private Instant fechaInicio;		//Suponer nunca null
	private Instant fechaFin;
	private Instant fechaDevolucion;
	
	public Double costo() {
		try {
		return herramienta.getCostoPorDia() * Duration.between(fechaInicio, fechaDevolucion).toDays();
		} catch (NullPointerException e) {
			return herramienta.getCostoPorDia() * Duration.between(fechaInicio, Instant.now()).toDays();
		}
	}
	
	public Boolean enMora() {
		try {
		if(Duration.between(fechaInicio, fechaDevolucion).toDays() > 0)
			return true;
		return false;
		} catch (NullPointerException e) {
			if(Duration.between(fechaFin, Instant.now()).toDays() > 0 )
				return true;
			return false;
		}
	}
	
	public Boolean finalizado() {
		return !Objects.isNull(fechaDevolucion);
	}
}
