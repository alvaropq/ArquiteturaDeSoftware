package correcaodesolos;

public enum FontePotassio {
    
    CLORETO_DE_POTASSIO(58,0.0,"",0.0,""),
    SULFATO_DE_POTASSIO(52,0.17,"ENXOFRE",0.0,""),
    SULFATO_POTASSIO_MAGNESIO(22,0.22,"ENXOFRE",0.18,"MAGNÉSIO");
    
    private final double valorFontePotassio;
    private final double valorForneceraTambem;
    private final String valorForneceraTambem2;
    private final double valorForneceraTambem3;
    private final String valorForneceraTambem4;
    
    FontePotassio(double valorFontePotassio, double forneceraTambem, String forneceraTambem2, double forneceraTambem3, String forneceraTambem4){
        this.valorFontePotassio = valorFontePotassio;
        this.valorForneceraTambem = forneceraTambem;
        this.valorForneceraTambem2 = forneceraTambem2;
        this.valorForneceraTambem3 = forneceraTambem3;
        this.valorForneceraTambem4 = forneceraTambem4;
    }
    
    public double valorFontePotassio(){
        return this.valorFontePotassio;
    }
    public double getValorForneceraTambem(){
        return this.valorForneceraTambem;
    }
    public String getValorForneceraTambem2(){
        return this.valorForneceraTambem2;
    }
    public double getValorForneceraTambem3(){
        return this.valorForneceraTambem3;
    }
    public String getValorForneceraTambem4(){
        return this.valorForneceraTambem4;
    }
}
