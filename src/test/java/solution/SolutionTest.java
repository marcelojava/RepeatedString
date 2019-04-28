package solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void deveRetornar7PoisDeveaparecer7Vezes() {
        Solution solution = new Solution();
        long retorno = solution.repeatedString("aba", 10l);
        Assert.assertEquals(7l, retorno);
    }
    @Test
    public void deveRetornarNPoisDeveaparecerNVezes() {
        Solution solution = new Solution();
        long retorno = solution.repeatedString("aaa", 100l);
        Assert.assertEquals(100l, retorno);
    }

}
