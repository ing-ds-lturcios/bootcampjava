package Clase005;

import java.util.Scanner;

public class Clase005_AdivinarNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroAdivinar = (int) (Math.random() * 100 + 1);
        int numeroIngresado = 0;
        System.out.println("Adivina el número que pensé, es entre 1 y 100.");
        while (numeroIngresado != numeroAdivinar) {
            System.out.print("Ingrese un número: ");
            numeroIngresado = input.nextInt();
            if (numeroIngresado < numeroAdivinar) {
                System.out.println("El número ingresado es menor al número a adivinar.");
            } else if (numeroIngresado > numeroAdivinar) {
                System.out.println("El número ingresado es mayor al número a adivinar.");
            } else {
                System.out.println("¡Felicidades, Adivinaste el número!");
            }
        }
    }
}
