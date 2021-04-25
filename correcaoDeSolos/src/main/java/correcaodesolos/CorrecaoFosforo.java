package correcaodesolos;

public class CorrecaoFosforo extends Correcoes {
    
    private double teorFosforoAtingir; 
    
    private double eficienciaFosforo;
    
    public CorrecaoFosforo() {
    }
    
    public CorrecaoFosforo(Solo solo) {
        this.solo = solo;
    }
    
    public CorrecaoFosforo( double teorFosforoAtingir, Fontes fonte, double eficienciaFosforo, Solo solo, double valor) {
        this.teorFosforoAtingir = teorFosforoAtingir;
        this.fonte = fonte;
        this.eficienciaFosforo = eficienciaFosforo;
        this.solo = solo;
        this.valor = valor;
    }
    
    public double quantidadeAplicar() {
        return ((this.teorFosforoAtingir - this.solo.getFosforo()) > 0.01 ) ? ((this.teorFosforoAtingir - this.solo.getFosforo())*4.58/this.eficienciaFosforo)*(100/this.fonte.valorFonte()) :  0.0;
    } 
}