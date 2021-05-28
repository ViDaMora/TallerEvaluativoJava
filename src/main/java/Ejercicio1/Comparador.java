package Ejercicio1;

import java.util.Scanner;

public class Comparador {
    private double primerNumero;
    private double segundoNumero;

    public Comparador(double primerNumero, double segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    public void  comparador(){
        if (this.primerNumero > this.segundoNumero){
            System.out.println("El numero mayor es: " + this.primerNumero + "\n");
        }else if (this.primerNumero  < this.segundoNumero){
            System.out.println("El numero mayor es: " + this.segundoNumero+"\n");
        }else{
            System.out.println("Ambos numeros son iguales \n " );
        }
    }

}
