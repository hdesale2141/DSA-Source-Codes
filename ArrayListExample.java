import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.println("size -> "+arr1.size());

        // arr1.add(1);
        // arr1.add(2);
        // arr1.add(3);
        // arr1.add(4);

        // System.out.println("size -> "+arr1.size());

        arr1.set(8, 2);
        System.out.println("size -> "+arr1.size());
    }
}
