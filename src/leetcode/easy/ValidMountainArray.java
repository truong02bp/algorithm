package leetcode.easy;

public class ValidMountainArray {

    public static boolean validMountainArray(int[] arr) {
        int top = -1;
        if (arr.length <= 2)
            return false;
        for (int i=0;i<arr.length-1; i++) {
            if (arr[i] == arr[i+1])
                return false;
            if (arr[i] < arr[i+1]) {
                top = i+1;
            }
            else {
                break;
            }
        }
        if (top == -1 || top == arr.length-1)
            return false;
        for (int i=top+1;i<arr.length;i++) {
            System.out.println(arr[i] +" " + arr[top]);
            if (arr[i] >= arr[top])
                return false;
            top = i;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,3,2,1};
        System.out.println(validMountainArray(arr));
    }
}
