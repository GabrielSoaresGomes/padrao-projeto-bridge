public class XP extends Banco{
    public XP(float percentualIR) {
        super(percentualIR);
    }

    public float calcularRendimento() {
        return (this.valorInvestido * (1 + this.investimento.percentualRendimento())) * (1 - 0.05f);
    }
}
