package correcaodesolos;

public enum TexturaSolo {
    ARGILOSO(9.0,0.35,6.0,1.5,9.0),
    TEXTURA_MEDIA(12.0,0.25,4.0,1,6.0);
    
    private final double fosforo; 
    private final double potassio; 
    private final double calcio; 
    private final double magnesio; 
    private final double enxofre;
    
    TexturaSolo(double fosforo, double potassio, double calcio, double magnesio, double enxofre){
        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
    }
    
    double getValorIdealFosforo(){
        return fosforo;
    }
    double getValorIdealPotassio(){
        return potassio;
    }
    double getValorIdealCalcio(){
        return calcio;
    }
    double getValorIdealMagnesio(){
        return magnesio;
    }
    double getValorIdealEnxofre(){
        return enxofre;
    }  
}
