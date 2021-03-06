/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaodesolos;

/**
 *
 * @author Álvaro
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Solo solo = new Solo();
        CorrecaoFosforo correcaoFosforo = new CorrecaoFosforo();
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio();
        CorrecaoCalcioMagnesio correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
        
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

        System.out.println("Area Total: "+solo.getAreaTotal());
        System.out.println("Area Talhão: "+solo.getAreaTalhao());
        System.out.println("Talhão: "+solo.getTalhao());
        System.out.println("Textura: "+solo.getTextura());
        System.out.println("Sistema de Cultivo:"+solo.getSistemaCultivo());
        System.out.println("Profundidade:"+solo.getProfundidade());
        System.out.println("Numero do resultado da análise de solo: "+solo.getNumeroResultado());
        System.out.println("\n");
        System.out.println("Teor de análise de solo de Fósforo: "+solo.getFosforo());
        System.out.println("Teor de análise de solo de Potássio: "+solo.getPotassio());
        System.out.println("Teor de análise de solo de Cálcio: "+solo.getCalcio());
        System.out.println("Teor de análise de solo de Magnésio: "+solo.getMagnesio());
        System.out.println("Teor de análise de solo de Enxofre: "+solo.getEnxofre());
        System.out.println("Teor de análise de solo de Alumínio: "+solo.getAluminio());
        System.out.println("Teor de análise de solo de H+AL: "+solo.getHAL());
        System.out.println("\n");
        System.out.println("Teor ideal Fósforo: "+solo.getTeorIdealFosforo());
        System.out.println("Teor ideal Potássio: "+solo.getTeorIdealPotassio());
        System.out.println("Teor ideal Cálcio: "+solo.getTeorIdealCalcio());
        System.out.println("Teor ideal Magnésio: "+solo.getTeorIdealMagnesio());
        System.out.println("Teor ideal Enxofre: "+solo.getTeorIdealEnxofre());
        System.out.println("Teor ideal Alumínio: "+solo.getTeorIdealAluminio());
        System.out.println("\n");
        System.out.println("S cmol: "+solo.getScmol());
        System.out.println("CTC cmol: "+solo.getCTCcmol());
        System.out.println("V% atual: "+solo.getVatual());
            
    }
    
}
