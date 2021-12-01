public enum Operator {
    PLUS, MINUS, MAL, GETEILT, MODULO;

    public static Operator getEnum(String eingabe) throws Exception {
        return
                switch (eingabe) {
                    case "+" -> PLUS;
                    case "-" -> MINUS;
                    case "*" -> MAL;
                    case "/" -> GETEILT;
                    case "%" -> MODULO;
                    default -> throw new Exception("Kein gueltiger Operator");
                };
    }
}
