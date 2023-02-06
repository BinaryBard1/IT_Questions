public class p60 {
    public static void main(String[] args) {
        int[] array = {-2,-2,4,4,8,9,4};
        int B = 4;
        int[] result = new int[2];
        result[0] = Integer.MAX_VALUE;
        result[1] = Integer.MIN_VALUE;

        for (int i = 0; i< array.length; i++){
            if (array[i] == B){
                if (i<result[0]){
                    result[0] = i;
                }
                if (i>result[1]){
                    result[1] = i;
                }
            }

        }
        System.out.print("[");
        for (int i : result) {
            System.out.print(i + ",");
        }
        System.out.print("\b");
        System.out.print("]");

    }
}
