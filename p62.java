public class p62 {
    public static void main(String[] args) {
        int[] Array = {1,2,5,1,5,1};
        int[] result = new int[Array.length];

        for(int i = 0 ; i< Array.length;i++){
            int count = 0;
            for (int k : Array) {
                if (Array[i] == k) {
                    count++;
                }
            }
            result[i] = count;
        }
        System.out.print("[");
        for (int j : result) {
            System.out.print(j + ",");
        }
        System.out.print("\b");
        System.out.print("]");


    }
}
