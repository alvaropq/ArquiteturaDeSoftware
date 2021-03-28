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
    
    // métoodos construtores
    public CorrecaoFosforo() {
    }

    public CorrecaoFosforo( double teorFosforoAtingir, FonteFosforo fonteFosforo, double eficienciaFosforo, Solo solo) {
        this.teorFosforoAtingir = teorFosforoAtingir;
        this.fonteFosforo = fonteFosforo;
        this.eficienciaFosforo = eficienciaFosforo;
        this.solo = solo;
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
            System.out.println("entrou aqui");
            System.out.println("Fosforo Atingir: "+this.teorFosforoAtingir);
            System.out.println("Fosforo: "+this.solo.getFosforo());
            return 0.0;
        }
    }
    
}
