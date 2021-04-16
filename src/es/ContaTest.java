package es;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContaTest {

	private Conta diogo;
	@BeforeEach
	void setUp() throws Exception {
		diogo = new Conta();
	}

	@Test
	void testConta() {
		//fail("Not yet implemented");
		assertEquals(100.0, diogo.getSaldo(),"Constrói uma conta igualando o saldo ao #MONTANTE_MINIMO");
	}

	@Test
	void testContaDouble() {
		//fail("Not yet implemented");
		assertEquals(saldoIncial, diogo.getSaldo(), "Não pode ser inferior ao #MONTANTE_MINIMO");
	}

	@Test
	void testDepositar() {
		//fail("Not yet implemented");
		assertEquals(diogo.depositar(50), diogo.getSaldo(), "Depositar uma certa quantia na conta");
	}

	@Test
	void testLevantar() {
		//fail("Not yet implemented");
		assertEquals(quantia, diogo.depositar(0), "Depositar uma certa quantia na conta");
	}

	@Test
	void testTransferir() {
		fail("Not yet implemented");
	}

}
