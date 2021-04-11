package correcaodesolos;

/**
 *
 * @author Álvaro
 */
public class CorrecaoPotassio {
    private Solo solo;
    private double participacaoDesejada;
    private FontePotassio fonte;
    private double valor;
    
    // métoodos construtores
    public CorrecaoPotassio() {
    }

    public CorrecaoPotassio(Solo solo,double participacaoDesejada, FontePotassio fonte, double valor){
        this.solo = solo;
        this.participacaoDesejada = participacaoDesejada;
        this.fonte = fonte;
        this.valor = valor;
    }

    double participacaoPotassioCTCAtual() {
        return this.solo.getPotassio()/(this.solo.getCalcio()+this.solo.getMagnesio()+this.solo.getPotassio()+this.solo.getHidrogenioAluminio())*100;
    }

    double participacaoPotassioCTCIdeal() {
        return 3;
    }
    
    double participacaoPotassioCTCAposCorrecao() {
        if(this.participacaoDesejada > 0.001){
            return this.participacaoDesejada;
        }
        else{
            return 0.0;
        }
    }  

    private double calcula() {
        double calculo = (this.solo.getPotassio()*this.participacaoDesejada/this.participacaoPotassioCTCAtual()) - this.solo.getPotassio();
        if(calculo < 0.01)
            return 0.0;
        else
           return calculo;
    }

    private int fontePotassio() {
        switch(this.fonte){
            case CLORETO_DE_POTASSIO:
                return 58;
            case SULFATO_DE_POTASSIO:
                return 52;
            case SULFATO_POTASSIO_MAGNESIO:
                return 22;
            default:
                return 0;
        }
    }
    
    double quantidadeAplicar() {
        return this.calcula()*39.1*10*2*1.2*100/0.85/100*100/this.fontePotassio();
    }

    double forneceraTambem1() {
        switch (this.fonte){
            case SULFATO_DE_POTASSIO:
                return this.quantidadeAplicar()*0.17;
            case SULFATO_POTASSIO_MAGNESIO:
                return this.quantidadeAplicar()*0.22;
            default:
                return 0.0;
        }
    }

    String forneceraTambem2() {
        switch (this.fonte){
            case SULFATO_DE_POTASSIO:
                return "ENXOFRE";
            case SULFATO_POTASSIO_MAGNESIO:
                return "ENXOFRE";
            default:
                return "";
        }
    }

    double forneceraTambem3() {
        switch (this.fonte){
            case SULFATO_POTASSIO_MAGNESIO:
                return this.quantidadeAplicar()*0.18;
            default:
                return 0.0;
        }
    }

    String forneceraTambem4() {
        switch (this.fonte){
            case SULFATO_POTASSIO_MAGNESIO:
                return "MAGNÉSIO";
            default:
                return "";
        }
    }

    double custo() {
        return this.valor*this.quantidadeAplicar()/1000;
    }
    
}
