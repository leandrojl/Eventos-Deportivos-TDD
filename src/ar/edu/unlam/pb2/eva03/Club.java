package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.clases.Corredor;
import ar.edu.unlam.pb2.eva03.clases.Socio;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.excepciones.EventoInexistenteException;
import ar.edu.unlam.pb2.eva03.excepciones.NoEstaPreparadoException;
import ar.edu.unlam.pb2.eva03.excepciones.SocioInexistenteException;



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

	public void crearEvento(TipoDeEvento tipoEvento, String nombreEvento) {
		Evento evento = crearUnEvento(nombreEvento, tipoEvento);
		this.competencias.put(nombreEvento, evento);
	}

	private Evento crearUnEvento(String nombreEvento, TipoDeEvento tipoEvento) {
		
		return new Evento(nombreEvento, tipoEvento);
	}

	public Object inscribirEnEvento(String eventoDeportivo, Socio socio) throws EventoInexistenteException, SocioInexistenteException, NoEstaPreparadoException {
		//1) Buscar evento
		//2)Buscar deportista
		//3) Agregar deportista al evento
		Evento evento = buscarEventoDeportivo(eventoDeportivo);
		Socio deportista = buscarDeportista(socio);
		agregarDeportistaAlEvento(evento, deportista);
		
		return null;
	}

	private void agregarDeportistaAlEvento(Evento evento, Socio deportista) throws NoEstaPreparadoException {
		validarDeportista(evento, deportista);
		evento.agregarDeportista(deportista);
		
	}

	private Boolean validarDeportista(Evento evento, Socio deportista) throws NoEstaPreparadoException {
		
		for(int i=0; i<deportista.getTipo().length;i++) {
			if(deportista.getTipo()[i].equals(evento.getTipo())) {
				return true;
			}
		}
		
		throw new NoEstaPreparadoException("No esta preparado para ese evento");
		
	}

	private Socio buscarDeportista(Socio socio) throws SocioInexistenteException {
		
		for(Socio deportista: socios) {
				if(deportista.getNumeroDeSocio().equals(socio.getNumeroDeSocio())) {
				
				return deportista;
				
			}
		}
		
		 throw new SocioInexistenteException("socio inexistente");
		
	}

	private Evento buscarEventoDeportivo(String eventoDeportivo) throws EventoInexistenteException {
		
		if(this.competencias.containsKey(eventoDeportivo)) {
			
			return this.competencias.get(eventoDeportivo);
		}
		
		throw new EventoInexistenteException("Evento inexistente");
	}
	
	
	
}
