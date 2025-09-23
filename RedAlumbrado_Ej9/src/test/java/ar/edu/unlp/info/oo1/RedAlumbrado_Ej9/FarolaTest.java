package ar.edu.unlp.info.oo1.RedAlumbrado_Ej9;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FarolaTest {
	private Farola farolaUno;
	private Farola farolaDos;

	@BeforeEach
	void setUp() throws Exception {
		this.farolaUno = new Farola();
		this.farolaDos = new Farola();
	}

	@Test
	void testConstructor() {
		assertFalse(farolaUno.isOn(), "La farolaUno no está apagada");
		assertTrue(farolaUno.isOff(), "La farolaUno no está apagada");
		assertTrue(farolaUno.getNeightbors().isEmpty(), "La farolaUno no debería tener vecinos");
	}

	@Test
	void testPairWithNeighbor() {
		farolaUno.pairWithNeightbor(farolaDos);
		assertTrue(farolaUno.getNeightbors().contains(farolaDos));
		assertTrue(farolaDos.getNeightbors().contains(farolaUno));
	}

	@Test
	void testTurnOnAndOff() {
		farolaUno.pairWithNeightbor(farolaDos);
		farolaUno.turnOn();
		assertTrue(farolaUno.isOn());
		assertTrue(farolaDos.isOn());
		farolaUno.turnOff();
		assertFalse(farolaUno.isOn());
		assertFalse(farolaDos.isOn());

		farolaDos.turnOn();
		assertTrue(farolaUno.isOn());
		assertTrue(farolaDos.isOn());
		farolaDos.turnOff();
		assertFalse(farolaUno.isOn());
		assertFalse(farolaDos.isOn());
	}
}
