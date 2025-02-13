package test;

import app.IRPF;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteImpostoTotalPorFaixa {

    IRPF irpf;

    @Before
    public void setup() {
        irpf = new IRPF();
    }

    @Test
    public void calculoImpostoPrimeiraFaixaIsento() {
        float imposto = irpf.calcularImpostoTotal(2259.2f);
        assertEquals(0f, imposto, 0f);
    }

    @Test
    public void calculoImpostoSegundaFaixa() {
        float imposto = irpf.calcularImpostoTotal(2800f);
        assertEquals(40.5f, imposto, 0.1f);
    }
    @Test
    public void calculoImpostoSTerceiraFaixa() {
        float imposto = irpf.calcularImpostoTotal(3500f);
        assertEquals(143.5f, imposto, 0.1f);
    }

    @Test
    public void calculoImpostoQuartaFaixa() {
        float imposto = irpf.calcularImpostoTotal(4600f);
        assertEquals(372.2f, imposto, 0.1f);
    }

    @Test
    public void calculoImpostoQuintaFaixa() {
        float imposto = irpf.calcularImpostoTotal(11500f);
        assertEquals(2266.4f, imposto, 0.1f);
    }

}
