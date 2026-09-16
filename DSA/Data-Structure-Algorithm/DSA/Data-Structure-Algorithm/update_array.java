public class update_array{
    public static void main(String[] args){

        int arr[] = {10, 5, -3, 4, 12};
        int n = arr.length;
        int minValue = arr[0];

        for(int i = 0; i<=4; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
            
        }

        System.out.println(minValue);
    }
}