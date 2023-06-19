/*
Escribir un programa que imprima una X construida a base de la letra X en las
diagonales de la matriz y utilizar el carácter guion bajo como relleno. El tamaño de
la x se basa en una variable n que indicará el tamaño de la letra para imprimir en una matriz de n x n.

El carácter "X" en mayúscula y el guion bajo "_" para los espacios.

Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tamaño de la 'X'");
        int n = input.nextInt();
        String[][] dibu = new String[n][n];

        //Se carga toda la matriz con guiones
        for (int i = 0; i < dibu.length; i++) {
            for (int j = 0; j < dibu[i].length; j++) {
                dibu[i][j] = "_";
            }
        }

        //Se llena la diagonal principal con x
        for (int i = 0; i < dibu.length; i++) {
            for (int j = 0; j < dibu[i].length; j++) {
                if (i == j) {
                    dibu[i][j] = "x";
                }
            }
        }


        //Se llena la diagonal secundaria con x
        int k = n-1;
        for (int i = 0; i < dibu.length; i++) {
            dibu[i][k] = "x";
            k--;
        }


        //Se muestra la matriz con la X
        for (int i = 0; i < dibu.length; i++) {
            for (int j = 0; j < dibu[i].length; j++) {
                System.out.print(dibu[i][j] + " ");
            }
            System.out.println();
        }
    }
}