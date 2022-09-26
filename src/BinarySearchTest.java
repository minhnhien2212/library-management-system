public class BinarySearchTest {
    public static void main(String[] args) {
        int arr[] = {6, 13, 14, 25, 33, 43,51, 53, 64, 72};

        moveDisks(5, 1, 2, 3);
    }

    public static int recursiveBinarySearch(int[] array, int left, int right, int value) {

        if (left>right) return -1;
        int middle = (left + right)/2;

        if (array[middle]==value) return middle;
        if (array[middle]<value) {
            return  recursiveBinarySearch(array, middle + 1, right, value);
        }
        else {
            return recursiveBinarySearch(array, left, middle - 1, value);
        }
    }

    public static void moveDisks(int n, int start, int middle, int end){
        if (n==1){
            System.out.println("move " + start + " => " + end);
            return;
        }
        moveDisks(n-1, start, end, middle);
        moveDisks(1, start, middle, end);
        moveDisks(n-1, middle, start, end);
    }

}
