import java.util.Scanner;

public class Leer {
    public static void main(String[] args) {
        System.out.println("Calculadora de sumas");
        Scanner consola = new Scanner(System.in); // Usar un solo Scanner

        System.out.println("¿Cuál es tu primer número?");
        int numero1 = Integer.parseInt(consola.nextLine()); // Convertir a entero

        System.out.println("¿Cuál es tu segundo número?");
        int numero2 = Integer.parseInt(consola.nextLine()); // Convertir a entero

        int resultado = numero1 + numero2; // Sumar como números
        System.out.println("El resultado es: " + resultado);
    }
}
