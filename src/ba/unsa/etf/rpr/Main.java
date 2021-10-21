package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    private static int sumCifara(int n) {
        int s=0;
        while(n!=0) {
            s+=n%10;
            n/=10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        int n;
        n=ulaz.nextInt();
        for(int i=2; i<n; i++) {
            if(i%sumCifara(i)==0)
                System.out.println(i + " ");
        }
        // write your code here
    }
}