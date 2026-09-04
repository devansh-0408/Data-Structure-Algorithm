import java.util.Scanner;

public class array_input{
    public static void main(String[] args){

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        int n = arr.length;    //ye length ke liye h

        for(int i=0; i<n; i++){
            System.out.println("Enter the value for index " + i);
            arr[i] = sc.nextInt();
        }

        for(int val : arr){
            System.out.println(val);
        }
        sc.close();
    }
}