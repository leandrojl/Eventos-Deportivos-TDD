package ar.edu.unlam.pb2.eva03.clases;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.InterfazCiclista;
import ar.edu.unlam.pb2.eva03.interfaces.InterfazCorredor;
import ar.edu.unlam.pb2.eva03.interfaces.InterfazNadador;

public class Triatleta extends Socio implements InterfazCiclista, InterfazCorredor, InterfazNadador{
	
	String estiloPreferido;
	TipoDeBicicleta tipoDeBicicleta;
	
	public Triatleta(Integer numeroDeSocio, String nombre) {
		super(numeroDeSocio, nombre);
	}
	
	public Triatleta(Integer numeroDeSocio, String nombre, String estiloPreferido, TipoDeBicicleta tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.estiloPreferido = estiloPreferido;
		this.tipoDeBicicleta = tipoDeBicicleta;
	}
	
	public Triatleta() {
		
	}

	@Override
	public void nadar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void andarEnBicicleta() {
		// TODO Auto-generated method stub
		
	}

	public String getEstiloPreferido() {
		return estiloPreferido;
	}

	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}
	
	
}
