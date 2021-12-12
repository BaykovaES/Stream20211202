import java.util.Arrays;
import java.util.Random;

public class Lesson3HW {

        public static void main(String[] agrs) {
        invertArray();
        System.out.println(" ");
        fillArray();
        System.out.println(" ");
        changeArray();
        System.out.println(" ");
        fillDiagonal();
        System.out.println(" ");
        fillArray(5, 12);
        System.out.println(" ");


        }

        public static void invertArray() {
            int[] array = {1,1,1,0,1,0,0,1,0,1,0};
            for (int i = 0; i < array.length; i++) {
                if (array [i] == 0) {
                array[i] = 1;
                }
                 else {
                     array[i] = 0;
                }

             }
             for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
             }

        }
        public static void fillArray() {
             int[] arr = new int[100];
             for (int i = 0; i < arr.length; i++) {
                arr[i] = (i + 1);
             }
             for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
             }

        }
        public static void changeArray() {
             int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
             for (int i = 0; i < arr.length; i++) {
                 if (arr[i] < 6) {
                     arr[i] = (arr[i] * 2);
                 }
             }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        public static void fillDiagonal() {
             int[][] arr = new int[9][9];
             for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i == j | (i + j) == (arr.length - 1)){
                        arr[i][j] = 1;
                    }
                }
             }

             for (int i = 0; i < arr.length; i++) {
                 for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + "\t");
                 }
                    System.out.println();

             }
        }
        public static void fillArray(int len, int initialValue) {
            int[] arr = new int[len] ;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (initialValue);
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }


}
