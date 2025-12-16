package Array.Questions;

public class Floor {
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            //comparisons
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {   //right
                start = mid + 1;
            } else {    //left
                end = mid - 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
            int number[] = {2, 4, 6, 8, 10, 12, 14};
            int key = 9;

            System.out.println("index for key is : " + binarySearch(number, key));
        }

}

