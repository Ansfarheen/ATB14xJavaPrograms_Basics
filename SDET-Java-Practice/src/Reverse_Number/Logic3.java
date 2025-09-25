package Reverse_Number;

import java.util.Scanner;

public class Logic3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = sc.nextInt();
        System.out.print("\nThe original number is "+number);

        StringBuilder sb= new StringBuilder();
        sb.append(number);
        System.out.println("\nThe reverse of the number is "+sb.reverse());
    }
}
