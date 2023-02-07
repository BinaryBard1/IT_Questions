import java.util.HashMap;

public class p62A {
    public static void main(String[] args) {
        int[] Array = {1,2,5,1,5,1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : Array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        System.out.print("[");
        for (int i : Array) {
            System.out.print(map.get(i) + ",");
        }
        System.out.print("\b");
        System.out.print("]");
    }
}
