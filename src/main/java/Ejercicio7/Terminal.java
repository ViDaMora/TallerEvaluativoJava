package Ejercicio7;

import java.util.Scanner;

public class Terminal {
    public static void menu(){
        Scanner reader=new Scanner(System.in);
        System.out.println("Por favor ingrese un numero para saber si es mayor o menor que cero");
        MayorQueCero numero = new MayorQueCero();
        try {
                numero.setNumero(reader.nextInt());
                numero.comparar();
        }catch (RuntimeException  e){
            System.out.println("El sistema recibe numeros enteros, no letras.");
        }
    }
}
