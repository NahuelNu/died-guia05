package guia05;

public class Oficio {
	private String nombre;
	private Double costo;
	
	public Double getCosto() {
		return this.costo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Boolean equals(Oficio o) {
		return this.nombre == o.getNombre() && this.costo == o.getCosto();
	}
}
