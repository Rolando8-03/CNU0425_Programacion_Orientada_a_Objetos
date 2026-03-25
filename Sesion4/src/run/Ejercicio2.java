package run;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        int inicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Dime un número: "));
        int fin = Integer.parseInt(JOptionPane.showInputDialog(null, "Dime otro número: "));

        int i = inicio + 1;
        String texto = "";

        while (i < fin) {
            if (i % 2 == 0) {
                int factorial = 1;
                for (int j = 1; j <= i; j++) {
                    factorial *= j;
                }
                texto += "Número: " + i + " → Factorial: " + factorial + "\n";
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, texto);
    }
}