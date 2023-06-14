package ar.edu.unlam.pb2.eva03.clases;

import java.util.Objects;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;


public abstract class Socio {
	
	Integer numeroDeSocio;
	String nombre;
	
	public Socio(Integer numeroDeSocio, String nombre) {
		super();
		this.numeroDeSocio = numeroDeSocio;
		this.nombre = nombre;
	}
	
	public Socio() {
		
	}
	
	public abstract TipoDeEvento[] getTipo();

	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}

	public void setNumeroDeSocio(Integer numeroDeSocio) {
		this.numeroDeSocio = numeroDeSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroDeSocio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		return Objects.equals(numeroDeSocio, other.numeroDeSocio);
	}

}
