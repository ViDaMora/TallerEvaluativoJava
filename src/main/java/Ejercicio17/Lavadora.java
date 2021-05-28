package Ejercicio17;

public class Lavadora extends  Eletrodomestico{
    double carga= 5;
    public Lavadora(){
    }

    public Lavadora(double precioBase, double peso, double carga) {
        super(precioBase, peso);
        this.carga = carga;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }


    @Override
    public double precioFinal(){
        return super.precioFinal()+ this.precioPorCarga();
    }

    private double precioPorCarga() {
        return this.carga>=30?50:0;
    }
}
