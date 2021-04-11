package correcaodesolos;

/* Ajuste de manutenibilidade para os métodos relacionados a correção de potassio, onde foi-se utilizado conceitos aprendidos
na aula de arquitetura de software com o Profº Gabriel Costa, cujo repositório consta no link: https://github.com/gabrielcostasilva/sa-soilcorrection
*/

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
    
    double quantidadeAplicar() {
        return this.calcula()*39.1*10*2*1.2*100/0.85/100*100/this.fonte.valorFontePotassio();
        
    }

    double forneceraTambem() {
        return this.quantidadeAplicar()*this.fonte.forneceraTambem();
    }

    String forneceraTambem2() {
        return this.fonte.forneceraTambem2();
    }

    double forneceraTambem3() {
        return this.quantidadeAplicar()*this.fonte.forneceraTambem3();
    }

    String forneceraTambem4() {
        return this.fonte.forneceraTambem4();
    }

    double custo() {
        return this.valor*this.quantidadeAplicar()/1000;
    }
    
}
