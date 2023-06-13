package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.clases.Corredor;
import ar.edu.unlam.pb2.eva03.clases.Socio;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;


public class Club {

	private String nombre;
	private HashSet<Socio> socios;
	private HashMap<String, Evento> competencias;
	
	public Club(String nombre, HashSet<Socio> socios, HashMap<String, Evento> competencias) {
		super();
		this.nombre = nombre;
		this.socios = socios;
		this.competencias = competencias;
	}
	
	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new HashSet<Socio>();
		this.competencias = new HashMap<String, Evento>();
	}
	
	public Club() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Socio> getSocios() {
		return socios;
	}

	public void setSocios(HashSet<Socio> socios) {
		this.socios = socios;
	}

	public HashMap<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(HashMap<String, Evento> competencias) {
		this.competencias = competencias;
	}

	public void agregarDeportista(Socio socio) {
		this.socios.add(socio);
		
	}

	public void crearEvento(TipoDeEvento carreraNatacionEnAguasAbiertas, String string) {
		// TODO Auto-generated method stub
		
	}

	public Object inscribirEnEvento(String string, Socio celeste) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
