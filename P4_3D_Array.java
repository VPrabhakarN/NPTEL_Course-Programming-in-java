// Java program to demonstrate the 3D array 

public class P4_3D_Array {
    public static void main(String [] args)
    {
        // Java program to demonstrate the 3D array 
        int arr[][][] = new int[3][4][5];

        int i, j, k;

        // storing the values inside the array
        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                for(k=0; k<5; k++){
                    arr[i][j][k] = i * j * k;
                }
            }
        }

        // Displaying the array elements
        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                for(k=0; k<5; k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
