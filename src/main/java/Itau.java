public class Itau extends Banco{
    public Itau(float percentualIR) {
        super(percentualIR);
    }

    public float calcularRendimento() {
        return (this.valorInvestido * (1 + this.investimento.percentualRendimento())) * (1 - 0.15f);
    }
}
