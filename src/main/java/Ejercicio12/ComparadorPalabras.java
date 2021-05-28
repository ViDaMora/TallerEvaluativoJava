package Ejercicio12;

public class ComparadorPalabras {

    public static String compararPalabra(String hilera1, String hilera2){
        try {
            int index = indexOf(hilera1,hilera2);
            return hilera1.substring(index);
        }catch (RuntimeException e){
            System.out.println("Ingrese una palabra, no un espacio vacio");
            return e.getMessage();
        }
    }

    public static int indexOf(String hilera1, String hilera2) {
        int index=0;
        boolean salir= false;
        while (hilera1 !="" && hilera2 !="") {

            if (!(hilera1.charAt(index)==hilera2.charAt(index))){
                return index;
            }
             index++;
        }
        return index;
    }

}
