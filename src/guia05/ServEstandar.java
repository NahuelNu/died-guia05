package guia05;

public class ServEstandar extends Servicio{

	@Override
	public Double costo() {
		Double cost = this.oficio.getCosto() + this.trabajador.getComision();
		if(this.urgente) {
			return cost + 0.5*cost;
		}
		else return cost;
	}

}
