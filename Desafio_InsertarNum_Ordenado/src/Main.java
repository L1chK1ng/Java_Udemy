import java.util.Scanner;

/*
insertar numero en un arreglo, manteniendo el orden al insertar (dejando un numero nulo para esto)
ejemplo se inserta numero 7
pos    arr    inser
0       1  ->  1
1       3  ->  3
2       8  ->  7
3       10 ->  8
4       0  ->  10
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int[] numeros = new int[10];

        System.out.println("Ingrese 9 numeros");
        for (int i = 0; i < numeros.length - 1; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        System.out.println("Ingrese el numero a instertar");
        int insert = input.nextInt();

       //Identificamos en que posicion corresponderia colocarlo
       int pos=0;
       while (pos < 9 && insert > numeros[pos]) {
           pos++;
       }

        //Luego corremos los numeros para abajo desde la posicion
        for (int i = 8; i >= pos; i--) {
            numeros[i+1] = numeros[i];
        }

        numeros[pos] = insert;

        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}