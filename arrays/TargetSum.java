public class TargetSum {
    static void targetSum(int arr[], int target){
        for(int i=0; i< arr.length;i++){
            for(int j=i; j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        targetSum(arr, 7);

    }
}