public class p57 {
    public static void main(String[] args) {
        int[] array = {1,2,3,2,1};
        int B =3;

        for (int i = 0; i< array.length; i++){
            array[i] = array[i]+B;
        }
        System.out.print("[");
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.print("\b]");


    }
}
