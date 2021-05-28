package Ejercicio13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date fecha = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd H:mm:ss ");
        System.out.println("Fecha y hora: "+ hourdateFormat.format(fecha));
    }
}
