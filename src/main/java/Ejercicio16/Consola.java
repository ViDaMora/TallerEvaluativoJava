package Ejercicio16;

import java.util.Scanner;

public class Consola {


    public static Persona capturarInformacion(int persona){
        Persona persSona = new Persona();

             switch (persona){
                 case 0:
                     return ingresarPrimerPersona();
                 case 1:
                     return ingresarSegundaPersona();
                 case 2:
                     return ingresarTerceraPersona();
         }
         return persSona;

    }

    private static Persona ingresarPrimerPersona() {
        try {
            String nombre;
            char sexo;
            double peso,altura;
            int edad;
            Persona persona;
            Scanner reader=new Scanner(System.in);
            System.out.println("Ingrese el nombre de la primera persona: ");
            nombre=reader.nextLine();
            System.out.println("Ingrese el sexo de la primera persona(M/H): ");
            sexo=reader.nextLine().charAt(0);
            System.out.println("Ingrese el peso de la primera persona en kilogramos (Los decimales con coma ','): ");
            peso=reader.nextDouble();
            System.out.println("Ingrese el altura de la primera persona en metros (Los decimales con coma ','): ");
            altura=reader.nextDouble();
            System.out.println("Ingrese el edad de la primera persona: ");
            edad=reader.nextInt();
            persona= new Persona(nombre,sexo,peso,altura,edad);
            return persona;
        }catch (RuntimeException e){
            System.out.println("Ingrese datos validos.");

        }
        return null;
    }
    private static Persona ingresarSegundaPersona() {
        try {
            String nombre;
            char sexo;
            int edad;
            Scanner reader=new Scanner(System.in);
            System.out.println("Ingrese el nombre de la segunda persona: ");
            nombre=reader.nextLine();
            System.out.println("Ingrese el sexo de la segunda persona: ");
            sexo=reader.nextLine().charAt(0);
            System.out.println("Ingrese el edad de la segunda persona: ");
            edad=reader.nextInt();
            Persona persona = new Persona(nombre,sexo,edad);
            return persona;
        }catch (RuntimeException e){
            System.out.println("Ingrese datos validos.");

        }
        return null;
    }
    private static Persona ingresarTerceraPersona() {
        try {
            String nombre;
            char sexo;
            double peso,altura;
            int edad;
            Persona persona = new Persona();
            Scanner reader=new Scanner(System.in);
            System.out.println("Ingrese el nombre de la tercer persona: ");
            nombre=reader.nextLine();
            System.out.println("Ingrese el sexo de la tercer persona: ");
            sexo=reader.nextLine().charAt(0);
            System.out.println("Ingrese el peso de la terccer persona (Los decimales con coma ','): ");
            peso=reader.nextDouble();
            System.out.println("Ingrese el altura de la tercer persona (Los decimales con coma ','): ");
            altura=reader.nextDouble();
            System.out.println("Ingrese el edad de la tercer persona: ");
            edad=reader.nextInt();
            persona.setAltura(altura);
            persona.setEdad(edad);
            persona.setPeso(peso);
            persona.setNombre(nombre);
            persona.setSexo(sexo);
            return persona;
        }catch (RuntimeException e){
            System.out.println("Ingrese datos validos.");

        }
        return null;
    }

}
