import java.util.Scanner;

public class p61 {
    public static boolean duplicate(int[] array){
        for(int i = 0 ; i< array.length-1; i++){
            if(array[i] == array[i + 1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test;
        int count;
        test = sc.nextInt();
        while (test>0){
            count = sc.nextInt();
            int[] array = new int[count];
            for (int i = 0 ; i<count;i++){
                array[i] = sc.nextInt();
            }
            System.out.println(duplicate(array));
            test--;
        }
    }
}
