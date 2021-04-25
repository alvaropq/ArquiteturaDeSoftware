package correcaodesolos;

public abstract class Correcoes {
    public Solo solo;
    public double valor;
    public Fontes fonte;
    
    public abstract double quantidadeAplicar();
    
    public String forneceraTambem(){    
        double valorPrimeiroNutriente = this.quantidadeAplicar()*this.fonte.getValorPrimeiroNutriente();
        double valorSegundoNutriente = this.quantidadeAplicar()*this.fonte.getValorSegundoNutriente();
        
        return  ((valorPrimeiroNutriente != 0.0) ? this.fonte.getNomePrimeiroNutriente()+": "+Double.toString(valorPrimeiroNutriente): "")+
                ((valorSegundoNutriente != 0.0) ? " "+this.fonte.getNomeSegundoNutriente()+": "+Double.toString(valorSegundoNutriente): "");
    } 
    
    double custo() {
        return this.valor * this.quantidadeAplicar()/1000;
    }
}