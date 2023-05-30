/*
Crear una clase con el método main donde el desafío es buscar el número menor
de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de
números a comparar, luego utilizando una sentencia for iterar el numero de veces
(ingresado) para pedir el numero entero, entonces se requiere:

Calcular el menor número e imprimir el valor.

Si el menor número es menor que 10, imprimir "El número menor es menor que 10!".
 si no, imprimir " el numero menor es igual o mayor que 10!".
 */

import java.util.Scanner;

public class NumeroMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a ingresar (minimo 10)");
        int cantidad = input.nextInt();

        int num = 0, numeroMenor=10;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            num = input.nextInt();
            if (num < 10) {
                numeroMenor = num;
            } else {
                numeroMenor = numeroMenor;
            }
        }

        if (numeroMenor < 10) {
            System.out.println("El menor numero ingresado " + "("+numeroMenor+")" +  " es menor que 10");
        } else {
            System.out.println("El menor numero ingresado " + "("+numeroMenor+")" + " es mayor o igual a 10");
        }
    }
}
