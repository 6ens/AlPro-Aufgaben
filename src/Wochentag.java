public enum Wochentag {
    MONTAG,DIENSTAG,MITTWOCH,DONNERSTAG,FREITAG,SAMSTAG,SONNTAG;

    public static String getString (int wochentag) throws Exception{
        return
                switch (wochentag){
                    case 0 -> "MONTAG";
                    case 1 -> "DIENSTAG";
                    case 2 -> "MITTWOCH";
                    case 3 -> "DONNERSTAG";
                    case 4 -> "FREITAG";
                    case 5 -> "SAMSTAG";
                    case 6 -> "SONNTAG";
                    default -> throw new Exception("Kein gueltiger Wochentag");
                };
    }
}
