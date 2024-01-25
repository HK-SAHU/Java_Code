public class inPlaceReverse {
    static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int temp = 0;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        printArray(arr);
    }
    static void printArray(int[] arr){
        for(int i=0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr);
    }
}
