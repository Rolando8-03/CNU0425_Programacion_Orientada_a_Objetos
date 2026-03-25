package main;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String Nombre_Cuenta;
        String Password;
        double Saldo = 0;
        int numero_cuenta;
        int pin = 1234;
        int num = 0;

        Scanner sc = new Scanner(System.in);

        // -------- CREAR CUENTA --------
        while (true) {

            System.out.println("--- CREAR CUENTA ---");
            System.out.print("Ingrese un nombre: ");
            Nombre_Cuenta = sc.nextLine();

            System.out.print("Ingrese una contraseña: ");
            Password = sc.nextLine();

            try {
                System.out.print("Ingrese su saldo actual: ");
                Saldo = sc.nextDouble();

                if (Saldo < 0) {
                    System.out.println("El saldo no puede ser negativo");
                    sc.nextLine();
                    continue;
                }

                sc.nextLine(); // limpiar buffer
            } catch (Exception e) {
                System.out.println("Ingrese un número válido");
                sc.nextLine();
                continue;
            }

            Random rand = new Random();
            numero_cuenta = rand.nextInt(90000000) + 10000000;

            System.out.println("Su número de cuenta asignado es: " + numero_cuenta);
            break;
        }

        // -------- LOGIN CON FOR --------
        for (int intentos = 1; intentos <= 3; intentos++) {

            System.out.println("--- Inicio de sesión ---");
            System.out.print("Ingrese su nombre: ");
            String Nombre_Ingresado = sc.nextLine();

            System.out.print("Ingrese su contraseña: ");
            String Password_Ingresada = sc.nextLine();

            if (Nombre_Ingresado.equals(Nombre_Cuenta) && Password_Ingresada.equals(Password)) {
                System.out.println("Inicio de sesión exitoso");
                break;
            } else {
                System.out.println("Datos incorrectos");
            }

            if (intentos == 3) {
                System.out.println("Demasiados intentos fallidos");
                return;
            }
        }

        // -------- MENÚ CON DO WHILE --------
        do {
            System.out.println("\n----- BIENVENIDO -----");
            System.out.println("1. Retiro sin tarjeta");
            System.out.println("2. Transacción");
            System.out.println("3. Cambiar PIN");
            System.out.println("4. Retiro");
            System.out.println("5. Mostrar saldo");
            System.out.println("6. Salir");

            try {
                num = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese un número válido");
                sc.nextLine();
                continue;
            }

            if (num < 1 || num > 6) {
                System.out.println("Ingrese un número válido");
                continue;
            }

            switch (num) {

                case 1:
                    System.out.print("Ingrese número de cuenta (8 dígitos): ");
                    String cuenta1 = sc.next();

                    if (cuenta1.length() == 8) {
                        System.out.print("Ingrese monto: ");
                        double monto = sc.nextDouble();

                        if (monto > 0 && monto <= Saldo) {
                            Saldo -= monto;
                            System.out.println("Retiro exitoso");
                        } else {
                            System.out.println("Monto inválido o saldo insuficiente");
                        }
                    } else {
                        System.out.println("Número de cuenta inválido");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese cuenta destino (8 dígitos): ");
                    String cuenta2 = sc.next();

                    if (cuenta2.length() == 8) {
                        System.out.print("Ingrese monto: ");
                        double monto = sc.nextDouble();

                        if (monto > 0 && monto <= Saldo) {
                            Saldo -= monto;
                            System.out.println("Transferencia realizada");
                        } else {
                            System.out.println("Monto inválido o saldo insuficiente");
                        }
                    } else {
                        System.out.println("Número de cuenta inválido");
                    }
                    break;

                case 3:
                    boolean cambiado = false;

                    for (int i = 1; i <= 3; i++) {
                        System.out.print("Ingrese PIN actual: ");
                        int intento = sc.nextInt();

                        if (intento == pin) {
                            System.out.print("Ingrese nuevo PIN: ");
                            pin = sc.nextInt();
                            System.out.println("PIN cambiado exitosamente");
                            cambiado = true;
                            break;
                        } else {
                            System.out.println("PIN incorrecto");
                        }
                    }

                    if (!cambiado) {
                        System.out.println("No se pudo cambiar el PIN");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese monto: ");
                    double retiro = sc.nextDouble();

                    if (retiro > 0 && retiro <= Saldo) {
                        Saldo -= retiro;
                        System.out.println("Retiro exitoso");
                    } else {
                        System.out.println("Monto inválido o saldo insuficiente");
                    }
                    break;

                case 5:
                    System.out.println("Su saldo es: " + Saldo);
                    break;

                case 6:
                    System.out.println("Gracias por usar el sistema");
                    break;
            }

        } while (num != 6);

        // -------- RESUMEN FINAL --------
        System.out.println("\n----- RESUMEN FINAL -----");
        System.out.println("Titular: " + Nombre_Cuenta);
        System.out.println("Número de cuenta: " + numero_cuenta);
        System.out.println("Saldo final: " + Saldo);

        sc.close();
    }
}