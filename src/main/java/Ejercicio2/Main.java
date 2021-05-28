package Ejercicio2;


public class Main {
    public static void main(String[] args) {
        Comparador comparador = new Comparador();
        comparador.welcome();
        while(true){
            comparador.capturarInformacion();
            if (comparador.salir())break;
        }
    }
}
