import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class task_02 {
    public static void main(String[] args) {
        ArrayList<Integer> arr2 = NewArray();
        System.out.println(arr2);
        PrintMinMax(arr2);
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
    public static void PrintMinMax (ArrayList<Integer> arr){
        Collections.sort(arr);
        System.out.printf("Минимальное число в массиве - %d\nМаксимальное число в массиве - %d\nСреднее число в массиве - %d",arr.get(0), arr.get(arr.size()-1), arr.get((int)Math.ceil(arr.size()/2)));
    }
}
