package Ejercicio17;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

public class Eletrodomestico {
    double precioBase=100;
    String color="blanco";
    char consumoEnergetico='F';
    double peso= 5;

    //Constructor por defecto
    public Eletrodomestico() {
    }

    public Eletrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Eletrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobrarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase + this.precioFinal();
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    protected char comprobrarConsumoEnergetico(char letra){
        letra= Character.toUpperCase(letra);
        String consumo = "ABCDEF";
        return  consumo.indexOf(letra)!=-1?letra:'F';
    }

    protected String comprobarColor(String color){
        color= color.toLowerCase(Locale.ROOT);
        String colores[]= {"negro", "rojo", "azul", "gris"};
        return color.contains(color)? color:"blanco";
    }

    public double precioFinal(){
        return this.precioPorTamano()+this.precioPorConsumo()+this.precioBase;
    }

    private double precioPorConsumo() {
        switch (this.consumoEnergetico){
            case 'A':
                return 100;
            case 'B':
                return 80;
            case 'C':
                return 60;
            case 'D':
                return 50;
            case 'E':
                return 30;
            case 'F':
            default:
                return 10;
        }
    }

    private double precioPorTamano() {
        if (this.peso<=19)
            return 10;
        if (this.peso<=49)
            return 50;
        if (this.peso<=79)
            return 80;
        if (this.peso>80)
            return 100;
        return  10;
    }

}
