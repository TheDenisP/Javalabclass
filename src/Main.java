import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int[] arr1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};*/
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int keeper = 0, counter = 0;

        for (int k = 10; 1 < k; k--) {
            counter++;

            for (int j = 1; j < k; j++) {

                if(arr1[j - 1] < arr1[j]){
                    continue;
                }
                else if (arr1[j - 1] > arr1[j]) {
                    keeper = arr1[j];
                    arr1[j] = arr1[j - 1];
                    arr1[j - 1] = keeper;
                    counter++;
                }
                counter++;
            }
        }

            System.out.print(Arrays.toString(arr1) + "\nNumber of Actions: " + counter);
    }
}
