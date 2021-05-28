package Ejercicio11;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Consola {
    private final char vocales[]={'a','e','i','o','u'};
    private Frase hilera;
    private Map<Character, Integer> cuentaLetras = new HashMap<Character, Integer>();

    public void capturarFrase(){
        Scanner reader=new Scanner(System.in);
        System.out.println("Ingrese una frase de la cual quiere conocer su longitud");
        this.hilera=new Frase(reader.nextLine());
    }
    public void calcularLongitudFrase(){
        System.out.println("La longitud de la frase ingresada es: " + this.hilera.contarFrase());
    }
    public void menu(){
        showMenu();
        Scanner reader=new Scanner(System.in);
        int menu  = reader.nextLine().charAt(0);
        if (menu == '1'){
            this.contarLetras(this.vocales);
        }else if (menu=='2'){
                this.capturarYContar();
        }
    }

    private void showMenu() {
        System.out.println("-----------MENU------------");
        System.out.println("Seleccione la opcion que desee");
        System.out.println("1. Contar las vocales");
        System.out.println("2. Contar una letra diferente");
        System.out.println("----------------------------");
    }

    private void capturarYContar() {
        try {
            Scanner reader=new Scanner(System.in);
            char caracter[]= new char[1];
            System.out.println("Ingrese el  caracter que desea contar ");
            caracter[0]=reader.nextLine().toLowerCase(Locale.ROOT).charAt(0);
            this.contarLetras(caracter);
        }catch (RuntimeException e){
            System.out.println("Ingrese un numero, no letras.");
        }

    }
    public void contarLetras(char letras[]){
        cuentaLetras= this.hilera.contadorLetras(letras);
        for (Character key: cuentaLetras.keySet()){
            System.out.println(key+ " = " + cuentaLetras.get(key));
        }
    }
}
