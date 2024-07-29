import java.util.Random;

public class act10 {
    public static void main(String[] args) {
        char[] result = liltobig(10, true);
        System.out.println(result);
    }
    public static char[] liltobig(int n, boolean b) {
        char[] array = new char[n];
        Random random = new Random();
        char Char = b ? 'A' : 'a';
        for (int i = 0; i < n; i++) {
            array[i] = (char) (Char + random.nextInt(26));
        }
        return array;
    }
}
