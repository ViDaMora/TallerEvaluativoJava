package Ejercicio10;

public class Frase {
    String Hilera;

    public Frase(String hilera) {
        Hilera = hilera;
    }

    public String quitarEspacios(){
        return this.Hilera.replace(" ","");
    }
}
