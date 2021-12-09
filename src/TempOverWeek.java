import java.util.*;

public class TempOverWeek {

    public TempOverWeek(int[][] temperaturesOverTheWeek) {
        this.temperaturesOverTheWeek = temperaturesOverTheWeek;
    }

    int[][] temperaturesOverTheWeek;
    String[] wochentage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
    ArrayList<String> ArrayListWochentage = new ArrayList<>(Arrays.asList(wochentage));


    public void minMaxTempTag(int tag) throws Exception {
        int maxWert = temperaturesOverTheWeek[tag][0];
        int maxWertStunde = 0;
        int minWert = temperaturesOverTheWeek[tag][0];
        int minWertStunde = 0;
        for (int stunde = 0; stunde < 24; stunde++) {
            if (temperaturesOverTheWeek[tag][stunde] > maxWert) {
                maxWert = temperaturesOverTheWeek[tag][stunde];
                maxWertStunde = stunde;
            }
            if (temperaturesOverTheWeek[tag][stunde] < minWert) {
                minWert = temperaturesOverTheWeek[tag][stunde];
                minWertStunde = stunde;
            }
        }
        System.out.println(wochentage[tag] + ":\n" + "Min-Wert: " + minWert + " Grad " + ", Stunde " + minWertStunde + "\n" + "Max-Wert: " + maxWert + " Grad " + ", Stunde " + maxWertStunde + "\n");
    }

    public void minMaxTempWoche() throws Exception {
        int maxWert = temperaturesOverTheWeek[0][0];
        int maxWertStunde = 0;
        int maxWertTag = 0;
        int minWert = temperaturesOverTheWeek[0][0];
        int minWertStunde = 0;
        int minWertTag = 0;
        for (int tag = 0; tag < 7; tag++) {
            for (int stunde = 0; stunde < 24; stunde++) {
                if (temperaturesOverTheWeek[tag][stunde] > maxWert) {
                    maxWert = temperaturesOverTheWeek[tag][stunde];
                    maxWertStunde = stunde;
                    maxWertTag = tag;
                }
                if (temperaturesOverTheWeek[tag][stunde] < minWert) {
                    minWert = temperaturesOverTheWeek[tag][stunde];
                    minWertStunde = stunde;
                    minWertTag = tag;
                }
            }
        }
        System.out.println("Woche:\n" + "Min-Wert: " + minWert + " Grad, " + "Tag " + wochentage[minWertTag] + ", Stunde " + minWertStunde + "\n" + "Max-Wert: " + maxWert + " Grad, " + "Tag " + wochentage[maxWertTag] + ", Stunde " + maxWertStunde + "\n");
    }

    public void avgTempTag(int tag) {
        double avgTemp = Arrays.stream(temperaturesOverTheWeek[tag]).sum() / temperaturesOverTheWeek[tag].length;
        System.out.println("Durchschnittstemperatur " + wochentage[tag] + ": " + avgTemp + " Grad");
    }

    public void avgTempWoche() {
        int summe = 0;
        for (int tag = 0; tag < 7; tag++) {
            summe += Arrays.stream(temperaturesOverTheWeek[tag]).sum();
        }
        double avgTemp = summe / (temperaturesOverTheWeek.length * temperaturesOverTheWeek[0].length);
        System.out.println("Durchschnittstemperatur Woche: " + avgTemp + " Grad");
    }

    public void setVal(String tag, int stunde, int wert) {
        int tagInt = ArrayListWochentage.indexOf(tag);
        this.temperaturesOverTheWeek[tagInt][stunde] = wert;
    }

    public void setVals(String tag, int[] werte) {
        int tagInt = ArrayListWochentage.indexOf(tag);
        for (int stunde = 0; stunde < this.temperaturesOverTheWeek[tagInt].length; stunde++) {
            this.temperaturesOverTheWeek[tagInt][stunde] = werte[stunde];
        }
    }

    public static void main(String[] args) throws Exception {
        int[][] temperaturesOverTheWeek = {
                {16, 16, 16, 16, 16, 16, 16, 18, 19, 23, 28, 28, 28, 29, 28, 28, 30, 31, 28, 24, 20, 19, 18, 15},
                {14, 16, 16, 16, 16, 16, 17, 18, 19, 23, 28, 28, 28, 29, 32, 28, 30, 31, 28, 24, 20, 19, 18, 17},
                {16, 16, 16, 16, 16, 16, 17, 18, 19, 23, 28, 28, 28, 29, 28, 28, 30, 31, 28, 24, 18, 12, 8, 4},
                {-2, 2, 8, 12, 14, 16, 17, 18, 19, 18, 18, 18, 18, 19, 18, 18, 18, 18, 18, 18, 18, 18, 18, 17},
                {16, 16, 16, 16, 16, 16, 17, 18, 19, 23, 28, 28, 28, 31, 28, 28, 30, 31, 28, 24, 20, 19, 18, 17},
                {16, 16, 16, 16, 16, 16, 18, 18, 19, 23, 28, 29, 28, 29, 28, 28, 30, 31, 28, 24, 20, 19, 18, 16},
                {9, 9, 9, 9, 9, 9, 9, 12, 14, 20, 25, 28, 33, 34, 33, 32, 31, 31, 28, 24, 20, 19, 18, 17}
        };

        int[] neueWerte = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};

        TempOverWeek t = new TempOverWeek(temperaturesOverTheWeek);
        t.minMaxTempWoche();
        t.avgTempTag(3);
        t.avgTempWoche();
        System.out.println(t.temperaturesOverTheWeek[0][0]);
        t.setVal("Dienstag", 0, 7);
        System.out.println(t.temperaturesOverTheWeek[1][0]);
        t.setVals("Montag", neueWerte);
        for (int stunde = 0; stunde < 24; stunde++) {
            System.out.print(t.temperaturesOverTheWeek[0][stunde] + " -> ");
        }
    }
}
