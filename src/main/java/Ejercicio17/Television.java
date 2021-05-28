package Ejercicio17;

public class Television extends  Eletrodomestico{
    double pulgadas= 20;
    boolean TDT=false;

    //Constructor por defecto
    public Television() {
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double pulgadas, boolean TDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    @Override
    public double precioFinal(){
        return( super.precioFinal()+ this.precioPorPulgada()+ this.precioPorTDD());
    }

    private double precioPorTDD() {
        return TDT?50:0;
    }

    private double precioPorPulgada() {
        return (this.pulgadas>40)?this.precioBase*0.3:0;
    }
}
