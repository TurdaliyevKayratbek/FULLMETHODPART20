public class act8 {
    public static void main(String[]args){
        System.out.println(DOW(3));
    }
    public static String DOW(int day){
        return switch (day) {
            case 1 ->"Ponedelnik";
            case 2 -> "Pyatnitsa";
            case 3 -> "Sreda";
            case 4 -> "Chetwerg";
            case 5 -> "Pyatnitsa";
            case 6 -> "Sybbota";
            case 7 -> "Voskres";
            default -> "No";
        };
    }
}
