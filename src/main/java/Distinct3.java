import java.util.Arrays;
import java.util.HashMap;

public class Distinct3 {
    public HashMap<Integer, Integer> isPlural(int[] a) {
        int k = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (j != i && a[j] == a[i]) k++;
            }
            if (k == 0)
                map.put(i, a[i]);
            /*System.out.println(a[i]);*/
            k = 0;
        }
        return map;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4};
        Distinct3 distinct3 = new Distinct3();
        HashMap<Integer, Integer> result = distinct3.isPlural(arr);
        System.out.println(result);
    }
}
