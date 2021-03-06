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
public class CorrecaoCalcioMagnesio {
    
    private double participacaoCalcioCTC; // atributo referente a participação do Cálcio na CTC desejada
    private int fonteCorretivo; // atributo referente a fonte de corretivo a usar
    private double PRNT; // atributo referente ao PRNT %
    private double teorCaOCorretivo; // atributo referente ao teor de CaO do corretivo %
    private double valorFonte; // atributo referente ao valor/ton (R$) da fonte
    
    // métoodos construtores
    public CorrecaoCalcioMagnesio() {
    }

    public CorrecaoCalcioMagnesio( double participacaoCalcioCTC, int fonteCorretivo, double PRNT, double teorCaOCorretivo, double valorFonte ) {
        this.participacaoCalcioCTC = participacaoCalcioCTC;
        this.fonteCorretivo = fonteCorretivo;
        this.PRNT = PRNT;
        this.teorCaOCorretivo = teorCaOCorretivo;
        this.valorFonte = valorFonte;
    }
    
    // métodos gets
    
    public double getParticipacaoCalcioCTC() {
        return participacaoCalcioCTC;
    }
    
    public int getFonteCorretivo() {
        return fonteCorretivo;
    }
    
    public double getPRNT() {
        return PRNT;
    }
    
    public double getTeorCaOCorretivo(){
        return teorCaOCorretivo;
    }
    
    public double getValorFonte(){
        return valorFonte;
    }
    
    // métodos sets
    
    public void setParticipacaoCalcioCTC ( double participacaoCalcioCTC) {
        this.participacaoCalcioCTC = participacaoCalcioCTC;
    }
    
    public void setFonteCorretivo ( int fonteCorretivo) {
        this.fonteCorretivo = fonteCorretivo;
    }
    
    public void setPRNT ( double PRNT) {
        this.PRNT = PRNT;
    }
    
    public void setTeorCaOCorretivo ( int teorCaOCorretivo) {
        this.teorCaOCorretivo = teorCaOCorretivo;
    }
    
    public void setValorFonte(double valorFonte) {
        this.valorFonte = valorFonte;
    }
    
    // Método que retorna o nome da fonte de Cálcio utilizado
    
    public String getNomeFonte(){
        
        if( this.fonteCorretivo == 1 ){
            return "Calcário Dolomítico";
        }
        
        else if ( this.fonteCorretivo == 2 ){
            return "Calcário Calcítico";
        }
        
        else if ( this.fonteCorretivo == 3 ){
            return "Calcário de Concha";
        }
        
        else if ( this.fonteCorretivo == 4 ){
            return "Gesso Agrícola";
        }
        
        else if ( this.fonteCorretivo == 5 ){
            return "Hidróxido de cálcio";
        }
        
        else if ( this.fonteCorretivo == 6 ){
            return "Calcário Magnesiano";
        }
        
        else{
            return "Inválido";
        }
    }
    
}
