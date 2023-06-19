import java.util.Scanner;

/*
Borrar un numero de un arreglo.
borro el numero 3
pos    arr      fin
0       1   ->   1
1       2   ->   2
2       3   ->   4
3       4   ->   5
4       5   ->
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Se muestra el arreglo");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]" + " ");
        }

        System.out.print("\n\n Ingrese el numero a eliminar del vector: ");
        int numElim = input.nextInt();
        
        int pos =0;
        while (pos < numeros.length && numeros[pos] < numElim) {
            pos++;
        }

        //Dejo el numero a eliminar en la primera poscion del arreglo
        int aux=0;
        for (int i = pos; i >=1 ; i--) {
            aux = numeros[i-1];
            numeros[i-1] = numeros[i];
            numeros[i] = aux;

        }

        //Luego creo un clon del arreglo menos el numero eliminado, omitiendo la primera posicion
        int[] numerosClon = new int[9];
        int j=0;
        for (int i = 1; i < numeros.length; i++) {
            numerosClon[j] = numeros[i];
            j++;
        }


        System.out.println("\nMostrando arreglo nuevo");
        for (int i = 0; i < numerosClon.length; i++) {
            System.out.print("[" + numerosClon[i] + "]" + " ");
        }
        System.out.println("\n\n numero eliminado: " + "[" + numElim +"]" + " de la posicion: " + pos);
    }
}