/*
Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.

El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.

Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece
 en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6,
 incluso si no están presente en el arreglo.

Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:

1: ***
2:
3: *
4: *****
5: *
6: **
Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.
 */
public class Main {
    public static void main(String[] args) {
        int[] numeros = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};

        //contamos los numeros
        int num1=0, num2=0, num3=0, num4=0, num5=0, num6=0;
        for (int i = 0; i < numeros.length; i++) {
            switch (numeros[i]) {
                case 1:
                   num1++; break;
                case 2:
                    num2++; break;
                case 3:
                    num3++; break;
                case 4:
                    num4++; break;
                case 5:
                    num5++; break;
                case 6:
                    num6++; break;
            }
        }

        //mostramos asteristicos por cantidad de numeros encontrados en el arreglo
        System.out.print("1: ");
        for (int i = 0; i < num1; i++) {
            System.out.print("*" + " ");
        }

        System.out.print("\n2: ");
        for (int i = 0; i < num2; i++) {
            System.out.print("*" + " ");
        }

        System.out.print("\n3: ");
        for (int i = 0; i < num3; i++) {
            System.out.print("*" + " ");
        }

        System.out.print("\n4: ");
        for (int i = 0; i < num4; i++) {
            System.out.print("*" + " ");
        }

        System.out.print("\n5: ");
        for (int i = 0; i < num5; i++) {
            System.out.print("*" + " ");
        }

        System.out.print("\n6: ");
        for (int i = 0; i < num6; i++) {
            System.out.print("*" + " ");
        }
    }
}