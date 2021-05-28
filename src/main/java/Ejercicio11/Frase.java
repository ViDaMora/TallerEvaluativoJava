package Ejercicio11;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Frase {
    private String hilera;


    public Frase(String hilera) {
        this.hilera = hilera.toLowerCase(Locale.ROOT);
    }

    public int contarFrase(){
        return this.hilera.length();
    }

    public  int contarLetra(char vocal){
        char temporal;
        int contador=0;
        for (int index=0; index< this.contarFrase();index++){
            temporal = this.hilera.charAt(index);
            if (temporal == vocal)
                contador++;
        }
        return contador;
    }

    public Map<Character,Integer> contadorLetras(char[] letras){
        int valor=0;
        HashMap<Character, Integer> cuentaLetras = new HashMap<Character, Integer>();
        for (char letra:letras) {
           valor=this.contarLetra(letra);
            cuentaLetras.put(letra,valor);
        }
        return cuentaLetras;
    }
}
