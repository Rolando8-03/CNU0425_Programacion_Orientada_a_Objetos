package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        // Validación básica
        while (true) {
            try {
                System.out.print("Ingrese un número entero: ");
                n = sc.nextInt();

                if (n <= 0) {
                    System.out.println("El número debe ser mayor que 0");
                    continue;
                }

                break;
            } catch (Exception e) {
                System.out.println("Ingrese un número válido");
                sc.nextLine();
            }
        }

        // Triángulo con ciclos anidados
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
