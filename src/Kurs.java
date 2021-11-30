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
}
