import java.util.Scanner; // must be at the top, before the class

public class p1_main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String zeile = s.nextLine();
        System.out.println(zeile);
        s.close();
    }
}