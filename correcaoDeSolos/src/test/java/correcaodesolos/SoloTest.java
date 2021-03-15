/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaodesolos;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Álvaro
 */
public class SoloTest {
    
    public SoloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of getTeorIdealFosforo method, of class Solo.
     */
    @Test
    public void testGetTeorIdealFosforo() {
        System.out.println("getTeorIdealFosforo");
       
        Solo solo = new Solo();
        solo.setAreaTotal(4.8);
        solo.setAreaTalhao(4.84);
        solo.setTalhao(1);
        solo.setTextura(1);
        solo.setSistemaCultivo(1);
        solo.setProfundidade(20);
        solo.setNumeroResultado(6283);
        
        solo.setFosforo(10.23);
        solo.setPotassio(0.82);
        solo.setCalcio(12.45);
        solo.setMagnesio(3.47);
        solo.setEnxofre(1.10);
        solo.setAluminio(0);
        solo.setHAL(5.15);
        
        double expResult = 9.0;
        double result = solo.getTeorIdealFosforo();
        
        try {
            assertEquals(expResult, result, 0.0);
        } catch (Exception e) {
           fail(); 
        }
        
    }

    /**
     * Test of getTeorIdealPotassio method, of class Solo.
     */
    @Test
    public void testGetTeorIdealPotassio() {
        System.out.println("getTeorIdealFosforo");
        
        Solo solo = new Solo();
        solo.setAreaTotal(4.8);
        solo.setAreaTalhao(4.84);
        solo.setTalhao(1);
        solo.setTextura(1);
        solo.setSistemaCultivo(1);
        solo.setProfundidade(20);
        solo.setNumeroResultado(6283);
        
        solo.setFosforo(10.23);
        solo.setPotassio(0.82);
        solo.setCalcio(12.45);
        solo.setMagnesio(3.47);
        solo.setEnxofre(1.10);
        solo.setAluminio(0);
        solo.setHAL(5.15);
        
        double expResult = 0.35;
        double result = solo.getTeorIdealPotassio();
        
        try {
            assertEquals(expResult, result, 0.0);
        } catch (Exception e) {
           fail(); 
        }
        
    }

    /**
     * Test of getTeorIdealCalcio method, of class Solo.
     */
    @Test
    public void testGetTeorIdealCalcio() {
        System.out.println("getTeorIdealCalcio");
        
        Solo solo = new Solo();
        solo.setAreaTotal(4.8);
        solo.setAreaTalhao(4.84);
        solo.setTalhao(1);
        solo.setTextura(1);
        solo.setSistemaCultivo(1);
        solo.setProfundidade(20);
        solo.setNumeroResultado(6283);
        
        solo.setFosforo(10.23);
        solo.setPotassio(0.82);
        solo.setCalcio(12.45);
        solo.setMagnesio(3.47);
        solo.setEnxofre(1.10);
        solo.setAluminio(0);
        solo.setHAL(5.15);
        
        double expResult = 6.0;
        double result = solo.getTeorIdealCalcio();
        
        try {
            assertEquals(expResult, result, 0.0);
        } catch (Exception e) {
           fail(); 
        }
        
    }

    /**
     * Test of getTeorIdealMagnesio method, of class Solo.
     */
    @Test
    public void testGetTeorIdealMagnesio() {
        System.out.println("getTeorIdealMagnesio");
        
        Solo solo = new Solo();
        solo.setAreaTotal(4.8);
        solo.setAreaTalhao(4.84);
        solo.setTalhao(1);
        solo.setTextura(1);
        solo.setSistemaCultivo(1);
        solo.setProfundidade(20);
        solo.setNumeroResultado(6283);
        
        solo.setFosforo(10.23);
        solo.setPotassio(0.82);
        solo.setCalcio(12.45);
        solo.setMagnesio(3.47);
        solo.setEnxofre(1.10);
        solo.setAluminio(0);
        solo.setHAL(5.15);
        
        double expResult = 1.5;
        double result = solo.getTeorIdealMagnesio();
        
        try {
            assertEquals(expResult, result, 0.0);
        } catch (Exception e) {
           fail(); 
        }
        
    }

