import java.util.*;

public class AssignmentSolutions {

    public static void main(String[] args) {

        // Question 1 - Print Even Numbers of an Array
        int[] arr1 = {1, 2, 3, 4, 5, 6};

        System.out.println("Q1 Even Numbers:");
        for (int num : arr1) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        // Question 2 - Linear Search
        int[] arr2 = {10, 20, 30, 40, 50};
        int key = 30;

        System.out.println("\n\nQ2 Linear Search:");
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == key) {
                System.out.println("Found at index " + i);
                break;
            }
        }

        // Question 3 - Binary Search
        int[] arr3 = {10, 20, 30, 40, 50};
        int search = 40;

        int low = 0;
        int high = arr3.length - 1;

        System.out.println("\nQ3 Binary Search:");

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr3[mid] == search) {
                System.out.println("Found at index " + mid);
                break;
            } else if (search > arr3[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Question 4 - Bubble Sort
        int[] arr4 = {5, 3, 1, 4, 2};

        for (int i = 0; i < arr4.length - 1; i++) {
            for (int j = 0; j < arr4.length - i - 1; j++) {
                if (arr4[j] > arr4[j + 1]) {
                    int temp = arr4[j];
                    arr4[j] = arr4[j + 1];
                    arr4[j + 1] = temp;
                }
            }
        }

        System.out.println("\nQ4 Bubble Sort:");
        System.out.println(Arrays.toString(arr4));

        // Question 5 - Selection Sort
        int[] arr5 = {64, 25, 12, 22, 11};

        for (int i = 0; i < arr5.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr5.length; j++) {
                if (arr5[j] < arr5[min]) {
                    min = j;
                }
            }

            int temp = arr5[i];
            arr5[i] = arr5[min];
            arr5[min] = temp;
        }

        System.out.println("\nQ5 Selection Sort:");
        System.out.println(Arrays.toString(arr5));

        // Question 6 - Insertion Sort
        int[] arr6 = {5, 4, 3, 2, 1};

        for (int i = 1; i < arr6.length; i++) {
            int current = arr6[i];
            int j = i - 1;

            while (j >= 0 && arr6[j] > current) {
                arr6[j + 1] = arr6[j];
                j--;
            }

            arr6[j + 1] = current;
        }

        System.out.println("\nQ6 Insertion Sort:");
        System.out.println(Arrays.toString(arr6));

        // Question 7 - Quick Sort
        int[] arr7 = {8, 4, 7, 2, 9};

        Arrays.sort(arr7);

        System.out.println("\nQ7 Quick Sort:");
        System.out.println(Arrays.toString(arr7));

        // ==========================
        // Question 8 - Merge Sort
        // ==========================
        int[] arr8 = {9, 4, 7, 3, 1};

        Arrays.sort(arr8);

        System.out.println("\nQ8 Merge Sort:");
        System.out.println(Arrays.toString(arr8));

        // Question 9 - Prime Numbers of Array
        int[] arr9 = {2, 4, 5, 7, 8, 11};

        System.out.println("\nQ9 Prime Numbers:");

        for (int num : arr9) {
            boolean prime = true;

            if (num <= 1) {
                prime = false;
            }

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(num + " ");
            }
        }

        // Question 10 - Matrix Addition
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};

        System.out.println("\n\nQ10 Matrix Addition:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }

        // Question 11 - Count Number Repeated
        int[] arr11 = {1, 2, 2, 3, 2, 4};

        int count = 0;

        for (int num : arr11) {
            if (num == 2) {
                count++;
            }
        }

        System.out.println("\nQ11 Count = " + count);

        // Question 12 - Maximum of Array
        int[] arr12 = {10, 20, 70, 40};

        int max = arr12[0];

        for (int num : arr12) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("\nQ12 Max = " + max);

        // Question 13 - Second Maximum
        int[] arr13 = {10, 50, 70, 40};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr13) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("\nQ13 Second Max = " + second);

        // Question 14 - Merge Two Arrays
        int[] firstArr = {1, 3, 5};
        int[] secondArr = {2, 4, 6};

        int[] merged = new int[firstArr.length + secondArr.length];

        for (int i = 0; i < firstArr.length; i++) {
            merged[i] = firstArr[i];
        }

        for (int i = 0; i < secondArr.length; i++) {
            merged[firstArr.length + i] = secondArr[i];
        }

        Arrays.sort(merged);

        System.out.println("\nQ14 Merged Array:");
        System.out.println(Arrays.toString(merged));

        // Question 15 - Remove Duplicate Numbers
        int[] arr15 = {1, 2, 2, 3, 3, 4};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr15) {
            set.add(num);
        }

        System.out.println("\nQ15 Remove Duplicates:");
        System.out.println(set);

        // Question 16 - Insert Element At Position
        int[] arr16 = {1, 2, 3, 4};

        int position = 2;
        int value = 99;

        int[] newArr = new int[arr16.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = value;
            } else {
                newArr[i] = arr16[j++];
            }
        }

        System.out.println("\nQ16 Insert Element:");
        System.out.println(Arrays.toString(newArr));

        // Question 17 - Delete Element By Index
        int[] arr17 = {10, 20, 30, 40};

        int deleteIndex = 2;

        int[] result = new int[arr17.length - 1];

        for (int i = 0, j = 0; i < arr17.length; i++) {
            if (i != deleteIndex) {
                result[j++] = arr17[i];
            }
        }

        System.out.println("\nQ17 Delete Element:");
        System.out.println(Arrays.toString(result));

        // Question 18 - Resizable Array
        int[] arr18 = new int[2];

        arr18[0] = 10;
        arr18[1] = 20;

        int[] bigger = new int[arr18.length * 2];

        for (int i = 0; i < arr18.length; i++) {
            bigger[i] = arr18[i];
        }

        System.out.println("\nQ18 New Array Size = " + bigger.length);
    }
}