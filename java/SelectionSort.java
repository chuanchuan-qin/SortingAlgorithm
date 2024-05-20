public class SelectionSort {
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i==0) {
                System.out.printf("[%d, ", array[i]);
            }
            else if (i==(array.length-1)) {
                System.out.printf("%d]\n", array[i]);
            }
            else {
                System.out.printf("%d, ", array[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 2, 1, 6, 8, 9, 10, 11, 7, 20, 12, 124, 15};
        System.out.print("original array: ");
        printArray(array);

        for (int i = 0;i < array.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j<array.length; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.print("selection sort array: ");
        printArray(array);
    }
}
