public abstract class Banco {
    protected Investimento investimento;
    protected float valorInvestido;

    public Banco(float valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public void setInvestimento(Investimento investimento) {
        this.investimento = investimento;
    }

    public void setValorInvestido(float valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public abstract float calcularRendimento();
}
