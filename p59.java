import java.util.Scanner;
public class p59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int i = 0; i<size; i++){
                array[i]= sc.nextInt();
            }
            int key = sc.nextInt();
            boolean found = false;
            for (int i = 0; i<size; i++) {
                if (array[i] == key) {
                    System.out.println("1");
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("0");
            }
            test--;


        }



    }
}
