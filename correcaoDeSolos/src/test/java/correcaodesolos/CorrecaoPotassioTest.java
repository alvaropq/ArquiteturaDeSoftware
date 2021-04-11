package correcaodesolos;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Álvaro
 */
public class CorrecaoPotassioTest {
    
    @Test
    public void testParticipacaoPotassioCTCAtual() {        
        assertEquals(1.2, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),3,FontePotassio.CLORETO_DE_POTASSIO,2500.0).participacaoPotassioCTCAtual(),0.1);
    }
    
    @Test
    public void testParticipacaoPotassioCTCIdeal() {        
        assertEquals(3, new CorrecaoPotassio(
                new Solo(),3,FontePotassio.CLORETO_DE_POTASSIO,2500.0).participacaoPotassioCTCIdeal(),0.1);
    }
    
    @Test
    public void testParticipacaoPotassioCTCAposCorrecao() {        
        assertEquals(3, new CorrecaoPotassio(
                new Solo(),3,FontePotassio.CLORETO_DE_POTASSIO,2500.0).participacaoPotassioCTCAposCorrecao(),0.1);
    }

    @Test
    public void testQuantidadeAplicar() {
        assertEquals(450.55, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),3,FontePotassio.CLORETO_DE_POTASSIO,2500.0).quantidadeAplicar(),0.1);
        assertEquals(502.53, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),3,FontePotassio.SULFATO_DE_POTASSIO,2500.0).quantidadeAplicar(),0.1);
        assertEquals(1187.80, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),3,FontePotassio.SULFATO_POTASSIO_MAGNESIO,2500.0).quantidadeAplicar(),0.1);
    }
    
    @Test
    public void testForneceraTambem() {        
        assertEquals(0.0, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),3,FontePotassio.CLORETO_DE_POTASSIO,2500.0).forneceraTambem(),0.1);
        assertEquals(85.43, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),3,FontePotassio.SULFATO_DE_POTASSIO,2500.0).forneceraTambem(),0.1);
        assertEquals(261.32, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),3,FontePotassio.SULFATO_POTASSIO_MAGNESIO,2500.0).forneceraTambem(),0.1);
    }
    
    @Test
    public void testForneceraTambem2() {        
        assertEquals("", new CorrecaoPotassio(
                new Solo(),3,FontePotassio.CLORETO_DE_POTASSIO,2500.0).forneceraTambem2());
        assertEquals("ENXOFRE", new CorrecaoPotassio(
                new Solo(),3,FontePotassio.SULFATO_DE_POTASSIO,2500.0).forneceraTambem2());
        assertEquals("ENXOFRE", new CorrecaoPotassio(
                new Solo(),3,FontePotassio.SULFATO_POTASSIO_MAGNESIO,2500.0).forneceraTambem2());
    }
    
    @Test
    public void testForneceraTambem3() {        
        assertEquals(0.0, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),3,FontePotassio.CLORETO_DE_POTASSIO,2500.0).forneceraTambem3(),0.1);
        assertEquals(0.0, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),3,FontePotassio.SULFATO_DE_POTASSIO,2500.0).forneceraTambem3(),0.1);
        assertEquals(213.80, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),3,FontePotassio.SULFATO_POTASSIO_MAGNESIO,2500.0).forneceraTambem3(),0.1);
    }
    
    @Test
    public void testForneceraTambem4() {        
        assertEquals("", new CorrecaoPotassio(
                new Solo(),3,FontePotassio.CLORETO_DE_POTASSIO,2500.0).forneceraTambem4());
        assertEquals("", new CorrecaoPotassio(
                new Solo(),3,FontePotassio.SULFATO_DE_POTASSIO,2500.0).forneceraTambem4());
        assertEquals("MAGNÉSIO", new CorrecaoPotassio(
                new Solo(),3,FontePotassio.SULFATO_POTASSIO_MAGNESIO,2500.0).forneceraTambem4());
    }
    
    @Test
    public void testCusto() {        
        assertEquals(1126.37, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),3,FontePotassio.CLORETO_DE_POTASSIO,2500.0).custo(),0.1);
        assertEquals(1256.33, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),3,FontePotassio.SULFATO_DE_POTASSIO,2500.0).custo(),0.1);
        assertEquals(2969.51, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),3,FontePotassio.SULFATO_POTASSIO_MAGNESIO,2500.0).custo(),0.1);
    }
    
}
