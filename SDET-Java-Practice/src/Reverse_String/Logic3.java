package Reverse_String;

import java.util.Scanner;

public class Logic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string ");
        String str = sc.next();
        String rev="";

        char[] a= str.toCharArray();
        for(int i= a.length-1;i>=0;i--){
            rev+=a[i];
        }

        System.out.println("\nThe reversed string is "+rev);
    }
}
