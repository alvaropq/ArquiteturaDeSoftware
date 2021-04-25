package correcaodesolos;

public class CorrecaoPotassio extends Correcoes{
    private double participacaoDesejada;
    
    public CorrecaoPotassio() {
    }

    public CorrecaoPotassio(Solo solo,double participacaoDesejada, Fontes fonte, double valor){
        this.solo = solo;
        this.participacaoDesejada = participacaoDesejada;
        this.fonte = fonte;
        this.valor = valor;
    }

    double participacaoPotassioCTCAtual() {
        return this.solo.getPotassio()/(this.solo.getCalcio()+this.solo.getMagnesio()+this.solo.getPotassio()+this.solo.getHidrogenioAluminio());
    }

    double participacaoPotassioCTCIdeal() {
        return 0.03;
    }
    
    double participacaoPotassioCTCAposCorrecao() {   
        return (this.participacaoDesejada > 0.001) ? this.participacaoDesejada : 0.0;
    }  

    private double calcula() {
        double calculo = (this.solo.getPotassio()*this.participacaoDesejada/this.participacaoPotassioCTCAtual()) - this.solo.getPotassio();
        return (calculo < 0.01) ? 0.0 : calculo;
    }
    
    public double quantidadeAplicar() {
        return this.calcula()*110400/this.fonte.valorFonte();     
    }
  
}