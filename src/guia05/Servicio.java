package guia05;

public abstract class Servicio implements Contratable{
	protected Oficio oficio;
	protected Trabajador trabajador;
	protected Boolean urgente;
	
	public abstract Double costo();
	
	public Oficio getOficio() {
		return this.oficio;
	}
}
