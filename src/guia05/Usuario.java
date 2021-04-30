package guia05;

import java.util.List;

public class Usuario {
	private String email;
	private List<Contratable> itemsContratados;
	
	public void Contratar (Contratable c) throws AlquilerNoEntregadoException {
		if(itemsContratados.size()>=2)
			throw new AlquilerNoEntregadoException();
		else 
			this.itemsContratados.add(c);
	}
}
