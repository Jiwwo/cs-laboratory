import static java.lang.Math.*;


public class oliver2 {
    public static void main(String[] args) {
        double i, j, k, a = 0, b = 0, c = 1;
        for (i=1;i<=8;i++){
            for(j=i;j<=2*i;j++){
                for (k=1;k<=j;k++){
                    a += (i+pow(j-k,i+j));
                }
                b += a;
                a = 0;
            }
            c *= b;
            b = 0;
        }
        System.out.println(c);
    }
}
