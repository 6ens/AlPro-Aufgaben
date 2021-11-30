import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Studi {
    String name;
    int alter;
    int matrikelnummmer;
    LinkedList<Kurs> kurse = new LinkedList<Kurs>();

    public Studi(String name, int alter, int matrikelnummmer) {
        this.name = name;
        this.alter = alter;
        this.matrikelnummmer = matrikelnummmer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getMatrikelnummmer() {
        return matrikelnummmer;
    }

    public void setMatrikelnummmer(int matrikelnummmer) {
        this.matrikelnummmer = matrikelnummmer;
    }

    public LinkedList<Kurs> getKurse() {
        return kurse;
    }

    public void setKurse(LinkedList<Kurs> kurse) {
        this.kurse = kurse;
    }

    public void einschreiben(Kurs kurs) {
        if (kurs.einschreiben()) {
            this.kurse.add(kurs);
        } else System.out.println("Einschreiben in Kurs " + kurs.getName() + " nicht möglich\n");
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Alter: " + this.alter);
        System.out.println("Matrikelnummer: " + this.matrikelnummmer);
        System.out.println("Kurse: ");
        for (int i = 0; i < kurse.size(); i++) {
            System.out.println(this.getKurse().get(i).getName() + " " + this.getKurse().get(i).getNummer());
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = scanner.next();
//        System.out.print("Alter: ");
//        int alter = scanner.nextInt();
//        System.out.print("Matrikelnummer: ");
//        int matrikelnummer = scanner.nextInt();
//        Studi studi1 = new Studi(name, alter, matrikelnummer);
//        studi1.print();
//        System.out.println("\nNaechste Eingabe:");
//
//        System.out.print("Name: ");
//        String name2 = scanner.next();
//        System.out.print("Alter: ");
//        int alter2 = scanner.nextInt();
//        System.out.print("Matrikelnummer: ");
//        int matrikelnummer2 = scanner.nextInt();
//        Studi studi2 = new Studi(name2, alter2, matrikelnummer2);
//        studi2.print();
//        System.out.println("\nNaechste Eingabe:");
//
//        System.out.print("Name: ");
//        String name3 = scanner.next();
//        System.out.print("Alter: ");
//        int alter3 = scanner.nextInt();
//        System.out.print("Matrikelnummer: ");
//        int matrikelnummer3 = scanner.nextInt();
//        Studi studi3 = new Studi(name3, alter3, matrikelnummer3);
//        studi3.print();

        Studi studi1 = new Studi("Ben", 18, 1234);
        Studi studi2 = new Studi("Peter", 18, 3456);
        Studi studi3 = new Studi("Felix", 19, 6789);

        Kurs alpro = new Kurs("AlPro", 1, 2);
        Kurs luds = new Kurs("LudS", 2, 2);
        Kurs ti = new Kurs("TI", 3, 2);

        studi1.einschreiben(alpro);
        studi1.einschreiben(luds);
        studi2.einschreiben(ti);
        studi2.einschreiben(alpro);
        studi3.einschreiben(luds);
        studi3.einschreiben(ti);
        studi3.einschreiben(alpro);

        studi1.print();
        studi2.print();
        studi3.print();
    }

}
