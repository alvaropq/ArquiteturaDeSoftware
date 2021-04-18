package correcaodesolos;

public enum FonteFosforo {
    SUPERFOSFATO_SIMPLES(18.0,0.1,"Enxofre",0.28,"CÁLCIO"),
    SUPERFOSFATO_TRIPLO(41.0,0.0,"",0.2,"CÁLCIO"),
    MAP(48.0,0.0,"",0.09,"NITROGÊNIO"),
    DAP(45.0,0.0,"",0.16,"NITROGÊNIO"),
    YOORIN(18.0,0.15,"Magnésio",0.28,"CÁLCIO"),
    FOSFATO_ARAD(33.0,0.0,"",0.52,"CÁLCIO"),
    FOSFATO_GAFSA(29.0,0.0,"",0.52,"CÁLCIO"),
    FOSFATO_DAOUI(32.0,0.0,"",0.45,"CÁLCIO"),
    FOSFATO_PATO_MINAS(24.0,0.0,"",0.28,"CÁLCIO"),
    ESCORIA_DE_THOMAS(18.5,0.0,"",0.44,"CÁLCIO"),
    ACIDO_FOSFORICO(52.0,0.0,"",0.0,""),
    MULTIF_MAGNESIANO(18.0,0.11,"Enxofre",0.18,"CÁLCIO");
    
    private final double valorFonteFosforo;
    private final double valorForneceraTambem;
    private final String valorForneceraTambem2;
    private final double valorForneceraTambem3;
    private final String valorForneceraTambem4;
    
    FonteFosforo(double valorFonteFosforo, double forneceraTambem, String forneceraTambem2, double forneceraTambem3, String forneceraTambem4){
        this.valorFonteFosforo = valorFonteFosforo;
        this.valorForneceraTambem = forneceraTambem;
        this.valorForneceraTambem2 = forneceraTambem2;
        this.valorForneceraTambem3 = forneceraTambem3;
        this.valorForneceraTambem4 = forneceraTambem4;
    }
    
    public double valorFonteFosforo(){
        return this.valorFonteFosforo;
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