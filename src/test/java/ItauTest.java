import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ItauTest {
    @Test
    void deveRetornarInvestimentoItauDePoupanca() {
        Investimento investimento = new Poupanca();
        Itau itau = new Itau(1000f);
        itau.setInvestimento(investimento);
        assertEquals(892.5f, itau.calcularRendimento());
    }

    @Test
    void deveRetornarInvestimentoItauDeSelic() {
        Investimento investimento = new Selic();
        Itau itau = new Itau(1000f);
        itau.setInvestimento(investimento);
        assertEquals(935f, itau.calcularRendimento());
    }

    @Test
    void deveRetornarInvestimentoItauDeMXRF11() {
        Investimento investimento = new MXRF11();
        Itau itau = new Itau(1000f);
        itau.setInvestimento(investimento);
        assertEquals(1020f, itau.calcularRendimento());
    }
}
