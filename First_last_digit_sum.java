import java.util.Scanner;

public class First_last_digit_sum {
    public static void main(String[] args) {
          // int no = 102358;

        // int sum = 0;
        // int first_last = 0,cnt = 0;
        
        // while(no > 0)
        // {
        //     cnt++;
        //     first_last = no % 10;
        //     if(cnt == 1){
        //         sum+= first_last;
        //     }
        //     no /=10;
        // }
        // sum += first_last;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any No :");
        int no = sc.nextInt();

        String str = Integer.toString(no);
         int first = str.charAt(0)-'0';
         int last = str.charAt(str.length()-1)-'0';
        // System.out.println((Integer)str.charAt(0)+(Integer)str.charAt(str.length()-1));
            System.out.println(first+last);
    }
}
