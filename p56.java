import java.util.Scanner;

public class p56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] array = new int[input];
        for (int i = 0 ;i< array.length;i++ ){
            array[i]= sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.print(max+" "+min);

    }
}
