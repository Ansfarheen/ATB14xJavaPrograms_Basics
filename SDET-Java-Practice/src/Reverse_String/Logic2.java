package Reverse_String;

import java.util.Scanner;

public class Logic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string ");
        String str = sc.next();

        StringBuffer sb = new StringBuffer(str);
        System.out.println("\nThe reversed string is "+sb.reverse());
    }
}
