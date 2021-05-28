package Ejercicio18;



public class Main {
    public static void main(String[] args) {
    Serie Series[]= new Serie[5];
    VideoJuego VideoJuegos []= new VideoJuego[5];
    Series= inicializarSeries();
    VideoJuegos = inicializarVideoJuegos();
    Series[0].entregar();
    Series[1].entregar();
    VideoJuegos[0].entregar();
    VideoJuegos[1].entregar();
    System.out.println("El numero de Series prestadas es de: " + contarPrestados(Series));
    System.out.println("El numero de Video Juegos prestados es de: " + contarPrestados(VideoJuegos));
    Series[0].devolver();
    Series[1].devolver();
    VideoJuegos[0].devolver();;
    VideoJuegos[1].devolver();;
    System.out.println("La Serie con mas temporadas es: " + masTemporadas(Series));
    System.out.println("El Videjuego con mas horas es: " + masHoras(VideoJuegos));
    }

    private static String masTemporadas(Serie[] series) {
        Serie mayor = new Serie("",0,"","");
        for (Serie serie:series) {
            if(serie.getNumeroDeTemporadas()>mayor.getNumeroDeTemporadas())
                mayor=serie;
        }
        return mayor.toString();
    }
    private static String masHoras(VideoJuego[] videoJuegos) {
        VideoJuego mayor = new VideoJuego("",0);
        for (VideoJuego game:videoJuegos) {
            if(game.getHorasEstimadas()>mayor.getHorasEstimadas())
                mayor=game;
        }
        return mayor.toString();
    }

    private static int contarPrestados(Entregable[] array) {
        int numeroPrestados=0;
        for (Entregable elemeto: array) {
            numeroPrestados= numeroPrestados+ (elemeto.isEntregado()?1:0);
        }
        return numeroPrestados;
    }

    private static Serie[] inicializarSeries() {
        Serie Series[]= new Serie[5];
        Series[0]=new Serie("El abatido", 5,"accion","daniel mira");
        Series[1]=new Serie("El bandolero","Daniel Mora");
        Series[2]=new Serie("La cueva", "Yonimemeto");
        Series[3]=new Serie("El jorobado",10,"Drama","Alejandro");
        Series[4]=new Serie("Amigos mios",8,"Accion","Arturo");
        return Series;
    }
    private static VideoJuego[] inicializarVideoJuegos() {
        VideoJuego VideoJuego[]= new VideoJuego[5];
        VideoJuego[0]=new VideoJuego("El abatido", 150,"accion","Softka");
        VideoJuego[1]=new VideoJuego("El bandolero",160);
        VideoJuego[2]=new VideoJuego("La cueva", 175);
        VideoJuego[3]=new VideoJuego("El jorobado",100,"Drama","Moras");
        VideoJuego[4]=new VideoJuego("Amigos mios",85,"Accion","Arturo.SA");
        return VideoJuego;
    }
}
