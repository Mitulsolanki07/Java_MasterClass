package Array;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Array size cannot be changed once instantiated if becomes fixed
//        Array elements can be assign you cannot delete or add element in Array container
//        Array creation vs Object Creation :- int[] intArr = new int[sizeOfArray]       vs   StringBuilder sb = new StringBuilder()
//        Array does not allow to use () parenthesis so we cannot pass data  in array using constructor at declaration time
//        Array is sequence of element store of same type and follow 0 indexing
        int[] intArr = new int[10];
        intArr[2] = 3;
        System.out.println(" Element at index 2: " + intArr[2]);

//        Array initializer allows us to initialize array  with known elements (use when have limited elements)
//        it auto determined size of array base on given elements
        int[] firstFiveElements = new int[]{1, 2, 3, 4, 5};
        System.out.println("third element: " + firstFiveElements[2]);
//        Array anonymous initializer allow us to initialize array at !NOTE declaration time
        int[] reverseArr = {5, 4, 3, 2, 1};
        System.out.println("First Element: " + reverseArr[0]);
//   Array initializer vs Array Anonymous Initializer:- Array Anonymous Initializer can only use at time of declaration statement else raise compile error
//        String[] strArr;
//        strArr = {"ABC","DEF","GHI"};                         ERROR
//        String[] strArr = {"ABC","DEF","GHI"};                WORK
//        OR
//        String[] strArr;
//        strArr = new String[]{"ABC","DEF","GHI"};             WORK
//        System.out.println("Second Element: "+strArr[1]);

//        Array get default value initialized base on type for example double 0.0000, string null , boolean false, int 0, short 0 , class type element null ,etc
        double[] doubleArr = new double[5];
//        assign reversed order value
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = doubleArr.length - i;
        }
        for (int i = 0; i < doubleArr.length; i++) {
            System.out.printf("Element at index %d is %4.2f %n", i, doubleArr[i]);
        }
//        enhanced for loop -> for (declaration : collection)    vs     for(init; expression; increment)
//        !NOTE is colon(:) use instead of semi colon(;) and 2 components in enhanced for loop instead of 3
//        iterate element one at a time from first to last element in array
//        declaration is type of array element and variable name , collection is array container on which we need to iterate
//        Enhanced for loop :- reduce work of access element of array using indexing it implicitly do for us
        for (double element : doubleArr) {
            System.out.printf("Enhance For loop iterate element %f %n", element);
        }
        System.out.println(doubleArr);
//        print out all elements of array using one statement , from first to last element of array
        System.out.println(Arrays.toString(doubleArr));
// Arrays toString method does not override object method so when you use  System.out.println(doubleArr); it result looks [D@27973e9b where [D is primitive type , remaining part is hexa code
//        but java provide helper class for array where we can use its static class methods , Arrays is basic class with single attribute length does not provide more functionality
        // print element comma(,) separated inside square brackets [1,3,4,5]
        Object myObjVar = doubleArr;
        if (myObjVar instanceof double[]) {
            System.out.println("myObjVar is instance of double type array");
        }
        Object[] objArr = new Object[3];
        objArr[0] = "Hello";
        StringBuilder myStrBuilder = new StringBuilder(10);
        myStrBuilder.append("World");
        objArr[1] = myStrBuilder;
        objArr[2] = 2;
        System.out.println(Arrays.toString(objArr));

        Arrays.sort(doubleArr);
        System.out.println(Arrays.toString(doubleArr));
        System.out.println(Arrays.toString(getRandomArr(5)));

        byte[] byteArr = new byte[5];
        System.out.println(Arrays.toString(byteArr));
        Arrays.fill(byteArr, (byte) 4);
        System.out.println(Arrays.toString(byteArr));

        int[] randomArr = getRandomArr(10);

        int[] copyRandomArr = Arrays.copyOf(randomArr, randomArr.length);
        System.out.println(Arrays.toString(copyRandomArr));

        Arrays.sort(copyRandomArr);
        System.out.println(Arrays.toString(randomArr));
        System.out.println(Arrays.toString(copyRandomArr));

        System.out.println(11 / 3);
        System.out.println(11 / 3.0);

        int[] myIntSortedArr = new int[]{5, 4, 3, 9, 8, 10, 1, 2};
        Arrays.sort(myIntSortedArr);
//        three key point to note in binary search algorithm :- 1. array must be sorted
//        2. index of element return in case of duplicate is not always be the first element found in array
//        3. elements are must be comparable . trying to compare instances of different type may lead to error
//        if element found return position else return -1
        System.out.println(Arrays.toString(myIntSortedArr));
        System.out.println(Arrays.binarySearch(myIntSortedArr, 5));

//        you can compare two array of same type & same size & same arrangement or order
//        int[] s1 = {1,2,5,4,3};
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};
        System.out.println(String.join(" ", "Solanki", "Mitul"));
        String[] myStr = "hello world again".split(" ");
        printText(myStr);
//        printText();
//        int[] inputArr = readIntegers();
//        System.out.println("Before Reverse Array:- " + Arrays.toString(inputArr));
//        int[] reversedArr = reverseArray(Arrays.copyOf(inputArr,inputArr.length));
//        System.out.println("After Reverse Array" + Arrays.toString(reversedArr));

        System.out.println();
        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
        int[][] twoDArr = new int[3][3];
        for (int[] outer : twoDArr) {
            System.out.println("Element Type");
            System.out.println(Arrays.toString(outer));
            for (int element : outer) {
                System.out.println("Element: " + element);
            }
        }
//        System.out.println(Arrays.deepToString(twoDArr));
        Object[] obj = new Object[3];
        obj[0] = new int[3];
        obj[1] = new int[3][2];
        obj[2] = new int[3][3][3];
        for (Object outer : obj) {
            System.out.println("Element Type: " + outer.getClass().getSimpleName());
            System.out.println("Element Value: " + outer);
            if (outer instanceof int[]) System.out.println(Arrays.toString((int[]) outer));
            else if (outer instanceof int[][]) System.out.println(Arrays.deepToString((int[][]) outer));
            else if (outer instanceof int[][][]) System.out.println(Arrays.deepToString((int[][][]) outer));
        }
    }

    public static void printText(String... elements) {
        System.out.println("Code printText runs");
        for (String element : elements) {
            System.out.println(element);
        }
    }

    private static int[] getRandomArr(int len) {
        Random random = new Random();
        int[] intArr = new int[len];
        for (int i = 0; i < len; i++) {
//            set exclusive upper bound limit
            intArr[i] = random.nextInt(100);
        }
//    Arrays.sort(intArr);
        return intArr;
    }

    public static int[] readIntegers() {
        Scanner sc = new Scanner(System.in);
//        number of array elements
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0; i<N; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Minimum Element: "+ findMin(arr));
//        return arr;
        String input = sc.nextLine();
        String[] strArr = input.split(",");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i].trim());
        }
        System.out.println("Minimum Element: " + findMin(intArr));
        return intArr;
    }

    private static int findMin(int[] arr) {
//        sort the array
//        Arrays.sort(arr);
//        return first element of sorted ascending order array
//        return arr[0];
        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }

    private static int[] reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
