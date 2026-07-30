public class sortedArrayRC {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 4, 6, 8};
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}

// Concept : here arr in every function call points to the same object







