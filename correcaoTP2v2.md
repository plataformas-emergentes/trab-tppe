# correção da entrega 2:
## Critérios de correção do TP2
## Critérios avaliados para refatorações automatizadas (Refat. 1 e 3):
### Crit. 1 - Testes estão passando sem erros?
### Crit. 2 - A execução da refatoração foi corretaa? (Em especial para a refatoração substituir método por objeto-método). Crit. 3 - Testes estão integrados à suite de testes?
-10% para cada critério não atendido em cada unidade implementada.

### Critérios avaliados para refatoração "Substituir método por objeto-método": 
Crit. 1 - Variáveis do método são transformadas em atributos da classe do objeto-método? 
Referência para o objeto de origem foi utilizada? 
Crit. 2 - O método de origem se transformou em uma instanciação do metodo-objeto seguida por uma chamada ao método?
Crit. 3 - Testes estão passando sem erros?

## Unidades a serem implementadas:
Refat. 1 - Extrair método
Refat. 2 - Substituir método por objeto-método
Refat. 3 - Extrair classe

## Avaliação
Critérios	Refat. 1	Refat. 2	Refat. 3
Crit. 1	Ok	NOk	NOk
Crit. 2	Ok	NOk	NOk
Crit. 3	Ok	Ok	NOk
TOTAL	30	10	00

## Observações:

Refatoração "Substituir método por objeto-metodo" deixou elementos no método de origem, não criou referencia para o objeto de origem.
Refatoração "Extrair classe" não foi realizada.