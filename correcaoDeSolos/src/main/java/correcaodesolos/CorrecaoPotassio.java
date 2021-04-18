package correcaodesolos;

public class CorrecaoPotassio extends Correcoes{
    private double participacaoDesejada;
    private FontePotassio fonte;
    
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
        return (this.participacaoDesejada > 0.001) ? this.participacaoDesejada : 0.0;
    }  

    private double calcula() {       
        double calculo = (this.solo.getPotassio()*this.participacaoDesejada/this.participacaoPotassioCTCAtual()) - this.solo.getPotassio();
        return (calculo < 0.01) ? 0.0 : calculo;
    }
    
    public double quantidadeAplicar() {
        return this.calcula()*110400/this.fonte.valorFontePotassio();     
    }

    public double forneceraTambem() {
        return this.quantidadeAplicar()*this.fonte.getValorForneceraTambem();
    }

    public String forneceraTambem2() {
        return this.fonte.getValorForneceraTambem2();
    }

    public double forneceraTambem3() {
        return this.quantidadeAplicar()*this.fonte.getValorForneceraTambem3();
    }

    public String forneceraTambem4() {
        return this.fonte.getValorForneceraTambem4();
    }
}