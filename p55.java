import java.util.Scanner;

public class p55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        //System.out.print("\b");
        int[] array = new int[input];

        for (int i = 0; i < input;i++) {
            array[i] = sc.nextInt();
            //System.out.print("\b");
        }
        for (int j = array.length-1; j>=0; j--){
            System.out.print(array[j]+" ");
        }
        System.out.println("\b");

    }
}

