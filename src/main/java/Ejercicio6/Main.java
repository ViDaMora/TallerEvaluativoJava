package Ejercicio6;

public class Main {

    public static void ParesImpares(int limite){
        for (int i=1;i<=limite ; i++){
            if (i % 2 ==0){
                System.out.println("Par: "+ i);
            }else
            {
                System.out.println("Impar: "+ i);
            }
        }
    }

    public static void main(String[] args) {
            ParesImpares(100);
    }
}
