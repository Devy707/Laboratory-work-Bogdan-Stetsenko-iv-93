package LabaOOP;

public class Test {
    public static void main(String[] args) {
        int[][] mA =
                {{(char) 1, (char) 3, (char) 2},
                        {(char) 3, (char) 9, (char) 10},
                        {(char) 12, (char) 4, (char) 7},
                        {(char) 8, (char) 4, (char) 5},
                        {(char) 4, (char) 7, (char) 2}};

        int[][] mB =
                {{(char) 10, (char) 1, (char) 4, (char) 5},
                        {(char) 3, (char) 4, (char) 7, (char) 8},
                        {(char) 4, (char) 6, (char) 2, (char) 6}};

        System.out.println("" +
                "{1,3,2},\n" +
                "{3,9,10}    {10,1,4,5},\n" +
                "{12,4,7} *  {3,4,7,8},\n" +
                "{8,4,5}     {4,6,2,6},\n" +
                "{4,7,2}");
        System.out.println();
        int m = mA.length;
        int n = mB[0].length;
        int o = mB.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += mA[i][k] * mB[k][j];
                }
            }
        }
        System.out.println("C : ");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", res[i][j]);
            }
            System.out.println();
        }
        int S = 0;
        for (int i = 0; i < res.length; i++) {
            int min = res[i][0];
            for (int j = 1; j < res[0].length; j++) {
                if (min > res[i][j]) {
                    min = res[i][j];
                }
            }
            S += min;
        }
        System.out.println(S);
    }
}