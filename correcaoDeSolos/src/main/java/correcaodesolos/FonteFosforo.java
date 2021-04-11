package correcaodesolos;

/* Ajuste de manutenibilidade para os métodos relacionados a correção de fosforo, onde foi-se utilizado conceitos aprendidos
na aula de arquitetura de software com o Profº Gabriel Costa, cujo repositório consta no link: https://github.com/gabrielcostasilva/sa-soilcorrection
*/

/**
 *
 * @author Álvaro
 */
public enum FonteFosforo {
    SUPERFOSFATO_SIMPLES{
        
        @Override
        public double valorFonteFosforo(){
            return 18.0;
        }
        
        @Override
        public double forneceraTambem(){
            return 0.1;
        }
        
        @Override
        public String forneceraTambem2() {
            return "Enxofre";
        }
        
        @Override
        public double forneceraTambem3(){
            return 0.28;
        }
        
        @Override
        public String forneceraTambem4() {
            return "CÁLCIO";
        }
        
    },
    SUPERFOSFATO_TRIPLO{
        
        @Override
        public double valorFonteFosforo(){
            return 41.0;
        }
        
        @Override
        public double forneceraTambem(){
            return 0.0;
        }
        
        @Override
        public String forneceraTambem2() {
            return "";
        }
        
        @Override
        public double forneceraTambem3(){
            return 0.2;
        }
        
        @Override
        public String forneceraTambem4() {
            return "CÁLCIO";
        }
    },
    MAP{
        
        @Override
        public double valorFonteFosforo(){
            return 48.0;
        }
        
        @Override
        public double forneceraTambem(){
            return 0.0;
        }
        
        @Override
        public String forneceraTambem2() {
            return "";
        }
        
        @Override
        public double forneceraTambem3(){
            return 0.09;
        }
        
        @Override
        public String forneceraTambem4() {
            return "NITROGÊNIO";
        }
    },
    DAP{
        
        @Override
        public double valorFonteFosforo(){
            return 45.0;
        }
        
        @Override
        public double forneceraTambem(){
            return 0.0;
        }
        
        @Override
        public String forneceraTambem2() {
            return "";
        }
        
        @Override
        public double forneceraTambem3(){
            return 0.16;
        }
        
        @Override
        public String forneceraTambem4() {
            return "NITROGÊNIO";
        }
    },
    YOORIN{
        
        @Override
        public double valorFonteFosforo(){
            return 18.0;
        }
        
        @Override
        public double forneceraTambem(){
            return 0.15;
        }
        
        @Override
        public String forneceraTambem2() {
            return "Magnésio";
        }
        
        @Override
        public double forneceraTambem3(){
            return 0.28;
        }
        
        @Override
        public String forneceraTambem4() {
            return "CÁLCIO";
        }
    },
    
    FOSFATO_ARAD{
        
        @Override
        public double valorFonteFosforo(){
            return 33.0;
        }
        
        @Override
        public double forneceraTambem(){
            return 0.0;
        }
        
        @Override
        public String forneceraTambem2() {
            return "";
        }
        
        @Override
        public double forneceraTambem3(){
            return 0.52;
        }
        
        @Override
        public String forneceraTambem4() {
            return "CÁLCIO";
        }
    },
    FOSFATO_GAFSA{
        
        @Override
        public double valorFonteFosforo(){
            return 29.0;
        }
        
        @Override
        public double forneceraTambem(){
            return 0.0;
        }
        
        @Override
        public String forneceraTambem2() {
            return "";
        }
        
        @Override
        public double forneceraTambem3(){
            return 0.52;
        }
        
        @Override
        public String forneceraTambem4() {
            return "CÁLCIO";
        }
    },
    FOSFATO_DAOUI{
        
        @Override
        public double valorFonteFosforo(){
            return 32.0;
        }
        
        @Override
        public double forneceraTambem(){
            return 0.0;
        }
        
        @Override
        public String forneceraTambem2() {
            return "";
        }
        
        @Override
        public double forneceraTambem3(){
            return 0.45;
        }
        
        @Override
        public String forneceraTambem4() {
            return "CÁLCIO";
        }
    },
    FOSFATO_PATO_MINAS{
        
        @Override
        public double valorFonteFosforo(){
            return 24.0;
        }
        
        @Override
        public double forneceraTambem(){
            return 0.0;
        }
        
        @Override
        public String forneceraTambem2() {
            return "";
        }
        
        @Override
        public double forneceraTambem3(){
            return 0.28;
        }
        
        @Override
        public String forneceraTambem4() {
            return "CÁLCIO";
        }
    },
    ESCORIA_DE_THOMAS{
        
        @Override
        public double valorFonteFosforo(){
            return 18.5;
        }
        
        @Override
        public double forneceraTambem(){
            return 0.0;
        }
        
        @Override
        public String forneceraTambem2() {
            return "";
        }
        
        @Override
        public double forneceraTambem3(){
            return 0.44;
        }
        
        @Override
        public String forneceraTambem4() {
            return "CÁLCIO";
        }
    },
    ACIDO_FOSFORICO{
        
        @Override
        public double valorFonteFosforo(){
            return 52.0;
        }
        
        @Override
        public double forneceraTambem(){
            return 0.0;
        }
        
        @Override
        public String forneceraTambem2() {
            return "";
        }
        
        @Override
        public double forneceraTambem3(){
            return 0.0;
        }
        
        @Override
        public String forneceraTambem4() {
            return "";
        }
    },
    MULTIF_MAGNESIANO{
        
        @Override
        public double valorFonteFosforo(){
            return 18.0;
        }
        
        @Override
        public double forneceraTambem(){
            return 0.11;
        }
        
        @Override
        public String forneceraTambem2() {
            return "Enxofre";
        }
        
        @Override
        public double forneceraTambem3(){
            return 0.18;
        }
        
        @Override
        public String forneceraTambem4() {
            return "CÁLCIO";
        }
    };
    
    public abstract double valorFonteFosforo();
    public abstract double forneceraTambem();
    public abstract String forneceraTambem2();
    public abstract double forneceraTambem3();
    public abstract String forneceraTambem4();
}
