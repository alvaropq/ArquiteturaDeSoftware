package correcaodesolos;

/* Ajuste de manutenibilidade para os métodos relacionados a classe solo, onde foi-se utilizado conceitos aprendidos
na aula de arquitetura de software com o Profº Gabriel Costa, cujo repositório consta no link: https://github.com/gabrielcostasilva/sa-soilcorrection
*/

public class Solo {
    
    private TexturaSolo textura;
    private double fosforo; 
    private double potassio; 
    private double calcio; 
    private double magnesio; 
    private double enxofre; 
    private double aluminio;
    private double hidrogenioAluminio;
    
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

    public double getTeorIdealFosforo(){
        return this.textura.getValorIdealFosforo();
    }
    
    public double getTeorIdealPotassio(){
        return this.textura.getValorIdealPotassio();
    }
    
    public double getTeorIdealCalcio(){
        return this.textura.getValorIdealCalcio();
    }
    
    public double getTeorIdealMagnesio(){
        return this.textura.getValorIdealMagnesio();
    }
    
    public double getTeorIdealEnxofre(){
        return this.textura.getValorIdealEnxofre();
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