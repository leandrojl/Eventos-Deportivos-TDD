package ar.edu.unlam.pb2.eva03.clases;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;

public class Ciclista extends Socio{
	
	TipoDeBicicleta tipoDeBicicleta;

	public Ciclista(Integer numeroDeSocio, String nombre, TipoDeBicicleta tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.tipoDeBicicleta = tipoDeBicicleta;
	}
	
	public Ciclista() {
		
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}
	
	

}
