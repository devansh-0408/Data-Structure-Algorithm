public class whole_array_print {
    public static void main(String[] args){

        int[][] brr = {
            {1,2},
            {5,6},
            {9,10},
            {13,14}
        };

        int rowLength = brr.length;
        int colLength = brr[0].length;

        for(int i = 0; i<rowLength; i++){
            for(int j = 0; j<colLength; j++){
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
