public class act16 {
    public static void main(String[] args) {
        System.out.println(sovafr0("Hi", 4));
    }
    public static String sovafr0(String word, int n) {
        StringBuilder wretter = new StringBuilder();
        for (int i = 0; i < n; i++) {
            wretter.append(word);
        }
        return wretter.toString();
    }
}