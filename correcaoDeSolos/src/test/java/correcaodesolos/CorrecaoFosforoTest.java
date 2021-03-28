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
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).quantidadeAplicar(),0.1);
        assertEquals(54.42, new CorrecaoFosforo(12.0,FonteFosforo.SUPERFOSFATO_TRIPLO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).quantidadeAplicar(),0.1);
        assertEquals(46.48, new CorrecaoFosforo(12.0,FonteFosforo.MAP,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).quantidadeAplicar(),0.1);
        assertEquals(49.58, new CorrecaoFosforo(12.0,FonteFosforo.DAP,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).quantidadeAplicar(),0.1);
        assertEquals(123.95, new CorrecaoFosforo(12.0,FonteFosforo.YOORIN,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).quantidadeAplicar(),0.1);
        assertEquals(67.61, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_ARAD,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).quantidadeAplicar(),0.1);
        assertEquals(76.93, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_GAFSA,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).quantidadeAplicar(),0.1);
        assertEquals(69.72, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_DAOUI,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).quantidadeAplicar(),0.1);
        assertEquals(92.96, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_PATO_MINAS,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).quantidadeAplicar(),0.1);
        assertEquals(120.60, new CorrecaoFosforo(12.0,FonteFosforo.ESCORIA_DE_THOMAS,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).quantidadeAplicar(),0.1);
        assertEquals(42.91, new CorrecaoFosforo(12.0,FonteFosforo.ACIDO_FOSFORICO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).quantidadeAplicar(),0.1);
        assertEquals(123.95, new CorrecaoFosforo(12.0,FonteFosforo.MULTIF_MAGNESIANO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).quantidadeAplicar(),0.1); 
    }
    
    @Test
    public void testForneceratambem() {
        assertEquals(12.4, new CorrecaoFosforo(12.0,FonteFosforo.SUPERFOSFATO_SIMPLES,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem(),0.1);
        assertEquals(0.0, new CorrecaoFosforo(12.0,FonteFosforo.SUPERFOSFATO_TRIPLO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem(),0.1);
        assertEquals(0.0, new CorrecaoFosforo(12.0,FonteFosforo.MAP,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem(),0.1);
        assertEquals(0.0, new CorrecaoFosforo(12.0,FonteFosforo.DAP,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem(),0.1);
        assertEquals(18.6, new CorrecaoFosforo(12.0,FonteFosforo.YOORIN,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem(),0.1);
        assertEquals(0.0, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_ARAD,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem(),0.1);
        assertEquals(0.0, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_GAFSA,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem(),0.1);
        assertEquals(0.0, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_DAOUI,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem(),0.1);
        assertEquals(0.0, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_PATO_MINAS,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem(),0.1);
        assertEquals(0.0, new CorrecaoFosforo(12.0,FonteFosforo.ESCORIA_DE_THOMAS,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem(),0.1);
        assertEquals(0.0, new CorrecaoFosforo(12.0,FonteFosforo.ACIDO_FOSFORICO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem(),0.1);
        assertEquals(13.6, new CorrecaoFosforo(12.0,FonteFosforo.MULTIF_MAGNESIANO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem(),0.1);
    }
    
    @Test
    public void testForneceratambem2() {
        assertEquals("Enxofre", new CorrecaoFosforo(12.0,FonteFosforo.SUPERFOSFATO_SIMPLES,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem2());
        assertEquals("", new CorrecaoFosforo(12.0,FonteFosforo.SUPERFOSFATO_TRIPLO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem2());
        assertEquals("", new CorrecaoFosforo(12.0,FonteFosforo.MAP,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem2());
        assertEquals("", new CorrecaoFosforo(12.0,FonteFosforo.DAP,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem2());
        assertEquals("Magnésio", new CorrecaoFosforo(12.0,FonteFosforo.YOORIN,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem2());
        assertEquals("", new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_ARAD,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem2());
        assertEquals("", new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_GAFSA,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem2());
        assertEquals("", new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_DAOUI,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem2());
        assertEquals("", new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_PATO_MINAS,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem2());
        assertEquals("", new CorrecaoFosforo(12.0,FonteFosforo.ESCORIA_DE_THOMAS,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem2());
        assertEquals("", new CorrecaoFosforo(12.0,FonteFosforo.ACIDO_FOSFORICO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem2());
        assertEquals("Enxofre", new CorrecaoFosforo(12.0,FonteFosforo.MULTIF_MAGNESIANO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem2());
    }
    
    @Test
    public void testForneceratambem3() {
        assertEquals(34.7, new CorrecaoFosforo(12.0,FonteFosforo.SUPERFOSFATO_SIMPLES,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem3(),0.1);
        assertEquals(10.9, new CorrecaoFosforo(12.0,FonteFosforo.SUPERFOSFATO_TRIPLO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem3(),0.1);
        assertEquals(4.2, new CorrecaoFosforo(12.0,FonteFosforo.MAP,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem3(),0.1);
        assertEquals(7.9, new CorrecaoFosforo(12.0,FonteFosforo.DAP,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem3(),0.1);
        assertEquals(34.7, new CorrecaoFosforo(12.0,FonteFosforo.YOORIN,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem3(),0.1);
        assertEquals(35.2, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_ARAD,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem3(),0.1);
        assertEquals(40.0, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_GAFSA,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem3(),0.1);
        assertEquals(31.4, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_DAOUI,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem3(),0.1);
        assertEquals(26.0, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_PATO_MINAS,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem3(),0.1);
        assertEquals(53.1, new CorrecaoFosforo(12.0,FonteFosforo.ESCORIA_DE_THOMAS,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem3(),0.1);
        assertEquals(0.0, new CorrecaoFosforo(12.0,FonteFosforo.ACIDO_FOSFORICO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem3(),0.1);
        assertEquals(22.3, new CorrecaoFosforo(12.0,FonteFosforo.MULTIF_MAGNESIANO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem3(),0.1);
    }
    
    @Test
    public void testForneceratambem4() {
        assertEquals("CÁLCIO", new CorrecaoFosforo(12.0,FonteFosforo.SUPERFOSFATO_SIMPLES,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem4());
        assertEquals("CÁLCIO", new CorrecaoFosforo(12.0,FonteFosforo.SUPERFOSFATO_TRIPLO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem4());
        assertEquals("NITROGÊNIO", new CorrecaoFosforo(12.0,FonteFosforo.MAP,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem4());
        assertEquals("NITROGÊNIO", new CorrecaoFosforo(12.0,FonteFosforo.DAP,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem4());
        assertEquals("CÁLCIO", new CorrecaoFosforo(12.0,FonteFosforo.YOORIN,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem4());
        assertEquals("CÁLCIO", new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_ARAD,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem4());
        assertEquals("CÁLCIO", new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_GAFSA,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem4());
        assertEquals("CÁLCIO", new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_DAOUI,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem4());
        assertEquals("CÁLCIO", new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_PATO_MINAS,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem4());
        assertEquals("CÁLCIO", new CorrecaoFosforo(12.0,FonteFosforo.ESCORIA_DE_THOMAS,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem4());
        assertEquals("", new CorrecaoFosforo(12.0,FonteFosforo.ACIDO_FOSFORICO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem4());
        assertEquals("CÁLCIO", new CorrecaoFosforo(12.0,FonteFosforo.MULTIF_MAGNESIANO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).forneceraTambem4());
    }
    
    @Test
    public void testCusto() {
        assertEquals(156.18, new CorrecaoFosforo(12.0,FonteFosforo.SUPERFOSFATO_SIMPLES,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).custo(),0.1);
        assertEquals(68.57, new CorrecaoFosforo(12.0,FonteFosforo.SUPERFOSFATO_TRIPLO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).custo(),0.1);
        assertEquals(58.57, new CorrecaoFosforo(12.0,FonteFosforo.MAP,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).custo(),0.1);
        assertEquals(62.47, new CorrecaoFosforo(12.0,FonteFosforo.DAP,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).custo(),0.1);
        assertEquals(156.18, new CorrecaoFosforo(12.0,FonteFosforo.YOORIN,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).custo(),0.1);
        assertEquals(85.19, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_ARAD,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).custo(),0.1);
        assertEquals(96.94, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_GAFSA,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).custo(),0.1);
        assertEquals(87.85, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_DAOUI,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).custo(),0.1);
        assertEquals(117.13, new CorrecaoFosforo(12.0,FonteFosforo.FOSFATO_PATO_MINAS,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).custo(),0.1);
        assertEquals(151.96, new CorrecaoFosforo(12.0,FonteFosforo.ESCORIA_DE_THOMAS,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).custo(),0.1);
        assertEquals(54.06, new CorrecaoFosforo(12.0,FonteFosforo.ACIDO_FOSFORICO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).custo(),0.1);
        assertEquals(156.18, new CorrecaoFosforo(12.0,FonteFosforo.MULTIF_MAGNESIANO,0.7,
                new Solo(TexturaSolo.ARGILOSO,8.59,0.15,5.76,1.63,3.67,0,5.35),1260.00).custo(),0.1);
    }
    
}
