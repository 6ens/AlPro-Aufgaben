public class aoc2 {
    public static void main(String[] args) {
        String data = "forward 4\n" +
                "down 8\n" +
                "down 3\n" +
                "down 1\n" +
                "forward 8\n" +
                "up 6\n" +
                "down 4\n" +
                "forward 2\n" +
                "down 4\n" +
                "down 6\n" +
                "down 7\n" +
                "forward 1\n" +
                "down 4\n" +
                "down 6\n" +
                "forward 7\n" +
                "down 2\n" +
                "up 8\n" +
                "up 3\n" +
                "forward 1\n" +
                "forward 2\n" +
                "down 3\n" +
                "down 8\n" +
                "forward 6\n" +
                "forward 5\n" +
                "down 4\n" +
                "down 1\n" +
                "up 5\n" +
                "down 5\n" +
                "down 2\n" +
                "up 6\n" +
                "forward 4\n" +
                "forward 3\n" +
                "down 8\n" +
                "down 9\n" +
                "up 2\n" +
                "forward 1\n" +
                "forward 2\n" +
                "down 1\n" +
                "forward 3\n" +
                "down 7\n" +
                "up 6\n" +
                "down 1\n" +
                "down 7\n" +
                "down 5\n" +
                "forward 8\n" +
                "down 5\n" +
                "down 1\n" +
                "down 7\n" +
                "up 9\n" +
                "forward 6\n" +
                "up 8\n" +
                "down 3\n" +
                "down 9\n" +
                "down 3\n" +
                "forward 2\n" +
                "forward 1\n" +
                "forward 4\n" +
                "down 7\n" +
                "up 8\n" +
                "down 1\n" +
                "up 1\n" +
                "forward 4\n" +
                "down 7\n" +
                "forward 5\n" +
                "forward 2\n" +
                "forward 1\n" +
                "up 8\n" +
                "down 2\n" +
                "up 6\n" +
                "down 7\n" +
                "down 4\n" +
                "up 6\n" +
                "forward 2\n" +
                "forward 8\n" +
                "down 8\n" +
                "down 2\n" +
                "forward 2\n" +
                "forward 9\n" +
                "down 1\n" +
                "forward 5\n" +
                "down 4\n" +
                "forward 4\n" +
                "down 2\n" +
                "down 1\n" +
                "forward 7\n" +
                "down 1\n" +
                "down 5\n" +
                "down 5\n" +
                "up 5\n" +
                "forward 7\n" +
                "forward 6\n" +
                "forward 3\n" +
                "forward 9\n" +
                "forward 3\n" +
                "forward 5\n" +
                "down 8\n" +
                "down 9\n" +
                "forward 7\n" +
                "up 5\n" +
                "up 7\n" +
                "down 5\n" +
                "up 9\n" +
                "forward 9\n" +
                "up 8\n" +
                "up 2\n" +
                "forward 5\n" +
                "down 2\n" +
                "forward 2\n" +
                "down 4\n" +
                "up 4\n" +
                "down 2\n" +
                "up 3\n" +
                "up 8\n" +
                "down 3\n" +
                "down 4\n" +
                "down 7\n" +
                "forward 3\n" +
                "forward 9\n" +
                "down 1\n" +
                "down 2\n" +
                "down 5\n" +
                "down 1\n" +
                "forward 2\n" +
                "forward 2\n" +
                "up 8\n" +
                "down 4\n" +
                "forward 7\n" +
                "up 6\n" +
                "down 9\n" +
                "down 6\n" +
                "up 1\n" +
                "down 2\n" +
                "forward 6\n" +
                "down 4\n" +
                "up 1\n" +
                "forward 3\n" +
                "down 4\n" +
                "down 1\n" +
                "up 8\n" +
                "forward 3\n" +
                "down 5\n" +
                "up 2\n" +
                "down 8\n" +
                "down 4\n" +
                "up 2\n" +
                "down 2\n" +
                "forward 6\n" +
                "up 4\n" +
                "up 2\n" +
                "down 2\n" +
                "forward 7\n" +
                "down 5\n" +
                "forward 2\n" +
                "forward 8\n" +
                "up 3\n" +
                "forward 5\n" +
                "up 6\n" +
                "down 4\n" +
                "down 1\n" +
                "down 8\n" +
                "down 2\n" +
                "forward 8\n" +
                "up 2\n" +
                "down 5\n" +
                "up 8\n" +
                "down 1\n" +
                "down 1\n" +
                "down 5\n" +
                "up 4\n" +
                "down 1\n" +
                "down 3\n" +
                "down 8\n" +
                "forward 6\n" +
                "down 9\n" +
                "forward 6\n" +
                "up 2\n" +
                "forward 1\n" +
                "forward 9\n" +
                "down 9\n" +
                "down 3\n" +
                "down 9\n" +
                "down 6\n" +
                "down 4\n" +
                "down 8\n" +
                "forward 1\n" +
                "down 1\n" +
                "forward 2\n" +
                "up 2\n" +
                "forward 8\n" +
                "down 1\n" +
                "up 6\n" +
                "down 4\n" +
                "down 3\n" +
                "forward 8\n" +
                "up 7\n" +
                "down 6\n" +
                "down 1\n" +
                "down 2\n" +
                "forward 1\n" +
                "up 5\n" +
                "up 7\n" +
                "down 6\n" +
                "down 4\n" +
                "down 5\n" +
                "forward 9\n" +
                "down 7\n" +
                "down 9\n" +
                "down 5\n" +
                "forward 9\n" +
                "forward 7\n" +
                "forward 9\n" +
                "forward 8\n" +
                "up 4\n" +
                "forward 5\n" +
                "down 7\n" +
                "forward 8\n" +
                "up 1\n" +
                "forward 3\n" +
                "forward 2\n" +
                "forward 2\n" +
                "down 7\n" +
                "forward 9\n" +
                "down 7\n" +
                "down 9\n" +
                "forward 6\n" +
                "forward 8\n" +
                "up 5\n" +
                "up 8\n" +
                "up 7\n" +
                "up 6\n" +
                "forward 7\n" +
                "down 6\n" +
                "down 5\n" +
                "down 3\n" +
                "forward 7\n" +
                "down 7\n" +
                "forward 6\n" +
                "down 4\n" +
                "down 2\n" +
                "down 9\n" +
                "down 2\n" +
                "up 8\n" +
                "down 8\n" +
                "down 3\n" +
                "down 4\n" +
                "forward 3\n" +
                "up 6\n" +
                "down 9\n" +
                "forward 1\n" +
                "down 3\n" +
                "forward 9\n" +
                "down 6\n" +
                "forward 9\n" +
                "forward 8\n" +
                "forward 5\n" +
                "up 2\n" +
                "forward 5\n" +
                "up 7\n" +
                "down 6\n" +
                "forward 6\n" +
                "down 8\n" +
                "forward 2\n" +
                "down 7\n" +
                "down 8\n" +
                "up 1\n" +
                "forward 3\n" +
                "forward 5\n" +
                "down 3\n" +
                "forward 8\n" +
                "up 7\n" +
                "forward 9\n" +
                "forward 6\n" +
                "forward 1\n" +
                "forward 7\n" +
                "down 5\n" +
                "forward 3\n" +
                "down 5\n" +
                "down 6\n" +
                "down 7\n" +
                "down 3\n" +
                "down 8\n" +
                "up 5\n" +
                "forward 2\n" +
                "forward 5\n" +
                "up 7\n" +
                "up 4\n" +
                "forward 1\n" +
                "forward 1\n" +
                "down 1\n" +
                "down 7\n" +
                "forward 4\n" +
                "up 8\n" +
                "forward 5\n" +
                "down 9\n" +
                "up 7\n" +
                "forward 8\n" +
                "down 4\n" +
                "forward 4\n" +
                "forward 6\n" +
                "down 8\n" +
                "forward 7\n" +
                "down 1\n" +
                "forward 9\n" +
                "down 9\n" +
                "up 1\n" +
                "down 6\n" +
                "forward 6\n" +
                "down 7\n" +
                "down 4\n" +
                "forward 6\n" +
                "forward 3\n" +
                "down 5\n" +
                "up 5\n" +
                "up 7\n" +
                "up 5\n" +
                "down 6\n" +
                "forward 7\n" +
                "up 3\n" +
                "down 2\n" +
                "forward 6\n" +
                "down 8\n" +
                "down 7\n" +
                "up 9\n" +
                "forward 3\n" +
                "forward 1\n" +
                "down 8\n" +
                "forward 6\n" +
                "forward 4\n" +
                "up 9\n" +
                "forward 3\n" +
                "down 1\n" +
                "forward 4\n" +
                "forward 9\n" +
                "forward 2\n" +
                "forward 8\n" +
                "forward 1\n" +
                "forward 2\n" +
                "forward 7\n" +
                "down 6\n" +
                "forward 6\n" +
                "up 2\n" +
                "forward 5\n" +
                "up 8\n" +
                "down 9\n" +
                "up 8\n" +
                "down 5\n" +
                "down 1\n" +
                "down 6\n" +
                "up 4\n" +
                "down 4\n" +
                "down 5\n" +
                "up 6\n" +
                "down 8\n" +
                "down 8\n" +
                "forward 9\n" +
                "forward 8\n" +
                "forward 2\n" +
                "down 2\n" +
                "up 3\n" +
                "forward 2\n" +
                "down 8\n" +
                "down 8\n" +
                "forward 3\n" +
                "forward 5\n" +
                "down 9\n" +
                "down 2\n" +
                "forward 6\n" +
                "forward 7\n" +
                "down 7\n" +
                "forward 4\n" +
                "forward 2\n" +
                "down 1\n" +
                "down 6\n" +
                "up 5\n" +
                "down 2\n" +
                "forward 3\n" +
                "forward 9\n" +
                "down 9\n" +
                "down 3\n" +
                "forward 3\n" +
                "forward 6\n" +
                "down 2\n" +
                "forward 5\n" +
                "forward 7\n" +
                "down 6\n" +
                "forward 4\n" +
                "down 6\n" +
                "forward 6\n" +
                "forward 3\n" +
                "forward 3\n" +
                "forward 8\n" +
                "down 4\n" +
                "up 4\n" +
                "down 6\n" +
                "down 4\n" +
                "down 9\n" +
                "forward 7\n" +
                "forward 4\n" +
                "forward 7\n" +
                "down 3\n" +
                "forward 1\n" +
                "down 7\n" +
                "down 3\n" +
                "forward 1\n" +
                "down 7\n" +
                "down 5\n" +
                "forward 6\n" +
                "up 7\n" +
                "down 7\n" +
                "forward 5\n" +
                "forward 5\n" +
                "up 9\n" +
                "down 7\n" +
                "forward 1\n" +
                "forward 2\n" +
                "down 4\n" +
                "down 8\n" +
                "down 7\n" +
                "forward 4\n" +
                "forward 4\n" +
                "forward 3\n" +
                "down 8\n" +
                "down 7\n" +
                "down 8\n" +
                "forward 2\n" +
                "down 2\n" +
                "forward 2\n" +
                "forward 4\n" +
                "up 6\n" +
                "down 4\n" +
                "up 3\n" +
                "forward 7\n" +
                "down 9\n" +
                "down 3\n" +
                "forward 3\n" +
                "down 2\n" +
                "down 2\n" +
                "up 5\n" +
                "down 4\n" +
                "forward 3\n" +
                "forward 3\n" +
                "up 7\n" +
                "forward 8\n" +
                "forward 6\n" +
                "down 3\n" +
                "forward 2\n" +
                "down 6\n" +
                "up 1\n" +
                "down 7\n" +
                "down 7\n" +
                "forward 8\n" +
                "up 1\n" +
                "up 8\n" +
                "up 4\n" +
                "up 1\n" +
                "forward 4\n" +
                "forward 9\n" +
                "down 9\n" +
                "down 5\n" +
                "down 3\n" +
                "forward 8\n" +
                "down 3\n" +
                "forward 4\n" +
                "down 6\n" +
                "down 9\n" +
                "down 3\n" +
                "forward 6\n" +
                "up 1\n" +
                "up 4\n" +
                "forward 9\n" +
                "down 3\n" +
                "up 1\n" +
                "forward 4\n" +
                "up 1\n" +
                "forward 8\n" +
                "down 9\n" +
                "up 1\n" +
                "forward 3\n" +
                "down 7\n" +
                "down 7\n" +
                "down 3\n" +
                "forward 7\n" +
                "forward 5\n" +
                "down 8\n" +
                "up 8\n" +
                "down 6\n" +
                "down 4\n" +
                "forward 9\n" +
                "down 9\n" +
                "up 5\n" +
                "forward 6\n" +
                "down 8\n" +
                "up 8\n" +
                "down 2\n" +
                "forward 1\n" +
                "down 8\n" +
                "down 2\n" +
                "forward 7\n" +
                "forward 2\n" +
                "down 2\n" +
                "forward 5\n" +
                "up 2\n" +
                "down 6\n" +
                "down 1\n" +
                "down 6\n" +
                "down 3\n" +
                "up 4\n" +
                "forward 4\n" +
                "forward 8\n" +
                "down 3\n" +
                "forward 9\n" +
                "forward 6\n" +
                "down 2\n" +
                "up 2\n" +
                "down 2\n" +
                "up 4\n" +
                "down 8\n" +
                "forward 5\n" +
                "down 4\n" +
                "forward 3\n" +
                "down 4\n" +
                "forward 6\n" +
                "down 8\n" +
                "down 2\n" +
                "up 7\n" +
                "down 3\n" +
                "down 6\n" +
                "up 1\n" +
                "forward 8\n" +
                "up 5\n" +
                "down 1\n" +
                "forward 3\n" +
                "down 2\n" +
                "down 5\n" +
                "up 5\n" +
                "up 2\n" +
                "down 2\n" +
                "down 2\n" +
                "down 4\n" +
                "forward 3\n" +
                "up 7\n" +
                "forward 8\n" +
                "forward 4\n" +
                "down 3\n" +
                "forward 8\n" +
                "down 4\n" +
                "down 9\n" +
                "down 7\n" +
                "up 3\n" +
                "up 4\n" +
                "down 4\n" +
                "forward 3\n" +
                "down 3\n" +
                "up 5\n" +
                "down 1\n" +
                "forward 4\n" +
                "forward 9\n" +
                "forward 3\n" +
                "forward 3\n" +
                "up 6\n" +
                "down 3\n" +
                "forward 3\n" +
                "up 7\n" +
                "down 3\n" +
                "up 7\n" +
                "up 2\n" +
                "up 2\n" +
                "down 9\n" +
                "forward 4\n" +
                "forward 7\n" +
                "forward 7\n" +
                "down 7\n" +
                "forward 2\n" +
                "forward 1\n" +
                "down 9\n" +
                "forward 2\n" +
                "down 2\n" +
                "down 4\n" +
                "up 3\n" +
                "forward 8\n" +
                "up 3\n" +
                "down 7\n" +
                "forward 9\n" +
                "down 7\n" +
                "forward 2\n" +
                "down 1\n" +
                "up 9\n" +
                "forward 7\n" +
                "forward 9\n" +
                "up 4\n" +
                "forward 3\n" +
                "forward 1\n" +
                "down 5\n" +
                "down 6\n" +
                "forward 9\n" +
                "down 9\n" +
                "forward 2\n" +
                "forward 8\n" +
                "forward 4\n" +
                "forward 9\n" +
                "down 5\n" +
                "down 9\n" +
                "down 3\n" +
                "down 7\n" +
                "up 2\n" +
                "up 7\n" +
                "forward 6\n" +
                "down 3\n" +
                "down 2\n" +
                "up 1\n" +
                "forward 4\n" +
                "down 1\n" +
                "up 4\n" +
                "up 8\n" +
                "down 9\n" +
                "down 5\n" +
                "down 7\n" +
                "forward 4\n" +
                "down 1\n" +
                "forward 8\n" +
                "down 5\n" +
                "forward 7\n" +
                "down 3\n" +
                "up 2\n" +
                "forward 4\n" +
                "down 1\n" +
                "forward 4\n" +
                "up 5\n" +
                "forward 9\n" +
                "down 1\n" +
                "forward 7\n" +
                "up 3\n" +
                "up 9\n" +
                "forward 4\n" +
                "up 5\n" +
                "down 6\n" +
                "forward 2\n" +
                "down 1\n" +
                "forward 1\n" +
                "down 9\n" +
                "forward 5\n" +
                "down 2\n" +
                "up 3\n" +
                "down 5\n" +
                "up 4\n" +
                "down 5\n" +
                "down 8\n" +
                "down 8\n" +
                "down 3\n" +
                "forward 9\n" +
                "forward 2\n" +
                "down 3\n" +
                "down 3\n" +
                "down 6\n" +
                "down 8\n" +
                "forward 9\n" +
                "down 4\n" +
                "down 1\n" +
                "forward 4\n" +
                "down 9\n" +
                "forward 1\n" +
                "down 9\n" +
                "up 6\n" +
                "up 7\n" +
                "up 8\n" +
                "forward 5\n" +
                "down 3\n" +
                "up 5\n" +
                "up 1\n" +
                "down 8\n" +
                "forward 1\n" +
                "forward 7\n" +
                "up 9\n" +
                "down 7\n" +
                "forward 4\n" +
                "down 5\n" +
                "forward 2\n" +
                "down 6\n" +
                "up 8\n" +
                "down 1\n" +
                "down 6\n" +
                "down 9\n" +
                "down 8\n" +
                "forward 8\n" +
                "down 4\n" +
                "up 2\n" +
                "down 2\n" +
                "forward 9\n" +
                "up 6\n" +
                "down 3\n" +
                "forward 5\n" +
                "forward 9\n" +
                "up 2\n" +
                "up 5\n" +
                "down 5\n" +
                "forward 2\n" +
                "forward 3\n" +
                "forward 2\n" +
                "up 2\n" +
                "down 2\n" +
                "forward 9\n" +
                "up 4\n" +
                "down 4\n" +
                "up 1\n" +
                "down 1\n" +
                "down 6\n" +
                "down 6\n" +
                "forward 2\n" +
                "up 6\n" +
                "up 9\n" +
                "forward 7\n" +
                "forward 4\n" +
                "down 6\n" +
                "down 5\n" +
                "down 5\n" +
                "down 9\n" +
                "forward 7\n" +
                "down 1\n" +
                "up 5\n" +
                "forward 4\n" +
                "up 8\n" +
                "up 8\n" +
                "down 4\n" +
                "down 7\n" +
                "forward 1\n" +
                "forward 8\n" +
                "down 3\n" +
                "up 3\n" +
                "up 3\n" +
                "up 4\n" +
                "down 1\n" +
                "down 8\n" +
                "up 6\n" +
                "up 8\n" +
                "forward 2\n" +
                "down 2\n" +
                "down 3\n" +
                "forward 4\n" +
                "forward 3\n" +
                "forward 6\n" +
                "down 1\n" +
                "up 6\n" +
                "forward 2\n" +
                "forward 6\n" +
                "forward 2\n" +
                "forward 5\n" +
                "down 1\n" +
                "up 4\n" +
                "forward 7\n" +
                "down 6\n" +
                "forward 8\n" +
                "up 9\n" +
                "down 5\n" +
                "up 3\n" +
                "forward 8\n" +
                "forward 1\n" +
                "forward 9\n" +
                "up 9\n" +
                "forward 4\n" +
                "forward 5\n" +
                "down 1\n" +
                "up 9\n" +
                "down 5\n" +
                "down 7\n" +
                "forward 8\n" +
                "down 1\n" +
                "forward 3\n" +
                "forward 2\n" +
                "down 9\n" +
                "down 1\n" +
                "forward 5\n" +
                "up 6\n" +
                "down 7\n" +
                "forward 4\n" +
                "down 6\n" +
                "forward 1\n" +
                "forward 8\n" +
                "up 4\n" +
                "forward 5\n" +
                "down 8\n" +
                "forward 6\n" +
                "up 2\n" +
                "forward 3\n" +
                "forward 5\n" +
                "up 6\n" +
                "up 8\n" +
                "up 4\n" +
                "forward 6\n" +
                "down 2\n" +
                "down 6\n" +
                "down 5\n" +
                "up 2\n" +
                "down 3\n" +
                "down 7\n" +
                "up 6\n" +
                "forward 2\n" +
                "forward 3\n" +
                "up 6\n" +
                "forward 3\n" +
                "up 8\n" +
                "forward 6\n" +
                "down 8\n" +
                "down 7\n" +
                "down 1\n" +
                "down 6\n" +
                "up 8\n" +
                "up 9\n" +
                "down 4\n" +
                "forward 2\n" +
                "forward 7\n" +
                "down 8\n" +
                "up 6\n" +
                "up 8\n" +
                "up 8\n" +
                "down 4\n" +
                "forward 9\n" +
                "down 5\n" +
                "forward 5\n" +
                "forward 3\n" +
                "down 1\n" +
                "forward 1\n" +
                "up 9\n" +
                "down 1\n" +
                "down 6\n" +
                "up 6\n" +
                "forward 7\n" +
                "forward 1\n" +
                "down 5\n" +
                "down 2\n" +
                "forward 5\n" +
                "down 3\n" +
                "down 4\n" +
                "forward 6\n" +
                "up 6\n" +
                "down 9\n" +
                "up 3\n" +
                "forward 1\n" +
                "up 3\n" +
                "down 5\n" +
                "up 4\n" +
                "down 4\n" +
                "forward 9\n" +
                "up 5\n" +
                "down 1\n" +
                "forward 4\n" +
                "down 8\n" +
                "up 1\n" +
                "forward 9\n" +
                "forward 8\n" +
                "up 4\n" +
                "up 3\n" +
                "up 5\n" +
                "forward 5\n" +
                "up 7\n" +
                "forward 5\n" +
                "forward 4\n" +
                "forward 6\n" +
                "forward 9\n" +
                "down 6\n" +
                "down 3\n" +
                "up 5\n" +
                "forward 2\n" +
                "up 9\n" +
                "down 4\n" +
                "down 2\n" +
                "forward 5\n" +
                "up 6\n" +
                "forward 1\n" +
                "up 5\n" +
                "up 3\n" +
                "down 4\n" +
                "forward 3\n" +
                "forward 6\n" +
                "up 4\n" +
                "up 6\n" +
                "down 3\n" +
                "down 2\n" +
                "up 3\n" +
                "down 9\n" +
                "up 7\n" +
                "forward 6\n" +
                "up 4\n" +
                "forward 7\n" +
                "down 4\n" +
                "up 6\n" +
                "down 6\n" +
                "forward 9\n" +
                "forward 4\n" +
                "up 2\n" +
                "forward 7\n" +
                "up 5\n" +
                "forward 2\n" +
                "forward 2\n" +
                "down 4\n" +
                "down 4\n" +
                "forward 3\n" +
                "down 4\n" +
                "up 3\n" +
                "forward 9\n" +
                "down 5\n" +
                "forward 6\n" +
                "forward 9\n" +
                "forward 9\n" +
                "up 6\n" +
                "down 9\n" +
                "forward 8\n" +
                "up 7\n" +
                "up 5\n" +
                "down 6\n" +
                "forward 6\n" +
                "forward 1\n" +
                "down 6\n" +
                "forward 5\n" +
                "down 2\n" +
                "down 1\n" +
                "forward 6\n" +
                "down 6\n" +
                "down 9\n" +
                "down 5\n" +
                "forward 1\n" +
                "down 7\n" +
                "down 7\n" +
                "down 4\n" +
                "forward 7\n" +
                "up 5\n" +
                "up 1\n" +
                "up 2\n" +
                "up 5\n" +
                "down 3\n" +
                "forward 9\n" +
                "forward 2\n" +
                "forward 8\n" +
                "up 4\n" +
                "forward 7\n" +
                "forward 6\n" +
                "forward 9\n" +
                "down 2\n" +
                "down 6\n" +
                "forward 4\n" +
                "down 9\n" +
                "down 9\n" +
                "up 3\n" +
                "forward 2\n" +
                "forward 1\n" +
                "down 5\n" +
                "up 9\n" +
                "down 6\n" +
                "forward 6\n" +
                "down 8\n" +
                "forward 3\n" +
                "forward 5\n" +
                "forward 3\n" +
                "forward 2\n" +
                "down 7\n" +
                "down 2\n" +
                "up 8\n" +
                "forward 9\n" +
                "down 8\n" +
                "up 7\n" +
                "down 4\n" +
                "up 3\n" +
                "forward 6\n" +
                "down 3\n" +
                "up 3\n" +
                "down 6\n" +
                "down 3\n" +
                "up 2\n" +
                "down 4\n" +
                "down 4\n" +
                "up 2\n" +
                "down 6\n" +
                "down 5\n" +
                "down 9\n" +
                "down 1\n" +
                "down 7\n" +
                "up 9\n" +
                "down 4\n" +
                "up 6\n" +
                "down 6\n" +
                "forward 9\n" +
                "forward 2\n" +
                "down 8\n" +
                "down 3\n" +
                "forward 4\n" +
                "forward 4\n" +
                "forward 5\n" +
                "down 2\n" +
                "down 8\n" +
                "down 1\n" +
                "up 4\n" +
                "forward 9\n" +
                "up 7\n" +
                "forward 5\n" +
                "down 5\n" +
                "up 9\n" +
                "down 2\n" +
                "down 2\n" +
                "forward 4\n" +
                "forward 4\n" +
                "forward 8";

        String[] split = data.split("\n");

        int x = 0;
        int y = 0;

        for (int i = 0; i < split.length; i++) {
            if (split[i].contains("forward")){
                x = x + split[i].charAt(split[i].length()-1);
                System.out.println("f" + split[i].charAt(split[i].length()-1));
            }
            else if (split[i].contains("up")){
                y = y - split[i].charAt(split[i].length()-1);
                System.out.println("u" + split[i].charAt(split[i].length()-1));
            }
            else if (split[i].contains("down")){
                y = y + split[i].charAt(split[i].length()-1);
                System.out.println("d" + split[i].charAt(split[i].length()-1));
            }
            else {
                System.out.println("error");
                break;
            }
        }

        System.out.println("x:"+x+" y:" + y + " x*y=" + (x*y));

    }
}
