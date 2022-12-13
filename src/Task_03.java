import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task_03 {
    public static void main(String[] args) {
        ArrayList<Integer> arr3 = NewArray();
        System.out.println(arr3);
        System.out.println(MergeSort(arr3));
    }
    public static ArrayList<Integer> NewArray() {
        Random rnd = new Random();
        int size = rnd.nextInt(10) + 3;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(rnd.nextInt(100));
        }
        return arr;
    }
    public static ArrayList<Integer> MergeSort(ArrayList<Integer> arr) {
        int temp;
        int j = 2;
        for (int r = 0; r < (int)Math.ceil(arr.size()/2); r++) {
            for (int i = 0; i < arr.size() - 1; i += j) {
                for (int k = i; k < i + j - 1; k++) {
                    if (arr.get(k) > arr.get(k + 1)) {
                        System.out.printf("i %d r %d\n", i, r);
                        temp = arr.get(k + 1);
                        System.out.printf("temp %d\n", temp);
                        arr.set(k + 1, arr.get(k));
                        System.out.printf("k+1 %d\n", arr.get(k + 1));
                        arr.set(k, temp);
                        System.out.printf("k %d\n", arr.get(k));
                        System.out.println(arr);

                    }
                }
            }
            j*=2;
        }


        return arr;
    }
}
