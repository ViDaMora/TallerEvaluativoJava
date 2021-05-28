package Ejercicio2;

import java.util.Scanner;

public class Comparador {
    private double primerNumero;
    private double segundoNumero;

    public void welcome(){
        System.out.println("Bienvenido, ingrese dos numeros y el programa le indicara cual es el mayor o si son iguales");
        System.out.println("Para salir ingrese 0 en ambos numeros");
    }

    public void capturarInformacion(){
        try {
            Scanner reader=new Scanner(System.in);
            System.out.println("Ingrese el primer numero:");
            double numero = reader.nextDouble();
            this.primerNumero=numero;
            System.out.println("Ingrese el segundo numero:");
            numero = reader.nextDouble();
            this.segundoNumero=numero;
            this.comparador();
        }catch (Exception e){
            System.out.println("Ingrese numeros por favor, no letras.\n" );

        }


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

    public boolean salir(){
        if(this.primerNumero==0 && this.segundoNumero==0){
            return true;
        }
        return false;
    }
}
