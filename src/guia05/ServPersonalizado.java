package guia05;

public class ServPersonalizado extends Servicio{
	Double costoMateriales;
	Double costoTransporte;
	Double presupuesto;
	
	public Double costo() {
		Double cost = this.costoMateriales + this.costoTransporte + this.presupuesto;
		if(this.urgente) {
			return cost + 0.5*cost;
		}
		return 	cost;
	}

}
