import java.util.Arrays;

public class hmwrk3 {




// 1
        public static void invertArray ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;

                } else {
                    arr[i] = 1;
                }


            }

        }
//2
        public static void fillArray () {
            int[] arr2 = new int[100];
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = i + 1;
            }
        }
//3
        public static void changeArray () {
            int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] < 6) {
                    arr3[i] *= 2;
                }
            }
        }
        private static int[][] fillDiagonal ( int size, int value){
            int[][] fillDiagonal = new int[size][size];
            for (int i = 0; i < size; i++) {
                fillDiagonal[i][i] = value;
                fillDiagonal[i][fillDiagonal.length - i - 1] = value;

            }
            return fillDiagonal;


        }
    private static int[] createArray(int len, int initialValue) {
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
            }
            return arr;

    }
    }






