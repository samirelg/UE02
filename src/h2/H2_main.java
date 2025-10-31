package h2;

public class H2_main {

    public static void main(String[] args) {

        int i = 1;
        int j = 2;
        int k = 3;
        int min = 0;
        int max = 5;

        if (i < k && i < j) {
            min = i;
        }
        if (j < i && j < k) {
            min = j;
        }
        if (k < i && k < i) {
             min = k;
        }

        if (i > k && i > j) {
            max = i;
        }
        if (j > i && j > k) {
            max = j;
        }
        if (k > i && k > i) {
             max = k;
        }
    
    System.out.println(min);
    System.out.println(max);


    }
}
