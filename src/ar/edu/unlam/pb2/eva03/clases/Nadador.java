package ar.edu.unlam.pb2.eva03.clases;

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

	
	
}
