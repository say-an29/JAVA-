import java.util.*;

public class pascaletriangle {
    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) row.add(1);
                else row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            res.add(row);
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        for (List<Integer> row : generate(n)) {
            System.out.println(row);
        }
    }
}

