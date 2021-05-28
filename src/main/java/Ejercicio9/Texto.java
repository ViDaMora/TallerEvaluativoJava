package Ejercicio9;

public class Texto {
    private  String hilera;

    public Texto(String hilera) {
        this.hilera = hilera;
    }

    public String getHilera() {
        return hilera;
    }

    public void concatenar(String frase){
        this.hilera=this.hilera.concat(frase);
    }
    public void remplazarCaracter(char original, char remplazo){
         this.hilera=this.hilera.replace(original,remplazo);
    }
}
