package Ejercicio5;

public class Main {


    public static void ParesImpares(int limite){
        int contador=1;
        while(contador<=(limite/2)){
            int numero= contador*2;
            System.out.println("Impar: "+ (numero -1) );
            System.out.println("Par: "+ numero);
            contador++;
        }
    }
    public static void main(String[] args) {
            ParesImpares(100);
    }
}
