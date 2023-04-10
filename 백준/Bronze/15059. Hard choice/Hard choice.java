import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Ca = sc.nextInt();
        int Ba = sc.nextInt();
        int Pa = sc.nextInt();
        int Cr = sc.nextInt();
        int Br = sc.nextInt();
        int Pr = sc.nextInt();

        int c = Ca - Cr;
        int b = Ba - Br;
        int p = Pa - Pr;

        if (c >= 0) c = 0;
        if (b >= 0) b = 0;
        if (p >= 0) p = 0;
        
        if (c < 0) c = (Ca - Cr) * -1;
        if (b < 0) b = (Ba - Br) * -1;
        if (p < 0) p = (Pa - Pr) * -1;

        System.out.println(c+b+p);
        
    }
}