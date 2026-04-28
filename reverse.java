
import java.util.Scanner;


class reverse{

    public static void main(String[]args){
        Scanner rev = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = rev.nextInt();


        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers: ");
        for (int i =0 ; i<n ;i++){
            arr[i]=rev.nextInt();
        }

        System.out.println("Numbers in reverse order: ");
        for(int i= n-1 ; i>=0 ; i--){
            System.out.print(arr[i] + " ");
        }

        int even = 0 ;
        int odd = 0;

        for(int i =0 ; i<n ; i++){
            if (arr[i]% 2 == 0)
                even ++;
            else
                odd++;

        }

        System.out.println("\nEven: " + even);
        System.out.println("Odd: " + odd);



    }
}