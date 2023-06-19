/*
Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio
de los números positivos, el promedio de los negativos y contar el número de ceros.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int[] numeros = new int[7];

        System.out.println("Ingrese 7 numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i+1) + ": ");
            numeros[i] = input.nextInt();
        }

        int numeroNega=0, numeroPosi=0, ceros=0;
        double totalNeg=0, totalPosi=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                numeroPosi++;
                totalPosi += numeros[i];
            } else if (numeros[i] < 0 ) {
                numeroNega++;
                totalNeg += Math.abs(numeros[i]);
            } else {
                ceros++;
            }
        }

        System.out.println("El promedio de los numeros POSITIVOS es: " + (totalPosi / numeroPosi));
        System.out.println("El promedio de los numeros NEGATIVOS es: " + (totalNeg / numeroNega));
        System.out.println("La cantidad de ceros presentes en el arreglo: " + ceros);
    }
}