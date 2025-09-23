package ar.edu.unlp.info.oo1.balanzaMejorada_Ej4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ProductoTest {

	private Producto queso;

	@BeforeEach
	void setUp() throws Exception {
		queso = new Producto();
	}

	@Test
	void testDescripcion() {
		queso.setDesc("Queso crema");
		assertEquals("Queso crema", queso.getDesc());
	}

	@Test
	void testPeso() {
		queso.setPeso(100);
		assertEquals(100, queso.getPeso());
	}

	@Test
	void testPrecioPorKilo() {
		queso.setPrecioPorKG(100);
		assertEquals(100, queso.getPrecioPorKG());
	}

	@Test
	void testPrecio() {
		queso.setPeso(0.1);
		queso.setPrecioPorKG(140);
		assertEquals(14, queso.getPrecio());
	}
	
}