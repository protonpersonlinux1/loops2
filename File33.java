import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class File33 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter low: ");
        int low = sc.nextInt();

        System.out.println("Enter high: ");
        int high = sc.nextInt();
        
        for(int n = low; n <= high; n++){
            if (n <= 1) continue;

            int count = 0;
            for(int div = 2; div * div <= n ; div ++){
                if(n % div == 0){
                    count++;
                        break;
                }
            }
            if(count == 0){
                System.out.println(n);
            }
        }
    }
}