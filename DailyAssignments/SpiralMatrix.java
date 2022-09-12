public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{4,3,2,1},
                        {5,16,15,14},
                        {6,17,20,13},
                        {7,18,19,12},
                        {8,9,10,11}};
        int rowStart = 0, rowEnd = arr.length-1;
        int colStart = 0, colEnd = arr[0].length-1;

        while(rowStart<rowEnd && colStart < colEnd){
            for(int i= colEnd;i>=colStart;i--){
                System.out.print(arr[rowStart][i]+" ");
            }
            rowStart++;

            for(int i = rowStart;i<=rowEnd;i++){
                System.out.print(arr[i][colStart]+" ");
            }
            colStart++;

            for(int i = colStart;i<=colEnd;i++){
                System.out.print(arr[rowEnd][i]+" ");
            }
            rowEnd--;

            for(int i = rowEnd;i>=rowStart;i--){
                System.out.print(arr[i][colEnd]+" ");
            }
            colEnd--;
        }
    }
}
