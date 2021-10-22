package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    private static int sumaCifara(int n){
        int suma=0;
        while(n!=0){
            suma+=n%10;
            n/=10;
        }
        return suma;
    }

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int i=2;
        while(i<n){
            if(i%sumaCifara(i)==0) System.out.println(i + " ");
            i++;
        }
    }
}
