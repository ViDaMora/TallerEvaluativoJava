package Ejercicio14;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void  menu(){
        Scanner reader= new Scanner(System.in);
        System.out.println("Ingrese un numero para imprimirlo desde su posicion hasta el 1000");
        try {
            int numero =reader.nextInt();
            while(numero<=1000){
                System.out.println("Estamos en: "+numero);
                numero=numero+2;
            }
        }catch (RuntimeException e){
            System.out.println("Ingrese un numero valido, no se permiten caracteres.");
        }
    }
}
