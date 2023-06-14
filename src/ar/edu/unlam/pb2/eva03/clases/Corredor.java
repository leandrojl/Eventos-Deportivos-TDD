package ar.edu.unlam.pb2.eva03.clases;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.InterfazCorredor;

public class Corredor extends Socio implements InterfazCorredor{
	
	Integer distanciaPreferida;
	Integer cantidadKilometrosEntrenados;

	public Corredor(Integer numeroDeSocio, String nombre, Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
	}
	
	public Corredor() {
		
	}

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer cantidadKilometrosEntrenados) {
		this.cantidadKilometrosEntrenados = cantidadKilometrosEntrenados;
		
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
	public TipoDeEvento[] getTipo() {
		// TODO Auto-generated method stub
		return new TipoDeEvento[] {TipoDeEvento.CARRERA_10K, 
								   TipoDeEvento.CARRERA_21K, 
								   TipoDeEvento.CARRERA_42K,
								   TipoDeEvento.CARRERA_5K};
	}
	
	

}
