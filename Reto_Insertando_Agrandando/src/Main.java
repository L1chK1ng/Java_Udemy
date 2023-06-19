import java.util.Scanner;

/*
Se busca insertar un elemento de manera ordenada a un arreglo sin perder la info anterior
si era de 5 elementos pasar a 6 elementos
quiero insertar el 5
pos    arr    fin
0       2  ->  2
1       4  ->  4
2       6  ->  5
3       8  ->  6
4       10 ->  8
5          ->  10
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int[] numeros = {2,4,6,8,10,12,14,16,18,20};
        int[] nuevoNum = new int[numeros.length+1];

        System.out.println("Se muestra el arreglo");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]" + " ");
        }
        System.out.println("\n\n Ingrese el numero a insertar");
        int insert = input.nextInt();

        //Sabemos la posicion donde corresponderia por orden
        int pos = 0;
        while (pos < numeros.length && numeros[pos] < insert) {
            pos++;
        }

        //Copiamos el vector anterior a uno con una posicion mas grande
        int j=0;
        for (int i = 0; i < numeros.length; i++) {
            nuevoNum[j] = numeros[i];
            j++;
        }

        //Ordenamos el vector
        for (int i = nuevoNum.length-2; i >= pos ; i--) {
            nuevoNum[i+1] = nuevoNum[i];
        }

        //Ponemos el nuevo numero en la posicion disponible
        nuevoNum[pos] = insert;

        for (int i = 0; i < nuevoNum.length; i++) {
            System.out.print("[" + nuevoNum[i] + "]" + " ");
        }

        System.out.println("\n\n Nuevo numero ingresado: [" + insert + "]" + " y se coloco en la posicion: " + pos);

    }
}