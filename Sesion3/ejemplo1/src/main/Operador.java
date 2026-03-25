package main;

public class Operador {
    public static void main(String[] args) {
        int num1 = 2, num2 = 5, potencia = 1;
        String Num1, Num2;
        Num1 = "" + num1;
        Num2 = "" + num2;
        for (int i = 0; i<num2; i++){
            potencia*=num1;
        }
        System.out.println(num1 + " + " + num2 + " = " + (Num1+Num2));
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + ((float)num1/(float)num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
        System.out.println(num1 + " ^ " + num2 + " = " + (potencia));
        System.out.println(num1 + " > " + num2 + " = " + (num1>num2));
        System.out.println(num1 + " < " + num2 + " = " + (num1<num2));
        System.out.println(num1 + " >= " + num2 + " = " + (num1>=num2));
        System.out.println(num1 + " <= " + num2 + " = " + (num1<=num2));
        System.out.println(num1 + " == " + num2 + " = " + (num1==num2));
        System.out.println(num1 + " != " + num2 + " = " + (num1!=num2));
    }
}
