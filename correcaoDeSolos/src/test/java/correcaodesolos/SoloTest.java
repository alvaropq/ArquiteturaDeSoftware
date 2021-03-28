package correcaodesolos;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Álvaro
 */
public class SoloTest {

    @Test
    public void testTeorIdealTexturaArgiloso() {
            assertEquals(9.0, new Solo(TexturaSolo.ARGILOSO,10.23,0.82,12.45,3.47,1.10,0,5.15).getTeorIdealFosforo(), 0.0);
            assertEquals(0.35,new Solo(TexturaSolo.ARGILOSO,10.23,0.82,12.45,3.47,1.10,0,5.15).getTeorIdealPotassio() , 0.0);
            assertEquals(6.0, new Solo(TexturaSolo.ARGILOSO,10.23,0.82,12.45,3.47,1.10,0,5.15).getTeorIdealCalcio(), 0.0);
            assertEquals(1.5, new Solo(TexturaSolo.ARGILOSO,10.23,0.82,12.45,3.47,1.10,0,5.15).getTeorIdealMagnesio(), 0.0);
            assertEquals(9.0, new Solo(TexturaSolo.ARGILOSO,10.23,0.82,12.45,3.47,1.10,0,5.15).getTeorIdealEnxofre(), 0.0);
            assertEquals(0.0, new Solo(TexturaSolo.ARGILOSO,10.23,0.82,12.45,3.47,1.10,0,5.15).getTeorIdealAluminio(), 0.0);
    }
    
    @Test
    public void testTeorIdealTexturaMedia() {
            assertEquals(12.0, new Solo(TexturaSolo.TEXTURA_MEDIA,10.23,0.82,12.45,3.47,1.10,0,5.15).getTeorIdealFosforo(), 0.0);
            assertEquals(0.25,new Solo(TexturaSolo.TEXTURA_MEDIA,10.23,0.82,12.45,3.47,1.10,0,5.15).getTeorIdealPotassio() , 0.0);
            assertEquals(4.0, new Solo(TexturaSolo.TEXTURA_MEDIA,10.23,0.82,12.45,3.47,1.10,0,5.15).getTeorIdealCalcio(), 0.0);
            assertEquals(1.0, new Solo(TexturaSolo.TEXTURA_MEDIA,10.23,0.82,12.45,3.47,1.10,0,5.15).getTeorIdealMagnesio(), 0.0);
            assertEquals(6.0, new Solo(TexturaSolo.TEXTURA_MEDIA,10.23,0.82,12.45,3.47,1.10,0,5.15).getTeorIdealEnxofre(), 0.0);
            assertEquals(0.0, new Solo(TexturaSolo.TEXTURA_MEDIA,10.23,0.82,12.45,3.47,1.10,0,5.15).getTeorIdealAluminio(), 0.0);
    }

    @Test
    public void testGetScmol() {
            assertEquals(16.74, new Solo(TexturaSolo.ARGILOSO,10.23,0.82,12.45,3.47,1.10,0,5.15).getScmol(), 0.0);
    }

    @Test
    public void testGetCTCcmol() {
            assertEquals(21.89, new Solo(TexturaSolo.ARGILOSO,10.23,0.82,12.45,3.47,1.10,0,5.15).getCTCcmol(), 0.0);    
    }

    @Test
    public void testGetVatual() {
           assertEquals(76.47, new Solo(TexturaSolo.ARGILOSO,10.23,0.82,12.45,3.47,1.10,0,5.15).getVatual(), 0.01);     
    }
    
    @Test
    public void testGetMOPercentual() {
           assertEquals(3.07, new Solo(TexturaSolo.ARGILOSO,10.23,0.82,12.45,3.47,1.10,0,5.15).getMOPercentual(30.7), 0.01);     
    }
    
    @Test
    public void testGetCarbono() {
            assertEquals(17.84, new Solo().getCarbono(new Solo().getMOPercentual(30.7)),0.01);
    }
}