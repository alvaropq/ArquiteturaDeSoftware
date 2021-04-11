package correcaodesolos;

/* Ajuste de manutenibilidade para os métodos relacionados a classe solo, onde foi-se utilizado conceitos aprendidos
na aula de arquitetura de software com o Profº Gabriel Costa, cujo repositório consta no link: https://github.com/gabrielcostasilva/sa-soilcorrection
*/

import java.util.Date;

/**
 *
 * @author Álvaro
 */
public class Solo {
    
    private TexturaSolo textura; // atributo referente a textura. 1 = Argiloso e 2 = Textura Média 
    private double fosforo; //valor de análise de fósforo no solo
    private double potassio; //valor de análise de potássio no solo
    private double calcio; //valor de análise de cálcio no solo
    private double magnesio; //valor de análise de magnésio no solo
    private double enxofre; //valor de análise de enxofre no solo
    private double aluminio; //valor de análise de alumínio no solo
    private double hidrogenioAluminio;
    
    
    // métoodos construtores
    public Solo() {
    }

    public Solo(TexturaSolo textura, double fosforo, double potassio, double calcio, double magnesio, double enxofre, double aluminio, double hidrogenioAluminio) {
       
        this.textura = textura;

        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
        this.aluminio = aluminio;
        this.hidrogenioAluminio = hidrogenioAluminio;
    }
    
    public Solo(double fosforo, double potassio, double calcio, double magnesio, double enxofre, double aluminio, double hidrogenioAluminio) {
        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
        this.aluminio = aluminio;
        this.hidrogenioAluminio = hidrogenioAluminio;
    }
    
    public double getFosforo(){
        return fosforo;
    }
    
    // métodos que calculam os teores ideais
    
    public double getTeorIdealFosforo(){
        switch(this.textura){
            case ARGILOSO:
                return 9.0;
            case TEXTURA_MEDIA:
                return 12.0;
            default:
                return 0.0;
        }
    }
    
    public double getTeorIdealPotassio(){
        switch(this.textura){
            case ARGILOSO:
                return 0.35;
            case TEXTURA_MEDIA:
                return 0.25;
            default:
                return 0.0;
        }
    }
    
    public double getTeorIdealCalcio(){
        switch(this.textura){
            case ARGILOSO:
                return 6.0;
            case TEXTURA_MEDIA:
                return 4.0;
            default:
                return 0.0;
        }
    }
    
    public double getTeorIdealMagnesio(){
        switch(this.textura){
            case ARGILOSO:
                return 1.5;
            case TEXTURA_MEDIA:
                return 1;
            default:
                return 0.0;
        }
    }
    
    public double getTeorIdealEnxofre(){
        switch(this.textura){
            case ARGILOSO:
                return 9.0;
            case TEXTURA_MEDIA:
                return 6.0;
            default:
                return 0.0;
        }
    }
    
    public double getTeorIdealAluminio(){
        return 0;
    }
    
    public double getScmol(){
        double soma;
        soma = this.calcio + this.magnesio + this.potassio;
        
        if(soma > 0.01){
            return soma;
        }
        else{
            return -1;
        }
        
    }
    
    public double getCTCcmol(){
        double soma;
        soma = this.calcio + this.magnesio + this.potassio + this.hidrogenioAluminio;
        
        if(soma > 0.01){
            return soma;
        }
        
        else{
            return -1;
        }
    }
    
    public double getVatual(){
        return 100*this.getScmol()/this.getCTCcmol();
    }
    
    double getMOPercentual(double mo) {
        if (mo > 0) {
            return mo / 10;
            
        } else {
            return 0.0;
        }
    }

    double getCarbono(double moPercentual) {
        
        if (moPercentual > 0) {
            return moPercentual / 1.72 * 10;
            
        } else {
            return 0.0;
        }
    }

    double getPotassio() {
        return this.potassio;
    }

    double getCalcio() {
        return this.calcio;
    }

    double getMagnesio() {
        return this.magnesio;
    }

    double getHidrogenioAluminio() {
        return this.hidrogenioAluminio;
    }
    
    public void setFosforo(double fosforo){
        this.fosforo = fosforo;
    }
    
}