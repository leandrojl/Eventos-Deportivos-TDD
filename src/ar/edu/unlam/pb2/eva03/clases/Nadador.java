package ar.edu.unlam.pb2.eva03.clases;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Nadador extends Socio{
	
	String estiloPreferido;

	public Nadador(Integer numeroDeSocio, String nombre, String estiloPreferido) {
		super(numeroDeSocio, nombre);
		this.estiloPreferido = estiloPreferido;
	}
	
	public Nadador() {
		
	}

	public String getEstiloPreferido() {
		return estiloPreferido;
	}

	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}

	@Override
	public TipoDeEvento[] getTipo() {
		// TODO Auto-generated method stub
		return new TipoDeEvento[] {TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS, 
								   TipoDeEvento.CARRERA_NATACION_EN_PICINA};
	}

	
	
}
