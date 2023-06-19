import java.util.Scanner;

/*
Insrtar un numero en un arreglo en la posicion indidcada, hay que dejar un valor en 0
que tomara su lugar el numero insertado, dependiendo donde se elija instertarlo,
si se elige insertar el numero 30 en la posicion 3 quedaria:
pos  arr
0    1  -> 1
1    2  -> 2
2    3  -> 3
3    4  -> 30
4    0  -> 4
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int[] numeros = new int[10];

        System.out.println("Ingrese 9 numeros, se reserva uno que vale 0");
        for (int i = 0; i < numeros.length-1; i++) {
            System.out.print("Numero " + (i+1) + ": ");
            numeros[i] = input.nextInt();
        }

        System.out.println("Ingrese el numero a insertar:");
        int insert = input.nextInt();

        System.out.println("Ingrese ahora la posicion donde se insertara (0 - 9)");
        int pos = input.nextInt();

        //corremos para abajo desde pos
        int aux=0;
        for (int i = numeros.length-2; i >= pos; i--) {
            numeros[i+1] = numeros[i];
        }

        numeros[pos] = insert;


        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
    }
}