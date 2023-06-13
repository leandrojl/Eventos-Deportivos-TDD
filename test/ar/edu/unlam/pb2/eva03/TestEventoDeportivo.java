package ar.edu.unlam.pb2.eva03;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.eva03.clases.Ciclista;
import ar.edu.unlam.pb2.eva03.clases.Corredor;
import ar.edu.unlam.pb2.eva03.clases.Nadador;
import ar.edu.unlam.pb2.eva03.clases.Socio;
import ar.edu.unlam.pb2.eva03.clases.Triatleta;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.excepciones.NoEstaPreparadoException;

public class TestEventoDeportivo {
	
	@Test
	public void queSePuedaCrearUnNadador() {
		Nadador nuevo = new Nadador(1, "Camila", "Espalda");

		assertEquals("Espalda", nuevo.getEstiloPreferido());
		assertEquals((Integer)1, nuevo.getNumeroDeSocio());
	}
	
	@Test
	public void queSePuedaCrearUnCorredor() {
		Corredor nuevo = new Corredor(2, "Carolina", 10000);
	
		
		assertEquals((Integer)10000, nuevo.getDistanciaPreferida());
		assertEquals((Integer)2, nuevo.getNumeroDeSocio());
	}
	
	@Test
	public void  queSePuedaCrearUnCiclista() {
		Ciclista nuevo = new Ciclista(3, "Enzo", TipoDeBicicleta.RUTA);

		assertEquals("Ruta", nuevo.getTipoDeBicicleta());
		assertEquals((Integer) 3, nuevo.getNumeroDeSocio());
	}

	@Test
	public void  queSePuedaCrearUnTriatleta() {
		Triatleta nuevo = new Triatleta(4, "Luna", "Olimpico", TipoDeBicicleta.TRIA);
		
		//assertEquals("Olimpico", nuevo.getDistanciaPreferida());
		assertEquals(TipoDeBicicleta.TRIA, nuevo.getTipoDeBicicleta());
		assertEquals((Integer)4, nuevo.getNumeroDeSocio());
	}
	
	@Test
	public void  queSePuedanIncorporarDistintosDeportistas() {
		// El número de socio no se puede repetir
		Club actual = new Club("CARP");
		
		actual.agregarDeportista(new Corredor(1000, "Camila", 42000));
		actual.agregarDeportista(new Corredor(1001, "Natalia", 5000));
		actual.agregarDeportista(new Corredor(1002, "Jorge", 21000));
		actual.agregarDeportista(new Nadador(1003, "Lucrecia", "Pecho"));
		actual.agregarDeportista(new Triatleta(1004, "Tamara", "Olimpico", TipoDeBicicleta.RUTA));
		actual.agregarDeportista(new Ciclista(1005, "Alberto", TipoDeBicicleta.MOUNTAIN));
		actual.agregarDeportista(new Ciclista(1006, "Domingo", TipoDeBicicleta.BMX));
		actual.agregarDeportista(new Corredor(1007, "Luciana", 10000));
		actual.agregarDeportista(new Nadador(1008, "Luna", "Crol"));
		actual.agregarDeportista(new Nadador(1009, "Victor", "Mariposa"));
		actual.agregarDeportista(new Triatleta(1004, "Cecilia", "Ironman", TipoDeBicicleta.TRIA));
			
		assertEquals(10, actual.getSocios().size());		
	}
	
	@Test (expected = NoEstaPreparadoException.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnaCarreraDeNatacion () throws NoEstaPreparadoException{	
		// En las carreras de natación sólo pueden inscribirse los que sean INadador
		Socio celeste = new Corredor(1000, "Celeste", 10000);
		Club actual = new Club("Sitas");
		actual.agregarDeportista(celeste);
		actual.crearEvento(TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS, "Maraton de aguas abiertas");
		
		assertNotEquals((Integer)1, actual.inscribirEnEvento("Maraton de aguas abiertas", celeste));		
	}
	
	@Test (expected = NoEstaPreparadoException.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnTriatlon () throws NoEstaPreparadoException{		
		// En los triatlones sólo pueden inscribirse los que sean INadador & ICiclista
		Socio celeste = new Corredor(1000, "Celeste", 10000);
		Club actual = new Club("Sitas");
		
		actual.crearEvento(TipoDeEvento.TRIATLON_IRONMAN, "Triatlon Khona");
		
		assertNotEquals((Integer)1, actual.inscribirEnEvento("Triatlon Khona", celeste));		
	}
	
	@Test
	public void  queUnCorredorPuedaCorrerUnaMaraton() throws NoEstaPreparadoException{		
		Socio celeste = new Corredor(999, "Celeste", 42000);
		Club actual = new Club("Moron");
				
		((Corredor)celeste).setCantidadDeKilometrosEntrenados(100000);
		actual.crearEvento(TipoDeEvento.CARRERA_42K, "Maraton de New York");
		
		assertEquals((Integer)1, actual.inscribirEnEvento("Maraton de New York", celeste));			
	}
}
