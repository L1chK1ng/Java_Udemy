import java.util.Scanner;

/*
En un arreglo de 10 numeros hacer un desplazamiento de numeros:
0  1  ->  6
1  2  ->  1
2  3  ->  2
3  4  ->  3
4  5  ->  4
5  6  ->  5
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i+1) + ": ");
            numeros[i] = input.nextInt();
        }

        System.out.println("\nArreglo original");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int aux=0;
        for (int i = numeros.length-1; i > 0; i--) {
            aux = numeros[i];
            numeros[i] = numeros[i-1];
            numeros[i-1] = aux;
        }

        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}