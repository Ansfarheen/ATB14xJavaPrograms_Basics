package Reverse_Number;

import java.util.Scanner;

public class Logic1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = sc.nextInt();
        System.out.print("\nThe original number is "+number);
        int rev=0;

        while (number >0){
            rev =  rev*10 +(number%10);
            number=number/10;
        }
        System.out.print("\nThe reverse of the number is "+rev);

    }
}
