import java.util.ArrayList;
import java.util.Random;

public class task_01 {
    public static void main(String[] args) {
        ArrayList<Integer> main_arr = NewArray();
        System.out.println(main_arr);
        System.out.println(ArrayWithoutEven(main_arr));
    }
    public static ArrayList<Integer> NewArray() {
        Random rnd = new Random();
        int size = rnd.nextInt(10) + 2;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(rnd.nextInt(100));
        }
        return arr;
    }
    public static ArrayList<Integer> ArrayWithoutEven (ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
                i--;
            }
        }
        return arr;
    }

}
