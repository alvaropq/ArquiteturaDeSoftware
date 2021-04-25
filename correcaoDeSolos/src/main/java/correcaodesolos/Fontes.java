package correcaodesolos;

public enum Fontes {
    SUPERFOSFATO_SIMPLES(18.0,0.1,"ENXOFRE",0.28,"CÁLCIO"),
    SUPERFOSFATO_TRIPLO(41.0,0.0,"",0.2,"CÁLCIO"),
    MAP(48.0,0.0,"",0.09,"NITROGÊNIO"),
    DAP(45.0,0.0,"",0.16,"NITROGÊNIO"),
    YOORIN(18.0,0.15,"MAGNÉSIO",0.28,"CÁLCIO"),
    FOSFATO_ARAD(33.0,0.0,"",0.52,"CÁLCIO"),
    FOSFATO_GAFSA(29.0,0.0,"",0.52,"CÁLCIO"),
    FOSFATO_DAOUI(32.0,0.0,"",0.45,"CÁLCIO"),
    FOSFATO_PATO_MINAS(24.0,0.0,"",0.28,"CÁLCIO"),
    ESCORIA_DE_THOMAS(18.5,0.0,"",0.44,"CÁLCIO"),
    ACIDO_FOSFORICO(52.0,0.0,"",0.0,""),
    MULTIF_MAGNESIANO(18.0,0.11,"ENXOFRE",0.18,"CÁLCIO"),
    
    CLORETO_DE_POTASSIO(58,0.0,"",0.0,""),
    SULFATO_DE_POTASSIO(52,0.17,"ENXOFRE",0.0,""),
    SULFATO_POTASSIO_MAGNESIO(22,0.22,"ENXOFRE",0.18,"MAGNÉSIO");
    
    private final double valorFonte;
    private final double valorPrimeiroNutriente;
    private final String nomePrimeiroNutriente;
    private final double valorSegundoNutriente;
    private final String nomeSegundoNutriente;
    
    Fontes(double valorFonte, double valorPrimeiroNutriente, String nomePrimeiroNutriente, double valorSegundoNutriente, String nomeSegundoNutriente){
        this.valorFonte = valorFonte;
        this.valorPrimeiroNutriente = valorPrimeiroNutriente;
        this.nomePrimeiroNutriente = nomePrimeiroNutriente;
        this.valorSegundoNutriente = valorSegundoNutriente;
        this.nomeSegundoNutriente = nomeSegundoNutriente;
    }
    
    public double valorFonte(){
        return this.valorFonte;
    }
    public double getValorPrimeiroNutriente(){
        return this.valorPrimeiroNutriente;
    }
    public String getNomePrimeiroNutriente(){
        return this.nomePrimeiroNutriente;
    }
    public double getValorSegundoNutriente(){
        return this.valorSegundoNutriente;
    }
    public String getNomeSegundoNutriente(){
        return this.nomeSegundoNutriente;
    }
}