package Ejercicio7;

public class MayorQueCero {
    private int numero;

    public MayorQueCero() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public void comparar(){
        if (this.getNumero()>0){
            System.out.println("El numero "+ getNumero()+ " es mayor que cero");
        }else if (this.getNumero()<0){
            System.out.println("El numero"+ getNumero()+ " es menor que cero");
        }else{
            System.out.println("El numero es cero, ingrese un numero diretente:");
        }
    }
}
