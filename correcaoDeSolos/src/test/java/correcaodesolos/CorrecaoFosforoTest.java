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
        
        assertEquals(123.95, new CorrecaoFosforo(12.0,FonteFosforo.SUPERFOSFATO_SIMPLES,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35)).quantidadeAplicar(),0.01);
        assertEquals(54.42, new CorrecaoFosforo(12.0,FonteFosforo.SUPERFOSFATO_TRIPLO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35)).quantidadeAplicar(),0.01);
        assertEquals(46.48, new CorrecaoFosforo(12.0,FonteFosforo.MAP,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35)).quantidadeAplicar(),0.01);
        assertEquals(49.58, new CorrecaoFosforo(12.0,FonteFosforo.DAP,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35)).quantidadeAplicar(),0.01);
        assertEquals(123.95, new CorrecaoFosforo(12.0,FonteFosforo.YOORIN,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35)).quantidadeAplicar(),0.01);
        assertEquals(67.61, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_ARAD,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35)).quantidadeAplicar(),0.01);
        assertEquals(76.93, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_GAFSA,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35)).quantidadeAplicar(),0.01);
        assertEquals(69.72, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_DAOUI,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35)).quantidadeAplicar(),0.01);
        assertEquals(92.96, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_PATO_MINAS,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35)).quantidadeAplicar(),0.01);
        assertEquals(120.60, new CorrecaoFosforo(12.0,FonteFosforo.ESCORIA_DE_THOMAS,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35)).quantidadeAplicar(),0.01);
        assertEquals(42.91, new CorrecaoFosforo(12.0,FonteFosforo.ACIDO_FOSFORICO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35)).quantidadeAplicar(),0.01);
        assertEquals(123.95, new CorrecaoFosforo(12.0,FonteFosforo.MULTIF_MAGNESIANO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35)).quantidadeAplicar(),0.01); 
    }
    
    
}
