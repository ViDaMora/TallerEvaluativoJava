package Ejercicio4;

import Ejercicio3.Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner reader=new Scanner(System.in);
            System.out.println("Ingrese el precio del producto");
            double valorProducto = Double.parseDouble(reader.nextLine());
            Iva Iva = new Iva();
            double valorProductoMasIva = Iva.calcularIva(valorProducto)+valorProducto;
            System.out.println("El precio del producto con iva es de $" + valorProductoMasIva);
        }catch (Exception e){
            System.out.println("Ingrese numeros por favor, no letras.\n" );
        }
    }
}
