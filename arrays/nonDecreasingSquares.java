public class nonDecreasingSquares {
    static int[] arrangingSquares(int[] arr) {
        int n = arr.length;
        int left = 0, j = 0;
        int right = n - 1;
        int ans[] = new int[n];
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[j++] = arr[left] * arr[left];
                // swap(arr, left, right);
                left++;
            }

            else {
                ans[j++] = arr[right] * arr[right];
                // swap(arr, left, right);
                right--;
            }
        }
        return ans;

    }

    static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { -10, -3, -2, 1, 4, 5 };
        int[] ans = arrangingSquares(arr);
        reverse(ans);
        printArray(ans);
    }
}
