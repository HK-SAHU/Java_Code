import java.util.Scanner;

public class copiedaArray {
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        

        int arr2[]=arr;   //copying an array
        //only refrence gets copied here not the array 

        //this is also known as shallow copy

        arr2[0]=0;
        arr2[1]=1;

        System.out.println("original array");
        printArray(arr);

        System.out.println("copied array");
        printArray(arr2);

        // after changing the value in the copied array we have seen that the original array has also been changed
        // although the variables of the arrays are different but the address to which they are referring to is same which is in the heap memory
        //that's why it changed the original value also
        //this is also known as shallow copy

    }
}
