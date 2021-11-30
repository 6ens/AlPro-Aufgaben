import java.util.Scanner;

public class Kurs {
    String name;
    int nummer;
    int anzahlEingeschrieben;
    int max_anzahlEingeschrieben;

    public Kurs(String name, int nummer, int max_anzahlEingeschrieben) {
        this.name = name;
        this.nummer = nummer;
        this.max_anzahlEingeschrieben = max_anzahlEingeschrieben;
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

    public boolean einschreiben() {
        if (max_anzahlEingeschrieben > anzahlEingeschrieben) {
            anzahlEingeschrieben++;
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int nummer = scanner.nextInt();
        Kurs meinKurs = new Kurs(name, nummer,2);
        meinKurs.print();
    }
}
