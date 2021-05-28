package Ejercicio10;

import java.util.Scanner;

public class Consola {
    Frase Oracion ;


    public String leerFrase(){
        Scanner reader=new Scanner(System.in);
        System.out.println("Ingreses una frase para eliminar los espacios ");
        String oracion=reader.nextLine();
        Oracion = new Frase(oracion);
        return oracion;
    }

    public void eliminarEspacios(){
        String sinEspacios = Oracion.quitarEspacios();
        System.out.println("La frase resultante sin espacios es: \u001B[33m "+ sinEspacios +"\u001B[0m");

    }

}
