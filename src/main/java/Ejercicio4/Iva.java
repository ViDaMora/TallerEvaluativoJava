package Ejercicio4;

public class Iva {
    private double porsentajeIva;

    public Iva() {
        this.porsentajeIva = 21;
    }

    public double calcularIva(double valor){
        return(this.porsentajeIva*valor)/100;
    }
}
