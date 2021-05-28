package Ejercicio8;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Semana {
    protected  final List<String> dias= List.of("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo");


    public boolean diaLaboral(String dia){
        switch (dia) {
            case "sabado":
            case "domingo":
                return false;
            default:
                return true;
        }
    }
}
