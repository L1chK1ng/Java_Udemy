/*
Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en
las notas (double). Mostrar el promedio de las notas mayores a 5, promedio de notas
inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las
notas una a una para realizar los cálculos (contadores, sumas).

Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar
un mensaje de error finalizando el programa.
 */

import java.util.Scanner;

public class NotasAlumno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double notas=0.0, total5=0.0, total4=0.0, total=0.0;
        int notas5=0, notas4=0, notas1=0;
        boolean crash = false;

        for (int i = 0; i < 20; i++) {
            do {
                if (notas > 7) {
                    System.out.println("las notas deben ir de 1-7");
                }
                System.out.println("Ingrese la nota (1-7) " + (i+1));
                notas = input.nextDouble();
            } while (notas > 7);

            if (notas == 0) {
                crash = true;
                break;
            } else if (notas == 1) {
                notas1++;
            } else if (notas > 5) {
                total5 += notas;
                notas5++;
            } else if (notas < 4) {
                notas4++;
                total4 += notas;
            }
            total += notas;
        }

        if (crash) {
            System.out.println("Error, ha ingresado un parametro incorrecto, vuelva a ejecutar el programa");
        } else {
            System.out.println("El promedio de las notas mayores a 5 = " + (total5/notas5));
            System.out.println("El promedio de las notas menores a 4 =" + (total4/notas4));
            System.out.println("La cantidad de notas 1 = " + notas1);
            System.out.println("El promediio total = " + (total/20));
        }
    }
}
