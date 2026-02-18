package org.example;

import java.util.Scanner;

public class calculadora {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Número 1: ");
            double a = sc.nextDouble();

            System.out.print("Operación (+, -, *, /): ");
            char op = sc.next().charAt(0);

            System.out.print("Número 2: ");
            double b = sc.nextDouble();

            double r = 0;

            switch (op) {
                case '+': r = a + b; break;
                case '-': r = a - b; break;
                case '*': r = a * b; break;
                case '/': r = b != 0 ? a / b : Double.NaN; break;
                default:
                    System.out.println("Operación no válida");
                    return;
            }

            System.out.println("Resultado:"+ r);
        }


    }

