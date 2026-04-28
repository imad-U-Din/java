import java.util.Scanner;


class search{

    public static void main (String[]args){
        Scanner imad= new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n= imad.nextInt();


        int[] array = new int[n];

        System.out.println("Enter " + n + " numbers");
        for (int i =0; i<n ; i++){
            array[i]= imad.nextInt();
        }

        System.out.print("Enter a number to serach: ");
        int search = imad.nextInt();

        boolean found=false;

        for(int i =0 ; i<n; i++){
            if (array[i] == search) {
                if (!found)
                    System.out.print("Found at Position ");
                System.out.print((i+1) + " ");
                found = true;
            }
        }

    if (found)
    System.out.println();

    else
    System.out.println("number not present ");

    }
}