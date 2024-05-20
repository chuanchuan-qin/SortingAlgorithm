public class BubbleSort {
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

        for (int i = 1; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {break;}
        }
        System.out.print("bubble sort array: ");
        printArray(array);
    }
}
