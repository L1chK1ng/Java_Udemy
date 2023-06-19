/*
Escribir un programa para una matriz de n x n e imprima en ella una silla
(o letra h minúscula) construida a base del numero 1 y utilizar el numero 0
como espacio. El tamaño de la silla se basa en una variable n que indicará el
tamaño de la figura a imprimir en una matriz de n x n.
Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int n=1;

        //comprobando que no se ingrese cero
        do {
            if (n ==0) {
                System.err.println("ERROR, No se puede iniciar con cero '0'");
            }
            System.out.println("Ingrese el tamaño de la silla");
            n = input.nextInt();
        } while (n == 0);


        int[][] sil = new int[n][n];

        //Se carga todo el lateral izquierdo
        for (int i = 0; i < sil.length; i++) {
            for (int j = 0; j < sil[i].length; j++) {
                if (j == 0) {
                    sil[i][j] = 1;
                }
            }
        }

        //Se carga toda la linea del centro
        for (int i = 0; i < sil.length; i++) {
            for (int j = 0; j < sil[i].length; j++) {
                if (i == (n/2)) {
                    sil[i][j] = 1;
                }
            }
        }

        //Se valida para recorrer desde la mitad para abajo de la matriz
        //estableciendo limites por si N es numero par o impar
        //Y se llena de 1 de la mitad para abajo solo en la ultima columna
        int k=n/2;
        int limit = (int)Math.ceil(n/2);

        if (limit >= n || n%2 == 0) {
            limit--;
        }

        for (int i = 0; i <= limit; i++) {
                sil[k][sil.length-1] = 1;
            k++;
        }

        //Se muestra la matriz con la h
        for (int i = 0; i < sil.length; i++) {
            for (int j = 0; j < sil[i].length; j++) {
                System.out.print(sil[i][j] + " ");
            }
            System.out.println();
        }

    }
}