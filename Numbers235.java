import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Numbers235 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length :");
        int len = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        q.add(2);
        q.add(3);
        q.add(5);

        for(int i=0;i<len;++i){
            int x = q.peek();
            System.out.print(q.peek()+" ");
            q.remove();

            q.add(10*x + 2);
            q.add(10*x + 3);
            q.add(10*x + 5);

            // System.out.print(q.peek()+" ");
        }
        // System.out.print(q.peek()+" ");
    }
    
}
