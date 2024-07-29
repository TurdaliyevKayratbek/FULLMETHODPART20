public class act2 {
    public static void main(String[] args) {
        boolean[] array = {true, false, true, true, false};
        countTrueElements(array);
    }

    public static void countTrueElements(boolean[] array) {
        int counter= 0;
        for (boolean numbers : array) {
            if (numbers) {
                counter++;
            }
        }
        System.out.println("Amount of true : " + counter);
    }
}

