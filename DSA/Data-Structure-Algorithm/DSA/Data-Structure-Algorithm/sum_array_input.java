import java.util.Scanner;
public class sum_array_input {
        public static void main(String[] args){

            int arr[] = new int[10];
            Scanner sc = new Scanner(System.in);
            int n = arr.length;

            for(int i=0; i<n; i++){
                System.out.println("Enter the value for index :" + i);
                arr[i] = sc.nextInt();

           }

           int sum = 0;
           for(int i=0; i<n; i++){
                int value = arr[i];
                sum = sum + value;
           }


           System.out.println("The sum of the array is :" + sum);

           sc.close();
        }       
}
