package correcaodesolos;

public class CorrecaoFosforo extends Correcoes {
    
    private double teorFosforoAtingir; 
    private FonteFosforo fonteFosforo;
    private double eficienciaFosforo;
    
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
    
    public double quantidadeAplicar() {
        return ((this.teorFosforoAtingir - this.solo.getFosforo()) > 0.01 ) ? ((this.teorFosforoAtingir - this.solo.getFosforo())*4.58/this.eficienciaFosforo)*(100/this.fonteFosforo.valorFonteFosforo()) :  0.0;
    }

    public double forneceraTambem() {
        return this.quantidadeAplicar()*this.fonteFosforo.getValorForneceraTambem();
    }

    public String forneceraTambem2() {
        return this.fonteFosforo.getValorForneceraTambem2();
    } 

    public double forneceraTambem3() {
        return this.quantidadeAplicar()*this.fonteFosforo.getValorForneceraTambem3();
    }
    
    public String forneceraTambem4() {
        return this.fonteFosforo.getValorForneceraTambem4();
    }
}