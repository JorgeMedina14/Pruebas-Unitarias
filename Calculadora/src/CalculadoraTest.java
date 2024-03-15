import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraTest {
    @Test
    public void testSuma(){
        Calculadora calculadora = new Calculadora();
        assertEquals(7, calculadora.suma(3,4));
    }
    @Test
    public void testResta() {
        Calculadora calculadora = new Calculadora();
        assertEquals(0, calculadora.resta(3, 3));
    }

    @Test
    public void testMultiplicacion() {
        Calculadora calculadora = new Calculadora();
        assertEquals(10, calculadora.multiplicacion(5, 2));
    }

    @Test
    public void testDivision() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.division(6, 3));
    }

    @Test
    public void testDivisionPorCero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calculadora.division(5, 0));
    }
}
