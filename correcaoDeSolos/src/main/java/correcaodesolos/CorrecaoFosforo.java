package correcaodesolos;

/* Ajuste de manutenibilidade para os métodos relacionados a correção de fosforo, onde foi-se utilizado conceitos aprendidos
na aula de arquitetura de software com o Profº Gabriel Costa, cujo repositório consta no link: https://github.com/gabrielcostasilva/sa-soilcorrection
*/

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
    
    public CorrecaoFosforo(Solo solo) {
        this.solo = solo;
    }
    
    public CorrecaoFosforo( double teorFosforoAtingir, FonteFosforo fonteFosforo, double eficienciaFosforo, Solo solo, double valor) {
        this.teorFosforoAtingir = teorFosforoAtingir;
        this.fonteFosforo = fonteFosforo;
        this.eficienciaFosforo = eficienciaFosforo;
        this.solo = solo;
        this.valor = valor;
    }
    
    double quantidadeAplicar() {
        if((this.teorFosforoAtingir - this.solo.getFosforo()) > 0.01 ){
            return ((this.teorFosforoAtingir - this.solo.getFosforo())*2*2.29*100/this.eficienciaFosforo/100)*(100/this.fonteFosforo.valorFonteFosforo());
        }
        else{
            return 0.0;
        }
    }

    double forneceraTambem() {
        return this.quantidadeAplicar()*this.fonteFosforo.forneceraTambem();
    }

    String forneceraTambem2() {
        return this.fonteFosforo.forneceraTambem2();
    } 

    double forneceraTambem3() {
        return this.quantidadeAplicar()*this.fonteFosforo.forneceraTambem3();
    }
    
    String forneceraTambem4() {
        return this.fonteFosforo.forneceraTambem4();
    }

    double custo() {
        return this.valor * this.quantidadeAplicar()/1000;
    }
}
