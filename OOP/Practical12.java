import java.util.Arrays;

class Practical12 {

    // Partition method
    static int partition(int array[], int low, int high) {

        int pivot = array[high];   // choose rightmost element as pivot
        int i = low - 1;           // pointer for greater element

        for (int j = low; j < high; j++) {

            if (array[j] <= pivot) {
                i++;

                // swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap pivot element with element at i+1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // QuickSort method
    static void quickSort(int array[], int low, int high) {

        if (low < high) {

            int pi = partition(array, low, high);

            // recursive call on left of pivot
            quickSort(array, low, pi - 1);

            // recursive call on right of pivot
            quickSort(array, pi + 1, high);
        }
    }

    // Main method
    public static void main(String args[]) {

        int[] data = {8, 7, 2, 1, 0, 9, 6};

        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(data));

        quickSort(data, 0, data.length - 1);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}