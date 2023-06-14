package ar.edu.unlam.pb2.eva03.clases;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;


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
	
	
	public TipoDeEvento[] getTipo() {
		// TODO Auto-generated method stub
		return new TipoDeEvento[] {TipoDeEvento.CARRERA_BICICLETA};
	}

}
