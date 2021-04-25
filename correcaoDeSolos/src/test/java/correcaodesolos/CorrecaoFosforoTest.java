package correcaodesolos;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Álvaro
 */
public class CorrecaoFosforoTest {

    @Test
    public void testQuantidadeAplicar() {
        Solo solo = new Solo();
        solo.setFosforo(8.59);
        assertEquals(123.95, new CorrecaoFosforo(12.0,Fontes.SUPERFOSFATO_SIMPLES,0.7,
                solo,1260.00).quantidadeAplicar(),0.1);
        assertEquals(54.42, new CorrecaoFosforo(12.0,Fontes.SUPERFOSFATO_TRIPLO,0.7,
                solo,1260.00).quantidadeAplicar(),0.1);
        assertEquals(46.48, new CorrecaoFosforo(12.0,Fontes.MAP,0.7,
                solo,1260.00).quantidadeAplicar(),0.1);
        assertEquals(49.58, new CorrecaoFosforo(12.0,Fontes.DAP,0.7,
                solo,1260.00).quantidadeAplicar(),0.1);
        assertEquals(123.95, new CorrecaoFosforo(12.0,Fontes.YOORIN,0.7,
                solo,1260.00).quantidadeAplicar(),0.1);
        assertEquals(67.61, new CorrecaoFosforo(12.0,Fontes.FOSFATO_ARAD,0.7,
                solo,1260.00).quantidadeAplicar(),0.1);
        assertEquals(76.93, new CorrecaoFosforo(12.0,Fontes.FOSFATO_GAFSA,0.7,
                solo,1260.00).quantidadeAplicar(),0.1);
        assertEquals(69.72, new CorrecaoFosforo(12.0,Fontes.FOSFATO_DAOUI,0.7,
                solo,1260.00).quantidadeAplicar(),0.1);
        assertEquals(92.96, new CorrecaoFosforo(12.0,Fontes.FOSFATO_PATO_MINAS,0.7,
                solo,1260.00).quantidadeAplicar(),0.1);
        assertEquals(120.60, new CorrecaoFosforo(12.0,Fontes.ESCORIA_DE_THOMAS,0.7,
                solo,1260.00).quantidadeAplicar(),0.1);
        assertEquals(42.91, new CorrecaoFosforo(12.0,Fontes.ACIDO_FOSFORICO,0.7,
                solo,1260.00).quantidadeAplicar(),0.1);
        assertEquals(123.95, new CorrecaoFosforo(12.0,Fontes.MULTIF_MAGNESIANO,0.7,
                solo,1260.00).quantidadeAplicar(),0.1); 
    }

      @Test
    public void testForneceratambem() {
        Solo solo = new Solo();
        solo.setFosforo(8.59);
        assertEquals("ENXOFRE: 12.395079365079367 CÁLCIO: 34.70622222222223", new CorrecaoFosforo(12.0,Fontes.SUPERFOSFATO_SIMPLES,0.7,
                solo,1260.00).forneceraTambem());
        assertEquals(" CÁLCIO: 10.883484320557493", new CorrecaoFosforo(12.0,Fontes.SUPERFOSFATO_TRIPLO,0.7,
                solo,1260.00).forneceraTambem());
        assertEquals(" NITROGÊNIO: 4.183339285714286", new CorrecaoFosforo(12.0,Fontes.MAP,0.7,
                solo,1260.00).forneceraTambem());
        assertEquals(" NITROGÊNIO: 7.932850793650795", new CorrecaoFosforo(12.0,Fontes.DAP,0.7,
                solo,1260.00).forneceraTambem());
        assertEquals("MAGNÉSIO: 18.59261904761905 CÁLCIO: 34.70622222222223", new CorrecaoFosforo(12.0,Fontes.YOORIN,0.7,
                solo,1260.00).forneceraTambem());
        assertEquals(" CÁLCIO: 35.15695238095238", new CorrecaoFosforo(12.0,Fontes.FOSFATO_ARAD,0.7,
                solo,1260.00).forneceraTambem());
        assertEquals(" CÁLCIO: 40.006187192118226", new CorrecaoFosforo(12.0,Fontes.FOSFATO_GAFSA,0.7,
                solo,1260.00).forneceraTambem());
        assertEquals(" CÁLCIO: 31.375044642857144", new CorrecaoFosforo(12.0,Fontes.FOSFATO_DAOUI,0.7,
                solo,1260.00).forneceraTambem());
        assertEquals(" CÁLCIO: 26.02966666666667", new CorrecaoFosforo(12.0,Fontes.FOSFATO_PATO_MINAS,0.7,
                solo,1260.00).forneceraTambem());
        assertEquals(" CÁLCIO: 53.06433976833977", new CorrecaoFosforo(12.0,Fontes.ESCORIA_DE_THOMAS,0.7,
                solo,1260.00).forneceraTambem());
        assertEquals("", new CorrecaoFosforo(12.0,Fontes.ACIDO_FOSFORICO,0.7,
                solo,1260.00).forneceraTambem());
        assertEquals("ENXOFRE: 13.634587301587302 CÁLCIO: 22.31114285714286", new CorrecaoFosforo(12.0,Fontes.MULTIF_MAGNESIANO,0.7,
                solo,1260.00).forneceraTambem());
    }
    
    @Test
    public void testCusto() {
        Solo solo = new Solo();
        solo.setFosforo(8.59);
        assertEquals(156.18, new CorrecaoFosforo(12.0,Fontes.SUPERFOSFATO_SIMPLES,0.7,
                solo,1260.00).custo(),0.1);
        assertEquals(68.57, new CorrecaoFosforo(12.0,Fontes.SUPERFOSFATO_TRIPLO,0.7,
                solo,1260.00).custo(),0.1);
        assertEquals(58.57, new CorrecaoFosforo(12.0,Fontes.MAP,0.7,
                solo,1260.00).custo(),0.1);
        assertEquals(62.47, new CorrecaoFosforo(12.0,Fontes.DAP,0.7,
                solo,1260.00).custo(),0.1);
        assertEquals(156.18, new CorrecaoFosforo(12.0,Fontes.YOORIN,0.7,
                solo,1260.00).custo(),0.1);
        assertEquals(85.19, new CorrecaoFosforo(12.0,Fontes.FOSFATO_ARAD,0.7,
                solo,1260.00).custo(),0.1);
        assertEquals(96.94, new CorrecaoFosforo(12.0,Fontes.FOSFATO_GAFSA,0.7,
                solo,1260.00).custo(),0.1);
        assertEquals(87.85, new CorrecaoFosforo(12.0,Fontes.FOSFATO_DAOUI,0.7,
                solo,1260.00).custo(),0.1);
        assertEquals(117.13, new CorrecaoFosforo(12.0,Fontes.FOSFATO_PATO_MINAS,0.7,
                solo,1260.00).custo(),0.1);
        assertEquals(151.96, new CorrecaoFosforo(12.0,Fontes.ESCORIA_DE_THOMAS,0.7,
                solo,1260.00).custo(),0.1);
        assertEquals(54.06, new CorrecaoFosforo(12.0,Fontes.ACIDO_FOSFORICO,0.7,
                solo,1260.00).custo(),0.1);
        assertEquals(156.18, new CorrecaoFosforo(12.0,Fontes.MULTIF_MAGNESIANO,0.7,
                solo,1260.00).custo(),0.1);
    }
    
}
