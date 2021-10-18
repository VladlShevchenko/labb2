public class Plural {

    public boolean isPlural(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[j] == a[i]) return false;
            }
        }
        return true;
    }
}
