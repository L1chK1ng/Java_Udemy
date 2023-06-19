/*
Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). 
Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también 
imprimir la cantidad de veces que aparece en el arreglo.

Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

Como resultado debería imprimir lo siguiente:

La mayor ocurrencias es: 3 
El elemento que mas se repite es: 5
En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
 */
public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 3, 4, 5, 5, 5, 8, 7};

        //Se compara cada numero por posicion del vector, y se cuenta el que tenga mas veces repetido
        //luego se guarda en otra variable y se reinicia el proceso
        int ocurrencia=0, aux=0, masRep=0;
        for (int i = 0; i < numeros.length; i++) {
            ocurrencia=0;

            for (int k = 0; k < numeros.length; k++) {
                if (numeros[k] == i) {
                    ocurrencia++;
                }
            }
            if (aux < ocurrencia) {
                aux = ocurrencia;
                masRep = i;
            }
        }

        System.out.println("Numero mas repetido = " + masRep);
        System.out.println("Se repite = " + aux + " veces");
        
    }
}