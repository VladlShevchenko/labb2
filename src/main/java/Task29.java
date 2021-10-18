import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task29 {
    public Object[] isPlural(int[] a) {
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (j != i && a[j] == a[i]) b.add(a[i]);
            }
           /* if (k == 0)
                map.put(i, a[i]);
            *//*System.out.println(a[i]);*//*
            k = 0;*/
        }
        return b.stream().distinct().toArray();
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 4, 1};
        Task29 distinct3 = new Task29();
        Object[] result = distinct3.isPlural(arr);
        System.out.println(Arrays.toString(result));
    }
}
