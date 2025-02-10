public class Array {

    public static <T> void swap(T[] arr, int idx1, int idx2) {
        if (arr == null || idx1 < 0 || idx2 < 0 || idx1 >= arr.length || idx2 >= arr.length) {
            throw new IllegalArgumentException("Invalid index or array is null");
        }

        T temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        swap(intArray, 1, 3);
        System.out.println(java.util.Arrays.toString(intArray)); 
        String[] strArray = {"A", "B", "C", "D"};
        swap(strArray, 0, 2);
        System.out.println(java.util.Arrays.toString(strArray)); 
    }
}
