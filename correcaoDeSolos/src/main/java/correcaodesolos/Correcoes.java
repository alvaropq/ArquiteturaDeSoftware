package correcaodesolos;

public abstract class Correcoes {
    public Solo solo;
    public double valor;
    
    public abstract double quantidadeAplicar();
    public abstract double forneceraTambem();
    public abstract String forneceraTambem2();
    public abstract double forneceraTambem3();
    public abstract String forneceraTambem4();
    
    double custo() {
        return this.valor * this.quantidadeAplicar()/1000;
    }
}
