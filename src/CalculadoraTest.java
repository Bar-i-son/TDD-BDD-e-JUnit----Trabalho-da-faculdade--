import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test
    @DisplayName("Deve somar dois números positivos corretamente")
    void testarSomaDeDoisNumerosPositivos() { [cite: 56]

        int a = 5; [cite: 59]
        int b = 3; [cite: 60]
        int resultadoEsperado = 8; [cite: 61]


        int resultadoObtido = calc.somar(a, b); [cite: 63]


        assertEquals(resultadoEsperado, resultadoObtido); [cite: 65]
    }

    @Test
    @DisplayName("Deve somar um número positivo e um negativo")
    void testarSomaComNumeroNegativo() {
        assertEquals(2, calc.somar(5, -3));
        assertEquals(-2, calc.somar(-5, 3));
    }

    @Test
    @DisplayName("Deve subtrair dois números corretamente")
    void testarSubtracao() {
        assertEquals(10, calc.subtrair(15, 5));
        assertEquals(0, calc.subtrair(5, 5));
        assertEquals(-5, calc.subtrair(0, 5));
    }

    @Test
    @DisplayName("Deve multiplicar dois números corretamente")
    void testarMultiplicacao() {
        assertEquals(15, calc.multiplicar(3, 5));
        assertEquals(0, calc.multiplicar(100, 0));
        assertEquals(-10, calc.multiplicar(2, -5));
    }

    @Test
    @DisplayName("Deve dividir dois números corretamente")
    void testarDivisao() {
        assertEquals(2.0, calc.dividir(10, 5));
        assertEquals(2.5, calc.dividir(5, 2));
    }

    @Test
    @DisplayName("Deve lançar ArithmeticException ao tentar dividir por zero")
    void testarDivisaoPorZero() {

        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> {

                    calc.dividir(10, 0);
                }
        );


        assertEquals("Divisão por zero!", exception.getMessage());
    }

}
