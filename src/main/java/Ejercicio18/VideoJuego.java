package Ejercicio18;

public class VideoJuego implements Entregable{
    private String titulo="";
    private double horasEstimadas=10;
    private boolean prestado = false;
    private String genero="";
    private String company ="";

    public VideoJuego() {
    }

    public VideoJuego(String titulo, double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuego(String titulo, double horasEstimadas, String genero, String company) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.company = company;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompany() {
        return company;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", prestado=" + prestado +
                ", genero='" + genero + '\'' +
                ", compañia='" + company + '\'' +
                '}';
    }

    @Override
    public void entregar(){
        this.prestado=true;

    };

    @Override
    public void devolver(){
        this.prestado=false;
    };

    @Override
    public boolean isEntregado(){
        return this.prestado;
    };

    @Override
    public double compareTo(Object object) {
        VideoJuego nuevo = (VideoJuego)object;
        return this.horasEstimadas- nuevo.horasEstimadas;
    }
}
