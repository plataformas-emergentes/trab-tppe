## Entrega 1 - TDD

**Valor:** 20 pontos  
**Data de entrega:** 13/12/2024, 23:59hs.

Junto desse enunciado encontra-se o código da calculadora de IRPF, iniciado em sala de aula. Esse código já contempla os testes para as seguintes funcionalidades (e suas respectivas unidades).

| Classe                                  | Funcionalidade                    |
|:----------------------------------------|:----------------------------------|
| TesteCadastrarDependente                | Cadastrar dependentes             |
| TesteRendimentos                        | Cadastrar rendimentos             |
| TesteCalculosDeducoesDependentes        | Calcular deduções por dependentes |
| TesteCadastroContribuicaoPrevidenciaria | Calcular deducoes por previdencia |
| TesteCadastroPensaoAlimenticia          | Calcular deducoes por pensoes     |
| TesteCadastroOutrasDeducoes             | Calcular outros tipos de deducoes |

Ainda não estão implementados os testes e as unidades para o calcula:
- a base de cálculo do imposto,
- os impostos por faixas e o total do imposto,
- e a alíquota efetiva do imposto pago.

Para essa entrega os grupos deverão criar testes triangulados (parametrizados, preferencialmente) para cada uma das unidades mencionadas acima, e os testes têm que estar integrados à suíte de testes presente no arquivo ``AllTests.java``. 
