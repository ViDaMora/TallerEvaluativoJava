package Ejercicio3;

public class Circulo {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.pow(getRadio(),2)*Math.PI;
    }
}
