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
public class CorrecaoFosforo {
    
    private double teorFosforoAtingir; // atributo referente ao teor de fósforo a atingir (mg.dm³)
    private int fonteFosforo; // atributo referente a fonte de fósforo a utilizar
    private double eficienciaFosforo; // atributo referente a eficiência do fósforo %
    private double valorFonte; // atributo referente ao valor/ton (R$) da fonte
    
    // métoodos construtores
    public CorrecaoFosforo() {
    }

    public CorrecaoFosforo( double teorFosforoAtingir, int fonteFosforo, double eficienciaFosforo, double valorFonte) {
        this.teorFosforoAtingir = teorFosforoAtingir;
        this.fonteFosforo = fonteFosforo;
        this.eficienciaFosforo = eficienciaFosforo;
        this.valorFonte = valorFonte;
    }
    
    // métodos gets
    
    public double getTeorFosforoAtingir() {
        return teorFosforoAtingir;
    }
    
    public int getFonteFosforo() {
        return fonteFosforo;
    }
    
    public double getEficienciaFosforo() {
        return eficienciaFosforo;
    }
    
    public double getValorFonte() {
        return valorFonte;
    }
    
    // métodos sets
    
    public void setTeorFosforoAtingir(double teorFosforoAtingir) {
        this.teorFosforoAtingir = teorFosforoAtingir;
    }
    
    public void setFonteFosforo(int fonteFosforo) {
        this.fonteFosforo = fonteFosforo;
    }
    
    public void setEficienciaFosforo(double eficienciaFosforo) {
        this.eficienciaFosforo = eficienciaFosforo;
    }
    
    public void setValorFonte(double valorFonte) {
        this.valorFonte = valorFonte;
    }
    
    // Método que retorna o nome da fonte de fósforo utilizado
    
    public String getNomeFonte(){
        
        if( this.fonteFosforo == 1 ){
            return "Superfosfato Simples";
        }
        
        else if ( this.fonteFosforo == 2 ){
            return "Superfosfato Triplo";
        }
        
        else if ( this.fonteFosforo == 3 ){
            return "MAP";
        }
        
        else if ( this.fonteFosforo == 4 ){
            return "DAP";
        }
        
        else if ( this.fonteFosforo == 5 ){
            return "Yoorin";
        }
        
        else if ( this.fonteFosforo == 6 ){
            return "Fosfato Arad";
        }
        
        else if ( this.fonteFosforo == 7 ){
            return "Fosfato Gafsa";
        }
        
        else if ( this.fonteFosforo == 8 ){
            return "Fosfato Daoui";
        }
        
        else if ( this.fonteFosforo == 9 ){
            return "Fosf. Patos Minas";
        }
        
        else if ( this.fonteFosforo == 10 ){
            return "Escória de Thomas";
        }
        
        else if ( this.fonteFosforo == 11 ){
            return "Ácido Fosfórico";
        }
        
        else if ( this.fonteFosforo == 12 ){
            return "Multif. Magnesiano";
        }
        
        else{
            return "Inválido";
        }
    }
}
