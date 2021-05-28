package Ejercicio9;

import java.util.Scanner;

public class Consola {
    Texto texto;
    char original;
    char remplazo;


    public Consola() {
    }

    public void bienvenida(){
        System.out.println("Al texto 'La sonrisa sera la mejor arma contra la tristeza' se le remplazaran dos caracteres que el usuario quiera");
        this.texto = new Texto("La sonrisa sera la mejor arma contra la tristeza ");
    }
    public void capturarCaracteres(){
        try {
            Scanner reader=new Scanner(System.in);
            System.out.println("Ingrese el caracter que desea remplazar");
            this.original= reader.next().charAt(0);
            System.out.println("Ingrese el caracter que remplazara la letra anterior");
            this.remplazo= reader.next().charAt(0);
        }catch (Exception e){
            System.out.println("Ingrese solo una letra, no se permiten numeros ni palabras");
        }

    }
    public void remplazarCaracteres (){
        this.texto.remplazarCaracter(this.original,this.remplazo);
        System.out.println("El resultado despues del remplazo es: " + this.texto.getHilera());
    }
    public void concatenarFrase(){
        Scanner reader=new Scanner(System.in);
        System.out.println("Ahora ingrese la frase que desee concatenar a '"+this.texto.getHilera()+"'");
        this.texto.concatenar(reader.nextLine());
    }
    public void fraseFinal(){
        System.out.println("La frase resultante es: "+ this.texto.getHilera());
    }
}