    /**
     * Test of getTeorIdealEnxofre method, of class Solo.
     */
    @Test
    public void testGetTeorIdealEnxofre() {
        System.out.println("getTeorIdealEnxofre");
        
        Solo solo = new Solo();
        solo.setAreaTotal(4.8);
        solo.setAreaTalhao(4.84);
        solo.setTalhao(1);
        solo.setTextura(1);
        solo.setSistemaCultivo(1);
        solo.setProfundidade(20);
        solo.setNumeroResultado(6283);
        
        solo.setFosforo(10.23);
        solo.setPotassio(0.82);
        solo.setCalcio(12.45);
        solo.setMagnesio(3.47);
        solo.setEnxofre(1.10);
        solo.setAluminio(0);
        solo.setHAL(5.15);
        
        double expResult = 9.0;
        double result = solo.getTeorIdealEnxofre();
        
        try {
            assertEquals(expResult, result, 0.0);
        } catch (Exception e) {
           fail(); 
        }
        
    }

    /**
     * Test of getTeorIdealAluminio method, of class Solo.
     */
    @Test
    public void testGetTeorIdealAluminio() {
        System.out.println("getTeorIdealAluminio");
        
        Solo solo = new Solo();
        solo.setAreaTotal(4.8);
        solo.setAreaTalhao(4.84);
        solo.setTalhao(1);
        solo.setTextura(1);
        solo.setSistemaCultivo(1);
        solo.setProfundidade(20);
        solo.setNumeroResultado(6283);
        
        solo.setFosforo(10.23);
        solo.setPotassio(0.82);
        solo.setCalcio(12.45);
        solo.setMagnesio(3.47);
        solo.setEnxofre(1.10);
        solo.setAluminio(0);
        solo.setHAL(5.15);
        
        double expResult = 0.0;
        double result = solo.getTeorIdealAluminio();
        
        try {
            assertEquals(expResult, result, 0.0);
        } catch (Exception e) {
           fail(); 
        }
        
        
    }

    /**
     * Test of getScmol method, of class Solo.
     */
    @Test
    public void testGetScmol() {
        System.out.println("getScmol");
        
        Solo solo = new Solo();
        solo.setAreaTotal(4.8);
        solo.setAreaTalhao(4.84);
        solo.setTalhao(1);
        solo.setTextura(1);
        solo.setSistemaCultivo(1);
        solo.setProfundidade(20);
        solo.setNumeroResultado(6283);
        
        solo.setFosforo(10.23);
        solo.setPotassio(0.82);
        solo.setCalcio(12.45);
        solo.setMagnesio(3.47);
        solo.setEnxofre(1.10);
        solo.setAluminio(0);
        solo.setHAL(5.15);
        
        double expResult = 16.74;
        double result = solo.getScmol();
        
        try {
 
            assertEquals(expResult, result, 0.0);
        } catch (Exception e) {
           fail(); 
        }
        
    }

    /**
     * Test of getCTCcmol method, of class Solo.
     */
    @Test
    public void testGetCTCcmol() {
        System.out.println("getCTCcmol");
        
        Solo solo = new Solo();
        solo.setAreaTotal(4.8);
        solo.setAreaTalhao(4.84);
        solo.setTalhao(1);
        solo.setTextura(1);
        solo.setSistemaCultivo(1);
        solo.setProfundidade(20);
        solo.setNumeroResultado(6283);
        
        solo.setFosforo(10.23);
        solo.setPotassio(0.82);
        solo.setCalcio(12.45);
        solo.setMagnesio(3.47);
        solo.setEnxofre(1.10);
        solo.setAluminio(0);
        solo.setHAL(5.15);
        
        double expResult = 21.89;
        double result = solo.getCTCcmol();
        
        try {
 
            assertEquals(expResult, result, 0.0);
        } catch (Exception e) {
           fail(); 
        }
        
    }

    /**
     * Test of getVatual method, of class Solo.
     */
    @Test
    public void testGetVatual() {
        System.out.println("getVatual");
        
        Solo solo = new Solo();
        solo.setAreaTotal(4.8);
        solo.setAreaTalhao(4.84);
        solo.setTalhao(1);
        solo.setTextura(1);
        solo.setSistemaCultivo(1);
        solo.setProfundidade(20);
        solo.setNumeroResultado(6283);
        
        solo.setFosforo(10.23);
        solo.setPotassio(0.82);
        solo.setCalcio(12.45);
        solo.setMagnesio(3.47);
        solo.setEnxofre(1.10);
        solo.setAluminio(0);
        solo.setHAL(5.15);
        
        double expResult = 76.47;
        double result = solo.getVatual();
        
        try {
 
           assertEquals(expResult, result, 0.01);
        } catch (Exception e) {
           fail(); 
        }
        
    }
    
}