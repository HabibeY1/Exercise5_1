import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0, j = 9; i < arr.length; i++, j--) {
            arr[i] = j;
        }

        for (int value : arr) {
            System.out.println(value);
        }
    }
}
