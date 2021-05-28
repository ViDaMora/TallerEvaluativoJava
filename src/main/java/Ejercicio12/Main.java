package Ejercicio12;

import java.util.Scanner;

import static Ejercicio12.ComparadorPalabras.*;

public class Main {

    static int   INDEX_NOT_FOUND= 0;

    public static void main(String[] args) {
        menu();

    }

    public static void menu(){
        Scanner reader=new Scanner(System.in);
        System.out.println("Ingrese la primer cadena");
        String hilera1 = reader.nextLine();
        System.out.println("Ingrese la segunda cadena");
        String hilera2 = reader.nextLine();
        String respuesta = compararPalabra(hilera2,hilera1);
        System.out.println("La diferencia entre la primera cadena y la segunda es la caden: "+ respuesta );
    }
    }


