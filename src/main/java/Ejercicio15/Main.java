package Ejercicio15;

import java.util.Scanner;

import static Ejercicio15.Menu.showMenu;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int menu=0;
        int opciones = 8;
        while (menu!=opciones){
            showMenu();
            System.out.println("Opcion: ");
            menu = reader.nextInt();
            switch (menu) {
                case 8:
                    break;
                case 1: case 2: case 3: case 4:
                case 5: case 6: case 7:
                    System.out.println("Marcaste la opcion: " + menu);
                    continue;
                default:
                    System.out.println("OPCION INCORRECTA");
                    continue;
            }
        }
    }



}
