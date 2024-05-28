import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i=0; i < n; i++) {
            str[i] = kb.next();
        }
        for(int i=0; i < n; i++) {
            for(int j=str[i].length() -1; j >= 0; j--) {
                System.out.print(str[i].charAt(j));
            }
            System.out.println();
        }
    }
}