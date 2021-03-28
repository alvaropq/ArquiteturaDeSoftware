package correcaodesolos;

/**
 *
 * @author Álvaro
 */
public class CorrecaoFosforo {
    
    private double teorFosforoAtingir; // atributo referente ao teor de fósforo a atingir (mg.dm³)
    private FonteFosforo fonteFosforo; // atributo referente a fonte de fósforo a utilizar
    private double eficienciaFosforo; // atributo referente a eficiência do fósforo %
    private Solo solo;
    private double valor;
    
    // métoodos construtores
    public CorrecaoFosforo() {
    }

    public CorrecaoFosforo( double teorFosforoAtingir, FonteFosforo fonteFosforo, double eficienciaFosforo, Solo solo, double valor) {
        this.teorFosforoAtingir = teorFosforoAtingir;
        this.fonteFosforo = fonteFosforo;
        this.eficienciaFosforo = eficienciaFosforo;
        this.solo = solo;
        this.valor = valor;
    }
    
    double valorFonteFosforo(){
        
        switch(this.fonteFosforo){
            case SUPERFOSFATO_SIMPLES:
                return 18.0;
            case SUPERFOSFATO_TRIPLO:
                return 41.0;
            case MAP:
                return 48.0;
            case DAP:
                return 45.0;
            case YOORIN:
                return 18.0;
            case FOSFATO_ARAD:
                return 33.0;
            case FOSFATO_GAFSA:
                return 29.0;
            case FOSFATO_DAOUI:
                return 32.0;
            case FOSFATO_PATO_MINAS:
                return 24.0;
            case ESCORIA_DE_THOMAS:
                return 18.5;
            case ACIDO_FOSFORICO:
                return 52.0;
            case MULTIF_MAGNESIANO:
                return 18.0;
            default:
                return 0.0;
        }
        
    }
    
    double quantidadeAplicar() {
        if((this.teorFosforoAtingir - this.solo.getFosforo()) > 0.01 ){
            return ((this.teorFosforoAtingir - this.solo.getFosforo())*2*2.29*100/this.eficienciaFosforo/100)*(100/this.valorFonteFosforo());
        }
        else{
            return 0.0;
        }
    }

    double forneceraTambem() {
        switch (this.fonteFosforo){
            case YOORIN:
                return this.quantidadeAplicar()*0.15;
            case SUPERFOSFATO_SIMPLES:
                return this.quantidadeAplicar()*0.1;
            case MULTIF_MAGNESIANO:
                return this.quantidadeAplicar()*0.11;
            default:
                return 0.0;
        }
    }

    String forneceraTambem2() {
        switch (this.fonteFosforo){
            case SUPERFOSFATO_SIMPLES:
                return "Enxofre";
            case MULTIF_MAGNESIANO:
                return "Enxofre";
            case YOORIN:
                return "Magnésio";
            default:
                return "";
        }
    } 

    double forneceraTambem3() {
        switch(this.fonteFosforo){
            case SUPERFOSFATO_SIMPLES:
                return this.quantidadeAplicar()*0.28;
            case SUPERFOSFATO_TRIPLO:
                return this.quantidadeAplicar()*0.2;
            case MAP:
                return this.quantidadeAplicar()*0.09;
            case DAP:
                return this.quantidadeAplicar()*0.16;
            case YOORIN:
                return this.quantidadeAplicar()*0.28;
            case FOSFATO_ARAD:
                return this.quantidadeAplicar()*0.52;
            case FOSFATO_GAFSA:
                return this.quantidadeAplicar()*0.52;
            case FOSFATO_DAOUI:
                return this.quantidadeAplicar()*0.45;
            case FOSFATO_PATO_MINAS:
                return this.quantidadeAplicar()*0.28;
            case ESCORIA_DE_THOMAS:
                return this.quantidadeAplicar()*0.44;
            case ACIDO_FOSFORICO:
                return this.quantidadeAplicar()*0.0;
            case MULTIF_MAGNESIANO:
                return this.quantidadeAplicar()*0.18;
            default:
                return 0.0;
        }
    }
    
    String forneceraTambem4() {
        switch (this.fonteFosforo){
             case SUPERFOSFATO_SIMPLES:
                return "CÁLCIO";
            case SUPERFOSFATO_TRIPLO:
                return "CÁLCIO";
            case MAP:
                return "NITROGÊNIO";
            case DAP:
                return "NITROGÊNIO";
            case YOORIN:
                return "CÁLCIO";
            case FOSFATO_ARAD:
                return "CÁLCIO";
            case FOSFATO_GAFSA:
                return "CÁLCIO";
            case FOSFATO_DAOUI:
                return "CÁLCIO";
            case FOSFATO_PATO_MINAS:
                return "CÁLCIO";
            case ESCORIA_DE_THOMAS:
                return "CÁLCIO";
            case ACIDO_FOSFORICO:
                return "";
            case MULTIF_MAGNESIANO:
                return "CÁLCIO";
            default:
                return "";
        }
    }

    double custo() {
        return this.valor * this.quantidadeAplicar()/1000;
    }
}
