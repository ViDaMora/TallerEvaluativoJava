package Ejercicio3;

import java.util.Scanner;

public class Terminal {



    public static void menu(){
        try {
            System.out.println("Ingrese el radio del circulo");
            Scanner reader=new Scanner(System.in);
            double radio = Double.parseDouble(reader.nextLine());
            Circulo circulo = new Circulo(radio);
            double area = circulo.calcularArea();
            System.out.println("El area del circulo es: " + area);
        }catch (Exception e){
            System.out.println("Ingrese numeros por favor, no letras.\n" );
        }
    }
}
