public class SIngaleDimensionalArray {
    public static void main(String[] args) {

        //Single dimensional array

        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];

        System.out.print("System Array A: " );
        for(int i=0;i<5;i++){
            a[i]=i;
            System.out.print(a[i] + " ");
        }
        System.out.println(); //get new line

        int num = 5;
        System.out.print("System Array B: " );
        for(int i=0;i<5;i++){
            b[i]=num;
            ++num;
            System.out.print( b[i] + " ");
        }
        System.out.println(); // get new line

        System.out.print("System Array Sum C: " );
        for(int i=0;i<5;i++){
            c[i] = a[i] + b[i];
            System.out.print( c[i] + " ");
        }
    }
}
//Answers
//System Array A: 0 1 2 3 4
//System Array B: 5 6 7 8 9
//System Array Sum C: 5 7 9 11 13