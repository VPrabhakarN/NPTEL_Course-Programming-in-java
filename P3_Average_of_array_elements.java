// Java program to demonstrate the array and define the average of it's element

public class P3_Average_of_array_elements {
    public static void main(String [] args){
        // defining the array
        int arr[] = {10, 20, 30, 40, 50};
        
        // calculating the sum of array element and finding the average of it
        int sum = 0, count = 0;

        for(int i=0; i<5; i++){
            sum = sum + arr[i];
            count++;
        }

        // displaying the average of the array element 
        System.out.println("Average : "+(sum/count));
    }
}
