package Reverse_Number;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = sc.nextInt();
       int org_num=number;
        int rev=0;

        while (number >0){
            rev =  rev*10 +(number%10);
            number=number/10;
        }

        if (rev==org_num){
            System.out.println("\nNumber is palindrome ");
        }
        else {
            System.out.println("\nNumber is not palindrome");
        }
    }
}
