package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TesteCadastrarDependente.class,
        TesteRendimentos.class,
        TesteCalculosDeducoesDependentes.class,
        TesteCadastroContribuicaoPrevidenciaria.class,
        TesteCadastroPensaoAlimenticia.class,
        TesteCadastroOutrasDeducoes.class,
        TesteBaseCalculoImposto.class,
        TesteImpostoTotalPorFaixa.class,
        TesteAliquotaEfetiva.class})
public class AllTests {

}