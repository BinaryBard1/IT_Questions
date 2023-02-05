import java.util.Scanner;

public class p58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] array = new int[count];
        int even_sum = 0;
        int odd_sum = 0;

        for (int j = 0; j<count ; j++){
            array[j] = sc.nextInt();
        }

        for (int j : array) {
            if (j % 2 == 0) {
                even_sum = even_sum + j;
            } else {
                odd_sum = odd_sum + j;
            }

        }
        System.out.println(even_sum-odd_sum);
    }
}
