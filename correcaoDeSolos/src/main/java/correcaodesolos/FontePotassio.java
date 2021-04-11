package correcaodesolos;

/**
 *
 * @author Álvaro
 */
public enum FontePotassio {
    
    CLORETO_DE_POTASSIO{
        @Override
        public  double valorFontePotassio(){
            return 58;
        }
        
        @Override
        public double forneceraTambem(){
            return 0.0;
        }
        
        @Override
        public String forneceraTambem2(){
            return "";
        }
        
        @Override
        public double forneceraTambem3(){
            return 0.0;
        }
        
        @Override
        public String forneceraTambem4(){
            return "";
        }
    },
    SULFATO_DE_POTASSIO{
        @Override
        public  double valorFontePotassio(){
            return 52;
        }
        
        @Override
        public double forneceraTambem(){
            return 0.17;
        }
        
        @Override
        public String forneceraTambem2(){
            return "ENXOFRE";
        }
        
        @Override
        public double forneceraTambem3(){
            return 0.0;
        }
        
        @Override
        public String forneceraTambem4(){
            return "";
        }
    },
    
    SULFATO_POTASSIO_MAGNESIO{
        
        @Override
        public double valorFontePotassio(){
            return 22;
        }
        
        @Override
        public double forneceraTambem(){
            return 0.22;
        }
        
        @Override
        public String forneceraTambem2(){
            return "ENXOFRE";
        }
        
        @Override
        public double forneceraTambem3(){
            return 0.18;
        }
        
        @Override
        public String forneceraTambem4(){
            return "MAGNÉSIO";
        }
    };
    
    public abstract double valorFontePotassio();
    public abstract double forneceraTambem();
    public abstract String forneceraTambem2();
    public abstract double forneceraTambem3();
    public abstract String forneceraTambem4();
}
