package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        Consola terminal = new Consola();
        String menu;
        do {
            System.out.println("Para salir ingrese 'exit'\n");
            menu= terminal.leerFrase();
            if (menu.equals("exit")){
                break;
            }
            terminal.eliminarEspacios();
        }while (true);
    }
}
