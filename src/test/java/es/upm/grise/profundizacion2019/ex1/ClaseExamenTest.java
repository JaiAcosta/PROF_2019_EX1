//package es.upm.grise.profundizacion2019.ex1;
package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClaseExamenTest {

	@Test
	public void test1() {
		// Camino 1-2-1-3-4-5
		ClaseExamen examen= new ClaseExamen();
		float resultado=examen.metodoAProbar(4, 3);
		assertTrue(resultado==0);
	}
	@Test
	public void test2() {
		// Camino 1-3-4-5
		ClaseExamen examen= new ClaseExamen();
		float resultado=examen.metodoAProbar(5, 5);
		assertTrue(resultado==0);
	}
	


}
