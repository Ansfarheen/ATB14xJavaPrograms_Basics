package Reverse_Number;

import java.util.Scanner;

public class Logic2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = sc.nextInt();
        System.out.print("\nThe original number is "+number);

        StringBuffer sb= new StringBuffer(String.valueOf(number));
        sb.reverse();
        System.out.print("The reverse of a number is "+sb);
    }
}
