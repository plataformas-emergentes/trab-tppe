package app;


public class CalculadoraAliquota {

    private final float totalRendimentosTributaveis;
    private final float impostoTotal;
    
    public CalculadoraAliquota(float totalRendimentosTributaveis, float impostoTotal) {
        this.totalRendimentosTributaveis = totalRendimentosTributaveis;
        this.impostoTotal = impostoTotal;
    }
    
    public float calcularAliquotaEfetiva() {
        if (totalRendimentosTributaveis > 0) {
            return (100 * impostoTotal) / totalRendimentosTributaveis;
        } else {
            return 0f;
        }
    }
}
    
    

