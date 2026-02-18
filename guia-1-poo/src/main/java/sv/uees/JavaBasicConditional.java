package sv.uees;

import java.util.Scanner;

public class JavaBasicConditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        // Operador y expresion
        boolean esPar = (numero % 2 == 0);

        // Control de flujo - condicional
        if (esPar) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");

        }

        sc.close();
    }
}
