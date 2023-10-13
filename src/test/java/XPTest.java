import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class XPTest {
    @Test
    void deveRetornarInvestimentoXPDePoupanca() {
        Investimento investimento = new Poupanca();
        XP xp = new XP(1000f);
        xp.setInvestimento(investimento);
        assertEquals(997.5f,xp.calcularRendimento());
    }

    @Test
    void deveRetornarInvestimentoXPDeSelic() {
        Investimento investimento = new Selic();
        XP xp = new XP(1000f);
        xp.setInvestimento(investimento);
        assertEquals(1045f, xp.calcularRendimento());
    }

    @Test
    void deveRetornarInvestimentoXPDeMXRF11() {
        Investimento investimento = new MXRF11();
        XP xp = new XP(1000f);
        xp.setInvestimento(investimento);
        assertEquals(1140f, xp.calcularRendimento());
    }
}
