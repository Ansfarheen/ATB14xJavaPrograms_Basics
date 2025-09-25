package Swapping_Two_Numbers;

public class Logic4 {
    public static void main(String[] args) {
        int a=20, b=30;
        System.out.printf("The value of a is %d and value of b is %d\n",a,b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.printf("The value of a is %d and value of b is %d",a,b);
    }
}
