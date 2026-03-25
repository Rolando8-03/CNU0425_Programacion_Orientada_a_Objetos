package run;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        while (true){
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Dime un número: "));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error al ingresar un número");
                continue;
            }
            break;
        }
        String tabla = "Tabla de multiplicación\n";

        for (int i = 1; i <= 12; i++){
            tabla += " " + num + " * " + i + " = " + (num*i) + "\n";
        }

        JOptionPane.showMessageDialog(null, tabla, "Tabla de Multiplicación",
                JOptionPane.ERROR_MESSAGE);
    }
}
