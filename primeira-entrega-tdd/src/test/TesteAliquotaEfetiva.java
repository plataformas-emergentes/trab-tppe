package test;

import app.IRPF;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TesteAliquotaEfetiva {
    private IRPF irpf;
    private float rendimentoTributavel;
    private float deducoes;
    private float expectedAliquotaEfetiva;

    // Construtor para receber os parâmetros
    public TesteAliquotaEfetiva(float rendimentoTributavel, float deducoes, float expectedAliquotaEfetiva) {
        this.rendimentoTributavel = rendimentoTributavel;
        this.deducoes = deducoes;
        this.expectedAliquotaEfetiva = expectedAliquotaEfetiva;
    }

    @Before
    public void setup() {
        irpf = new IRPF();
    }

    // Fonte de dados para os testes
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {4000f, 500f, 5.9f},
                {3000f, 0f, 2.28f},
                {2000f, 200f, 0f},
                {5000f, 1000f, 9.57f},
                {7000f, 1500f, 14.6f}
        });
    }

    @Test
    public void testCalcularAliquotaEfetiva() {
        irpf.criarRendimento("Salário", IRPF.TRIBUTAVEL, rendimentoTributavel);
        irpf.cadastrarContribuicaoPrevidenciaria(deducoes);
        float aliquotaEfetiva = irpf.calcularAliquotaEfetiva();
        assertEquals( expectedAliquotaEfetiva, aliquotaEfetiva, 0.1);
    }
}
