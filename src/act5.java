public class act5 {
    public static void main(String[] args) {
        double n = 23;
        double sum = sumUpToN(n);
        System.out.println("From " + (int)n + " to: " + sum);
    }

    public static double sumUpToN(double n) {
        double sum = 0;
        int intN = (int)n;
        for (int i = 1; i <= intN; i++) {
            sum += i;
        }
        return sum;
    }
}