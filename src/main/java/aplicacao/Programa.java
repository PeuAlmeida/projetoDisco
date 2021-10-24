package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Disco;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancoDisco-jpa");
		EntityManager em = emf.createEntityManager();
		
		Disco d1 = new Disco(null, "load", "Metallica", "Heavy Metal", 1996);
		Disco d2 = new Disco(null, "O Furacao e show", "Banda Djavu e DJ Juninho Portugal", "Estiloso", 2009);
		Disco d3 = new Disco(null, "Xou da xuxa 3", "Xuxa", "Xaxa", 1988);
		Disco d4 = new Disco(null, "Lightning Bolt", "Pearl Jam", "Grunge", 2013);
		
		em.getTransaction().begin();
		em.persist(d1);
		em.persist(d2);
		em.persist(d3);
		em.persist(d4);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
}
