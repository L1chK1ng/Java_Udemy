/*
Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una
fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.
Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos mas adelante,
también se pueden apoyar de google que hay varios ejemplos.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Ingrese fecha de nacimiento con formato (dd-MM-yyyy)");
        String nacimientoStr = input.next();
        Date fechaActual = Calendar.getInstance().getTime();

        try {
            Date fechaNacimiento = sdf.parse(nacimientoStr);
            int aniosDif = fechaActual.getYear() - fechaNacimiento.getYear();
            int mesDif = fechaActual.getMonth() - fechaNacimiento.getMonth();
            int diaDif = fechaActual.getDay() - fechaNacimiento.getDay();

            //se evalua que sea el dia del año en curso
            if ((mesDif < 0) || (mesDif == 0 && diaDif < 0)) {
                aniosDif--;
            }

            System.out.println("edad = " + aniosDif);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}