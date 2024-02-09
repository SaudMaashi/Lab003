public class Sorter {
    public static void main(String[] args) {
        int[] m = {3,4,5};
        sort(m);
        System.out.println("Hello, World!");
    }

    public class SelectionSort {
        public static void selectionSort(int[] arr) {
            int n = arr.length;

            // Traverse through all array elements
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in the unsorted part of the array
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                // Swap the found minimum element with the first element
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are greater than key,
               to one position ahead of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void sort(int[] m){
        insertionSort(m);
    }
}
