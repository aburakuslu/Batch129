package advanced_practice.practice05;

public class Q06_Arrays_Simetrik {

    // Bir Array'in simetrik olup olmadığını kontrol eden bir method oluşturunuz.
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 4, 3, 2, 1, 0};
        System.out.println(isSymmetric(arr));
    }

    public static boolean isSymmetric(int[] arr) {
        boolean isSymmetric = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arr[arr.length - 1 - i]) {
                isSymmetric = true;
            } else {
                isSymmetric = false;
                break;
            }

        }
        return isSymmetric;
    }
}
