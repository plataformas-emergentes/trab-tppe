package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import app.IRPF;

@RunWith(Parameterized.class)
public class TesteBaseCalculoImposto {

    private IRPF irpf;
    private float rendimento;
    private float contribuicaoPrevidenciaria;
    private float deducaoIntegral;
    private float expectedBaseCalculo;

    public TesteBaseCalculoImposto(float rendimento, float contribuicaoPrevidenciaria, float deducaoIntegral, float expectedBaseCalculo) {
        this.rendimento = rendimento;
        this.contribuicaoPrevidenciaria = contribuicaoPrevidenciaria;
        this.deducaoIntegral = deducaoIntegral;
        this.expectedBaseCalculo = expectedBaseCalculo;
    }

    @Before
    public void setup() {
        irpf = new IRPF();
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5000f, 1000f, 500f, 3500f},
                {10000f, 3000f, 2000f, 5000f},
                {7000f, 1500f, 800f, 4700f},
                {4500f, 1200f, 300f, 3000f},
                {3000f, 1000f, 1000f, 1000f}
        });
    }

    @Test
    public void testeBaseCalculoImpostoParametrizado() {
        irpf.criarRendimento("Salário", IRPF.TRIBUTAVEL, rendimento);
        irpf.cadastrarContribuicaoPrevidenciaria(contribuicaoPrevidenciaria);
        irpf.cadastrarDeducaoIntegral("Previdência", deducaoIntegral);

        assertEquals(expectedBaseCalculo, irpf.calcularBaseDeCalculo(), 0.01f);
    }
}