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
        assertEquals(0.012, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),3,Fontes.CLORETO_DE_POTASSIO,2500.0).participacaoPotassioCTCAtual(),0.1);
    }
    
    @Test
    public void testParticipacaoPotassioCTCIdeal() {        
        assertEquals(0.03, new CorrecaoPotassio(
                new Solo(),0.03,Fontes.CLORETO_DE_POTASSIO,2500.0).participacaoPotassioCTCIdeal(),0.1);
    }
    
    @Test
    public void testParticipacaoPotassioCTCAposCorrecao() {        
        assertEquals(0.03, new CorrecaoPotassio(
                new Solo(),0.03,Fontes.CLORETO_DE_POTASSIO,2500.0).participacaoPotassioCTCAposCorrecao(),0.1);
    }

    @Test
    public void testQuantidadeAplicar() {
        assertEquals(450.55, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),0.03,Fontes.CLORETO_DE_POTASSIO,2500.0).quantidadeAplicar(),0.1);
        assertEquals(502.53, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),0.03,Fontes.SULFATO_DE_POTASSIO,2500.0).quantidadeAplicar(),0.1);
        assertEquals(1187.80, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),0.03,Fontes.SULFATO_POTASSIO_MAGNESIO,2500.0).quantidadeAplicar(),0.1);
    }
    @Test
    public void testCusto() {        
        assertEquals(1126.37, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),0.03,Fontes.CLORETO_DE_POTASSIO,2500.0).custo(),0.1);
        assertEquals(1256.33, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),0.03,Fontes.SULFATO_DE_POTASSIO,2500.0).custo(),0.1);
        assertEquals(2969.51, new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),0.03,Fontes.SULFATO_POTASSIO_MAGNESIO,2500.0).custo(),0.1);
    }
    
    @Test
    public void testForneceraTambem() {
       assertEquals("", new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),0.03,Fontes.CLORETO_DE_POTASSIO,2500.0).forneceraTambem());
        assertEquals("ENXOFRE: 85.43049230769232", new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),0.03,Fontes.SULFATO_DE_POTASSIO,2500.0).forneceraTambem());
        assertEquals("ENXOFRE: 261.3168 MAGNÉSIO: 213.80465454545453", new CorrecaoPotassio(
                new Solo(8.59,0.15,5.76,1.63,3.67,0,5.35),0.03,Fontes.SULFATO_POTASSIO_MAGNESIO,2500.0).forneceraTambem());
    }  
}
