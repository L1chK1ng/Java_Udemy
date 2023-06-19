import java.util.Scanner;

/*
Pedir el radio de un círculo y calcular su área.
utilizar la formula: area = PI*r² (Constante PI multiplicado por
el radio al cuadrado).
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio del circulo");
        double radio = input.nextDouble();

        double area = Math.PI * (Math.pow(radio, 2));

        System.out.println("El area del circulo es: " + area);


    }
}