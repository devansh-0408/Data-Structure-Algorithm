public class sum_array {
    public static void main(String[] args){

        int arr[] = {4,8,22,12,44,65,7};
        int sum  = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            int value = arr[i];
            sum = sum + value;
        }

        System.out.println("The sum of the array is: " + sum);
    }
    
}
