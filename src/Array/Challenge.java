package Array;

import java.util.Arrays;
import java.util.Random;

public class Challenge {
    public static void main(String[] args) {
        int sizeOfArr = 3;
        int[] sortedIntArr = getRandomArr(sizeOfArr);
        int[] reverseIntArr = new int[sortedIntArr.length];
        Arrays.sort(sortedIntArr);
//        sort the array then start iterate from reverse order
        System.out.println("Arrays before reverse sort:- " + Arrays.toString(sortedIntArr));
        int index = 0;
        for (int element : sortedIntArr) {
            reverseIntArr[sortedIntArr.length - index - 1] = element;
            index += 1;
        }
        System.out.println("Arrays after reverse sort:- " + Arrays.toString(reverseIntArr));

//        reverse array using swap element
        sortedIntegerArr(sortedIntArr);
    }

    public static int[] getRandomArr(int len) {
        Random random = new Random();
        int[] randomArr = new int[len];
        for (int i = 0; i < len; i++) {
            randomArr[i] = random.nextInt(1000);
        }
        return randomArr;
    }

    public static int[] sortedIntegerArr(int[] sortedArr) {
        int[] reverseSortedArr = Arrays.copyOf(sortedArr, sortedArr.length);
//        System.out.println("before reverse sort->"+ Arrays.toString( reverseSortedArr));
        boolean flag = true;
        while (flag) {
//          make flag true to traverse array again
            flag = false;
            System.out.println("interation Array-> " + Arrays.toString(reverseSortedArr));
            for (int i = 0; i < sortedArr.length - 1; i++) {
                if (reverseSortedArr[i] < reverseSortedArr[i + 1]) {
                    int temp = reverseSortedArr[i];
                    reverseSortedArr[i] = reverseSortedArr[i + 1];
                    reverseSortedArr[i + 1] = temp;
                    flag = true;
                    System.out.println("Arrays->" + Arrays.toString(reverseSortedArr));
                }
            }
        }
        System.out.println("reverse sorted array-> " + Arrays.toString(reverseSortedArr));
        return reverseSortedArr;
    }
}
