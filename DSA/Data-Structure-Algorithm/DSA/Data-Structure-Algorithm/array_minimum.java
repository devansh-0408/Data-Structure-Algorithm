public class array_minimum {
    public static void main(String[] args){

        int arr[] = {10, 5, -3, 4, 12};
        int n = arr.length;
        int MinValue = arr[0];

        for(int i = 0; i<=4; i++){
            if(arr[i] < MinValue){
                MinValue = arr[i];
            }
        }
        System.out.println(MinValue);
    }
}
