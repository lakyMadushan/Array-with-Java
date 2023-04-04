public class MultiDemensionalArray {
    public static void main(String[] args) {
        //multi Demensional array
        int [][] a = new int[3][3];

        int num = 1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = num;
                ++num;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//Answers
//1 2 3
//4 5 6
//7 8 9