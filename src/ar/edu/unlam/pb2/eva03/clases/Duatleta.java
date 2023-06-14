package ar.edu.unlam.pb2.eva03.clases;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.InterfazCiclista;
import ar.edu.unlam.pb2.eva03.interfaces.InterfazCorredor;

public class Duatleta extends Socio implements InterfazCorredor,InterfazCiclista{
	
	Integer distanciaPreferida;
	TipoDeBicicleta tipoDeBicicleta;
	
	public Duatleta(Integer numeroDeSocio, String nombre) {
		super(numeroDeSocio, nombre);
	}
	
	public Duatleta() {
		
	}

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
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
	public TipoDeEvento[] getTipo() {
		// TODO Auto-generated method stub
		return new TipoDeEvento[] {TipoDeEvento.CARRERA_BICICLETA,
									TipoDeEvento.CARRERA_10K, 
									TipoDeEvento.CARRERA_21K, 
									TipoDeEvento.CARRERA_42K,
									TipoDeEvento.CARRERA_5K};
	}

	@Override
	public void andarEnBicicleta() {
		// TODO Auto-generated method stub
		
	}

}
