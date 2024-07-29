import java.util.Arrays;

public class act11 {
    public static void main(String[] args) {
        String[] names = {"Kairat", "Baysal", "Nuradil bayke", "Atai", "Askat bayke"};
        String name = "Adilet";
        boolean answ = Chotniy(names, name);
        System.out.println(answ);
    }
    public static boolean Chotniy(String[] names, String name) {
        for (int i=0; i<names.length; i++) {
            if (names[i].equals(name)) {
                return i%2==0;
            }
        } System.out.println(Arrays.toString(names));
        return false;
    }
}
