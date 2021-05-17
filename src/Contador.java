public class Contador {
    
    double valorInicial;
    double valorFinal;
    double valorIncremental;


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

        double valorActual = getValorInicial();

        System.out.println("El valor inicial es: " + getValorInicial());
        System.out.println("El valor final es: " + getValorFinal());
        System.out.println("El valor incremental es: " + getValorIncremental());

        do {
            valorActual = valorActual + getValorIncremental();
            System.out.println("Valor que se va a incrementar: " + getValorIncremental());
            System.out.println("Valor acutal:" + valorActual);
            
        } while (getValorFinal() <= valorActual);

        return getValorInicial();

    }

    public double resetearNumeros(){

        return setValorInicial(0);
    }


}


   


