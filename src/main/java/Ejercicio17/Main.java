package Ejercicio17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    Eletrodomestico Electrodomesticos []= new Eletrodomestico[10];
    Electrodomesticos=asignarElectrodomesticos();
    Television facturarTv [];
    Lavadora facturarLavadora [];
    Eletrodomestico facturarElectro [];
    double totalValor=0;
    totalValor = imprimirElectro(Electrodomesticos) +imprimirLavadora(Electrodomesticos) +imprimirTv(Electrodomesticos);
    System.out.println("El valor total de los electrodomesticos es: "+ totalValor);

    



    }

    private static Eletrodomestico[] asignarElectrodomesticos() {
        Eletrodomestico Electrodomesticos []= new Eletrodomestico[10];
        Electrodomesticos[0]=new Eletrodomestico();
        Electrodomesticos[1]= new Television(200,50);
        Electrodomesticos[2]=new Lavadora(500,10,30);
        Electrodomesticos[3]=new Lavadora(500,80,50);
        Electrodomesticos[4]= new Television(500,"negro",'A',85,30,true);
        Electrodomesticos[5]= new Television(500,"rojo",'E',40,50,false);
        Electrodomesticos[6]=new Lavadora(300,"negro",'C',80,30);
        Electrodomesticos[7]=new Lavadora();
        Electrodomesticos[8]=new Eletrodomestico(50,"azul",'D',60);
        Electrodomesticos[9]= new Television(80,"negro",'F',10,50,false);
        return Electrodomesticos;
    }

    private static double imprimirTv (Eletrodomestico array[]){
        double valor=0;
        for (Eletrodomestico electro:array) {
            if (electro instanceof Television){
                System.out.println("Valor de televisor: " + electro.precioFinal());
                valor = valor+electro.precioFinal();
            }
        }
        return valor;
    }
    private static double imprimirLavadora (Eletrodomestico array[]){
        double valor=0;
        for (Eletrodomestico electro:array) {
            if (electro instanceof Lavadora){
                System.out.println("Valor de Lavadora: " + electro.precioFinal());
                valor = valor+electro.precioFinal();

            }
        }
        return valor;

    }
    private static double imprimirElectro (Eletrodomestico array[]){
        double valor=0;
        Eletrodomestico electrodomestico = new Eletrodomestico();
        for (Eletrodomestico electro:array) {
            if (electro.getClass().equals(electrodomestico.getClass())){
                System.out.println("Valor de Electrodomestico: " + electro.precioFinal());
                valor = valor+electro.precioFinal();
            }
        }
        return valor;

    }
}
