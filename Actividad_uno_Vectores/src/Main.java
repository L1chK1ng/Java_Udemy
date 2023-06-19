/*
Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo,
el segundo, el antepenúltimo, el tercero, y así sucesivamente.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int[] numeros = new int[10];
        int[] num2 = new int[numeros.length*2];

        //Carga del arreglo
        System.out.println("Ingrese 10 numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i+1) + ": ");
            numeros[i] = input.nextInt();
        }

        //Llenando otro arreglo con numeros de 10-1
        int j=0;
        for (int i = numeros.length-1; i >= 0; i--) {
            num2[j] = numeros[i];
            j+=2;
        }

        //Llenando otro arreglo con numeros de 1-10
        j=1;
        for (int i = 0; i < numeros.length; i++) {
            num2[j] = numeros[i];
            j+=2;
        }

        System.out.println();
        for (int i = 0; i < num2.length; i++) {
            System.out.print("[" + num2[i] + "]" + " ");
        }
    }
}