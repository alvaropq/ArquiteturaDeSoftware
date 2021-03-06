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
public class CorrecaoPotassio {
    
    private double participacaoPotassioCTC; // atributo referente a participação do Potássio na CTC desejada
    private int fontePotassio; // atributo referente a fonte de Potássio a usar
    private double valorFonte; // atributo referente ao valor/ton (R$) da fonte
    
    // métoodos construtores
    public CorrecaoPotassio() {
    }

    public CorrecaoPotassio( double participacaoPotassioCTC, int fontePotassio, double valorFonte ) {
        this.participacaoPotassioCTC = participacaoPotassioCTC;
        this.fontePotassio = fontePotassio;
        this.valorFonte = valorFonte;
    }
    
    // métodos gets
    
    public double getParticipacaoPotassioCTC() {
        return participacaoPotassioCTC;
    }
    
    public int fontePotassio() {
        return fontePotassio;
    }
    
    public double getValorFonte() {
        return valorFonte;
    }
    
    // métodos sets
    
    public void setParticipacaoPotassioCTC ( double participacaoPotassioCTC) {
        this.participacaoPotassioCTC = participacaoPotassioCTC;
    }
    
    public void setFontePotassio( int fontePotassio ) {
        this.fontePotassio = fontePotassio;
    }
    
    public void setValorFonte(double valorFonte) {
        this.valorFonte = valorFonte;
    }
    
    // Método que retorna o nome da fonte de fósforo utilizado
    
    public String getNomeFonte(){
        
        if( this.fontePotassio == 1 ){
            return "Cloreto de Potássio";
        }
        
        else if ( this.fontePotassio == 2 ){
            return "Sulfato de Potássio";
        }
        
        else if ( this.fontePotassio == 3 ){
            return "Sulf. Potássio Mag.";
        }
        
        else{
            return "Inválido";
        }
    }
    
}
