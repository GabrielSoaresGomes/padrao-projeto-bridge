import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class C6Test {
    @Test
    void deveRetornarInvestimentoC6DePoupanca() {
        Investimento investimento = new Poupanca();
        C6 c6 = new C6(1000f);
        c6.setInvestimento(investimento);
        assertEquals(945f,c6.calcularRendimento());
    }

    @Test
    void deveRetornarInvestimentoC6DeSelic() {
        Investimento investimento = new Selic();
        C6 c6 = new C6(1000f);
        c6.setInvestimento(investimento);
        assertEquals(990f, c6.calcularRendimento());
    }

    @Test
    void deveRetornarInvestimentoC6DeMXRF11() {
        Investimento investimento = new MXRF11();
        C6 c6 = new C6(1000f);
        c6.setInvestimento(investimento);
        assertEquals(1080f, c6.calcularRendimento());
    }
}
