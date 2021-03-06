public class Contador {
    
    double valorInicial;
    double valorFinal;
    double valorIncremental;
    double valorActual;


    public double getValorActual(){
        return this.valorActual;
    }

    public Contador(double valorInicial, double valorIncremental, double valorFinal) {
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
        this.valorIncremental = valorIncremental;

    }



    public double getValorInicial() {
        return this.valorInicial;
    }

    public static double setValorInicial(double valorInicial) {
        return valorInicial;
    }

    public double getValorIncremental() {
        return this.valorIncremental;
    }

    public void setValorIncremental(double valorIncremental) {
        this.valorIncremental = valorIncremental;
    }

    public double getValorFinal() {
        return this.valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public double sumarNumeros(){

        valorActual = getValorInicial();

        do {
            valorActual = valorActual + getValorIncremental();
            System.out.println("Valor que se va a incrementar: " + getValorIncremental());
            System.out.println("Valor acutal:" + valorActual);
            
        } while (getValorFinal() > valorActual);

        if( getValorFinal() < valorActual){
            System.out.println("Se ha superado el valor actual, se resetea a 0");
            valorActual = getValorInicial();
        }

        return valorActual;

    }

    public double resetearNumeros(){
        

        return getValorActual();
    }


}


   


