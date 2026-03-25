package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        num = sc.nextInt();
        String num_not_number = num + "";
        if (num < 0){
            System.out.println("La cantidad de dígitos del número " + num
                    + " es " + (num_not_number.length() - 1));
        } else {
            System.out.println("La cantidad de dígitos del número " + num
                    + " es " + num_not_number.length());
        }
        sc.close();

    }
}
