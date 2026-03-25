package main;

public class Main {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 100; i++){
            System.out.println(i);
            suma+=i;
        }
        System.out.println("La suma de los números del 1 al 100 es: " + suma);
    }
}
