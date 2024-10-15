package practica_t3_2.pr3_2;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalcDescTest {

	private CalcDesc calcDesc;
	
	@BeforeEach
	public void setup() {
		calcDesc = new CalcDesc();
	}
	
	@Test
	public void testAplicarDesc_precioNegativo_throwsException() {
		assertThrows(IllegalArgumentException.class, () -> calcDesc.aplicarDescuento(-100, 10));
		
	}
	
	@Test
	public void testAplicarDesc_descuentoNegativo_throwsException() {
		assertThrows(IllegalArgumentException.class, () -> calcDesc.aplicarDescuento(100, -10));
		
	}
	
	@Test
	public void testAplicarDesc_descuentoMayor100_throwsException() {
		assertThrows(IllegalArgumentException.class, () -> calcDesc.aplicarDescuento(100, 200));
		
	}
	
	@Test
	public void testAplicarDesc_20perDe100_devuelve80() {
		assertEquals(80,calcDesc.aplicarDescuento(100, 20));
	}
	
	@Test
	public void testAplicarDesc_100perDe100_devuelve0() {
		assertEquals(0,calcDesc.aplicarDescuento(100, 100));
	}
	
	@Test
	public void testAplicarDesc_0perDe100_devuelve100() {
		assertEquals(100,calcDesc.aplicarDescuento(100, 0));
	}
	
	@Test
	public void testAplicarDesc_precio0_devuelve0() {
		assertEquals(0,calcDesc.aplicarDescuento(0, 100));
	}
	
}
