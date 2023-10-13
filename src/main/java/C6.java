public class C6 extends Banco{
    public C6(float valorInvestido) {
        super(valorInvestido);
    }

    public float calcularRendimento() {
        return (this.valorInvestido * (1 + this.investimento.percentualRendimento())) * (1 - 0.1f);
    }
}
