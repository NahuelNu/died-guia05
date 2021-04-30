package guia05;

import java.time.Duration;
import java.util.List;

public class Trabajador {
	private String nombre;
	private String email;
	private Oficio oficio;
	private Double costoPorHora;
	private Double comision;
	private List <Trabajo> trabajosAsignados;
	
	/*public Trabajador(String n, String c,Oficio o, Double costo, Double com) {
		this.nombre = n;
		this.email = c;
		this.oficio = o;
		this.costoPorHora = costo;
		this.comision =com;
	}

	public Trabajador() {
	}*/
	
	/*public void prueba(Integer a) throws OficioNoCoincideException {
		if(a == 1)
		throw new OficioNoCoincideException();
		System.out.println("hola");
	}*/
	
	public void agregarTrabajo(Trabajo t) throws OficioNoCoincideException, AgendaOcupadaException {
		if( !(t.getServicio().getOficio().equals(this.oficio)) )
			throw new OficioNoCoincideException();
		else {
			for(Trabajo tt : trabajosAsignados) {
				if(Duration.between(tt.getFecha(),t.getFecha()).toDays() == 0)
					throw new AgendaOcupadaException();
			}
			trabajosAsignados.add(t);
		}
	}
	

	
	public String getNombre() {
		return this.nombre;
	}

	public Double getComision() {
		return this.comision;
	}
	
}
