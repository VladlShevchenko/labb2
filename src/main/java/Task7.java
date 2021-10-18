public class Task7 {
    public int absoluteValue(String[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int x = Integer.parseInt(a[i]);
                int y = Integer.parseInt(a[j]);
                if ((x - y) < min && (x - y >= 0))
                    min = x - y;
                else if ((y - x) < min && (y - x >= 0))
                    min = y - x;
            }
        }
        return Math.abs(min);
    }
}
