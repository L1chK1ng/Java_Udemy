/*
Escriba un programa que imprima el número más alto de un arreglo de 7 elementos 
(de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor 
considerar uno solo.
 */
public class Main {
    public static void main(String[] args) {
        int[] numeros = {14,33,15,36,78,21,120};
        
        int mayNum=0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayNum) {
                mayNum = numeros[i];
            }
        }
        System.out.println("El numero mayor en el arreglo = " + mayNum);
    }
}