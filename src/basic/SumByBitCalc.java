package basic;

/**
 * 求和：1+2+...+n，不能用乘除，if，else，for，while,switch,case等关键字以及条件判断A?B:C
 */

public class SumByBitCalc {

    public static int sum(int n) {
        int i = 0;
        int a = -1;
        boolean flag = (n != 0) && (a == (i = sum(n - 1)));
        return i + n;
    }

    public static void main(String[] args) {
        System.out.println("result = " + sum(10));
    }
}
