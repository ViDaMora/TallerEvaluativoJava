package Ejercicio16;

import java.util.Random;

import static Ejercicio16.Consola.capturarInformacion;

public class Main {




    public static void main(String[] args) {
        Persona primerPersona = capturarInformacion(0);
        Persona segundaPersona= capturarInformacion(1);
        Persona terceraPersona= capturarInformacion(2);
        pesar(primerPersona);
        pesar(segundaPersona);
        pesar(terceraPersona);
        verificarEdad(primerPersona);
        verificarEdad(segundaPersona);
        verificarEdad(terceraPersona);
        System.out.println("INFORMACION PERSONAS: ");
        System.out.println(primerPersona.toString());
        System.out.println(segundaPersona.toString());
        System.out.println(terceraPersona.toString());
    }

    public static void pesar(Persona persona){
            if (persona.calcularIMC()==0)
                System.out.println(persona.getNombre()+"Estas en un peso Normal");
            else if (persona.calcularIMC()==1)
                System.out.println(persona.getNombre()+"Tienes sobrepeso");
            else
                System.out.println("Estas por debajo de tu peso");

    }
    public static void verificarEdad(Persona persona){
        if(persona.esMayorDeEdad()){
            System.out.println("La persona "+ persona.getNombre()+" es mayor de edad");
        }else {
            System.out.println("La persona "+ persona.getNombre()+" NO es mayor de edad");
        }
    }
}
