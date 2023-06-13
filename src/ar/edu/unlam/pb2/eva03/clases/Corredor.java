package ar.edu.unlam.pb2.eva03.clases;

import ar.edu.unlam.pb2.eva03.interfaces.InterfazCorredor;

public class Corredor extends Socio implements InterfazCorredor{
	
	Integer distanciaPreferida;

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
	
	

}
