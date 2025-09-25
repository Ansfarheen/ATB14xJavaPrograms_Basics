package Swapping_Two_Numbers;

public class Logic5 {
    public static void main(String[] args) {
        int a=20, b=30;
        System.out.printf("The value of a is %d and value of b is %d\n",a,b);
        b = a+b - (a=b);
        System.out.printf("The value of a is %d and value of b is %d",a,b);
    }
}
