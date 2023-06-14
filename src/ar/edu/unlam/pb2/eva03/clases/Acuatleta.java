package ar.edu.unlam.pb2.eva03.clases;


import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.InterfazCorredor;
import ar.edu.unlam.pb2.eva03.interfaces.InterfazNadador;

public class Acuatleta extends Socio implements InterfazNadador, InterfazCorredor{
	
	String estiloPreferido;
	Integer distanciaPreferida;
	
	public Acuatleta(Integer numeroDeSocio, String nombre) {
		super(numeroDeSocio, nombre);
	}
	
	public Acuatleta() {
		
	}

	public String getEstiloPreferido() {
		return estiloPreferido;
	}

	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	@Override
	public TipoDeEvento[] getTipo() {
		// TODO Auto-generated method stub
		return new TipoDeEvento[] {TipoDeEvento.CARRERA_10K,
								   TipoDeEvento.CARRERA_5K, 
								   TipoDeEvento.CARRERA_21K,
								   TipoDeEvento.CARRERA_42K, 
								   TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS,
								   TipoDeEvento.CARRERA_NATACION_EN_PICINA};
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

}
