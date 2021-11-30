import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        //1
//        int op1 = 4;
//        int op2 = 5;
//        String operator = "/";
//        System.out.println(op1 + " " + operator + " " + op2 + " = " + calculate(op1, op2, operator));
//
//        Scanner scanner = new Scanner(System.in);   //erstelle einen neuen "Scanner"
//        int n = scanner.nextInt();                  //lies Text bis zum Zeilenumbruch
//        //2
//        System.out.println("fib: " + fib(n));
//
//        //3
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> eingaben = new ArrayList<>();
        while (true) {
            try {
                int e = scanner.nextInt();
                eingaben.add(e);
                System.out.println("Neue Eingabe: " + eingaben.get(eingaben.size() - 1));
            } catch (Exception e) {
                break;
            }
        }
        int[] eingabe_array = new int[eingaben.size()];
        for (int i = 0; i < eingaben.size(); i++) {
            eingabe_array[i] = eingaben.get(i);
        }
        System.out.println("Eingabe abgebrochen\n");
        System.out.println("Summe: " + sum(eingabe_array, eingaben.size()));
    }

    //Übung 7:
    //1
    public static double calculate(double op1, double op2, String operator) {
        if (operator == "+") {
            return (op1 + op2);
        }
        if (operator == "-") {
            return (op1 - op2);
        }
        if (operator == "*") {
            return (op1 * op2);
        }
        if (operator == "/") {
            return (op1 / op2);
        }
        if (operator == "%") {
            return (op1 % op2);
        } else System.out.println("Kein gueltiger Operator");
        return 0;
    }

    //2
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int sum(int[] werte, int length) {
        int summe = 0;
        for (int i = 0; i < length; i++) {
            summe += werte[i];
        }
        return summe;
    }

    public static String concat(String[] elemente){
        int i = 0;
        int j = 0;
        return null;
    }
}