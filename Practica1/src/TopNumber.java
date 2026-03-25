import javax.swing.*;

public class TopNumber {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el primer número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el primer número: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el primer número: "));
        if (num1>num2){
            JOptionPane.showMessageDialog(null, "El número mayor es el primer número");
        }
        else if (num2>num3){
            JOptionPane.showMessageDialog(null, "El número mayor es el segundo número");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número mayor es el tercer número");
        }

    }
}
