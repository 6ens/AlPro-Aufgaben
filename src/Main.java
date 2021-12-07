import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
//        //1
//        Scanner scanner = new Scanner(System.in);
//        scanner.useLocale(Locale.ENGLISH);
//        double op1 = scanner.nextDouble();
//        double op2 = scanner.nextDouble();
//        String eingabe = scanner.next().replaceAll(" ", "");
//        System.out.println(op1 + " " + eingabe + " " + op2 + " = " + calculate(op1, op2, Operator.getEnum(eingabe)));

//        //2
//        Scanner scanner = new Scanner(System.in);   //erstelle einen neuen "Scanner"
//        int n = scanner.nextInt();                  //lies Text bis zum Zeilenumbruch
//        System.out.println("fib: " + fib(n));

//        //3
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> eingaben = new ArrayList<>();
//        while (true) {
//            try {
//                int e = scanner.nextInt();
//                eingaben.add(e);
//                System.out.println("Neue Eingabe: " + eingaben.get(eingaben.size() - 1));
//            } catch (Exception e) {
//                break;
//            }
//        }
//        int[] eingabe_array = new int[eingaben.size()];
//        for (int i = 0; i < eingaben.size(); i++) {
//            eingabe_array[i] = eingaben.get(i);
//        }
//        System.out.println("Eingabe abgebrochen\n");
//        System.out.println("Summe: " + sum(eingabe_array));

//        //4
//        String[] elemente = new String[]{"Das", "hier "," ist", " ein", " Test "};
//        System.out.println(concat(elemente));
    }

    //Übung 7:
    //1
    public static double calculate(double op1, double op2, Operator operator) throws Exception {
        return
                switch (operator) {
                    case PLUS -> op1 + op2;
                    case MINUS -> op1 - op2;
                    case MAL -> op1 * op2;
                    case GETEILT -> op1 / op2;
                    case MODULO -> op1 % op2;
                    default -> throw new Exception("Kein gueltiger Operator");
                };
    }


    //2
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    //3
    public static int sum(int[] werte) {
        int summe = 0;
        for (int i = 0; i < werte.length; i++) {
            summe += werte[i];
        }
        return summe;
    }

    //4
    public static String concat(String[] elemente) {
        String result = elemente[0];
        for (int i = 0; i < elemente.length - 1; i++) {
            if (elemente[i].endsWith(" ") || elemente[i + 1].startsWith(" ")) {
                result += elemente[i + 1];
            } else {
                result += " " + elemente[i + 1];
            }
        }
        return result;
    }
}