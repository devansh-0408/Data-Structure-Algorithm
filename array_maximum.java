public class array_maximum {
    public static void main(String[] args){

        int arr[] = {10, 9, -5, 22, 1};
        int n = arr.length;

        int MaxValue = arr[0];

        for(int i = 0; i<=4; i++){
            if(arr[i] > MaxValue){
                MaxValue = arr[i];
            }
        }
        System.out.println(MaxValue);
    }
}
