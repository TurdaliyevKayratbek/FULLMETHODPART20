public class act1 {
    public static void main(String[] args) {
        int[] array=new int[]{3,4,3,3,4,5};
        Method(array, 3);
    }
    public static void Method(int[] array, int number){
        boolean isContains=false;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==number) {
                isContains=true;
                break;
            }
        }
        System.out.println(isContains? " True "+number:" False "+number);
    }
}