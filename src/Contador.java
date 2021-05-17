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
        return this.valorInicial = valorInicial;
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


}


   


