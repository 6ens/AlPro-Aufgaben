import java.util.Scanner;

public class Kurs {
    String name;
    int nummer;

    public Kurs(String name, int nummer) {
        this.name = name;
        this.nummer = nummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Nummer: " + this.nummer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int nummer = scanner.nextInt();
        Kurs meinKurs = new Kurs(name, nummer);
        meinKurs.print();
    }
}
