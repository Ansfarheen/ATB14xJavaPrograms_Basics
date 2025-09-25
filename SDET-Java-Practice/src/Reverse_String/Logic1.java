package Reverse_String;

import java.util.Scanner;

public class Logic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string ");
        String str = sc.next();
        String res="";
        int length= str.length();
        for(int i=length-1;i>=0;i--){
            res=res+str.charAt(i);
        }
        System.out.print("\nThe reversed string is "+res);
    }
}
