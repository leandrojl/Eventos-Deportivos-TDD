package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.clases.Socio;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {
	
	private String nombreEvento;
	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private HashMap<Integer, Socio> participantes;
	
	public Evento(TipoDeEvento tipo, Integer numeroDeInscripcion, HashMap<Integer, Socio> participantes) {
		super();
		this.tipo = tipo;
		this.numeroDeInscripcion = numeroDeInscripcion;
		this.participantes = participantes;
	}
	
	public Evento() {
		this.participantes = new HashMap<Integer, Socio>();
	}

	public Evento(String nombreEvento, TipoDeEvento tipoEvento) {
		this.nombreEvento = nombreEvento;
		this.tipo = tipoEvento;
		this.participantes = new HashMap<Integer, Socio>();
	}

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}

	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}

	public void setNumeroDeInscripcion(Integer numeroDeInscripcion) {
		this.numeroDeInscripcion = numeroDeInscripcion;
	}

	public Map<Integer, Socio> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(HashMap<Integer, Socio> participantes) {
		this.participantes = participantes;
	}

	public void agregarDeportista(Socio deportista) {
		this.participantes.put(deportista.getNumeroDeSocio(), deportista);
		
	}
	
	
}
