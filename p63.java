public class p63 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 9};
        boolean isSorted = true;
        for (int i = 0; i<arr.length;i++){
            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}
