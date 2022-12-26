public class Main {
    public static void main(String[] args) {
        String s = "1234567890";
        int m = s.length() / 2;
        if (s.length() % 2 == 0) {
            System.out.println(s.substring(0, m));
            System.out.println(s.substring(m));
        } else {
            System.out.println("Длина строки нечетная");
        }
    }
}
