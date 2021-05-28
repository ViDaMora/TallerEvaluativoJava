package Ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void ingresarInformacion(){
        Scanner reader=new Scanner(System.in);
        Semana semana = new Semana();
        String dia;
        boolean diaLaboral;
        do {
            dia= reader.nextLine().toLowerCase(Locale.ROOT).replace(" ","");
            if (semana.dias.contains(dia)){
                diaLaboral= semana.diaLaboral(dia);
                if (diaLaboral){
                    System.out.println("El dia "+dia+ " es un dia laboral.");
                }else {
                    System.out.println("El dia "+dia+ " no es un dia laboral.");
                }
            }else if(!dia.contains("exit")){
                System.out.println("Este dia no existe, ingrese uno de nuevo:");
            }
        }while (!dia.contains("exit"));
    }

    public static void main(String[] args) {
        System.out.println("Ingrese un dia de la semana para identificar si es un dia laboral");
        System.out.println("Para salir ingrese 'exit' en consola");
        ingresarInformacion();
    }
}
