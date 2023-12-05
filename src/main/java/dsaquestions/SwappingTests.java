package dsaquestions;

public class SwappingTests {

    /*
    *  Swap the values of two variables, x and y, without needing a third variable.
    *
    *
    *
    *
    *
    * */

    // arithmetic method

    static int x =10;
    static int y = 20;

    public static void main(String[] args) {

        swapArithmetic(x,y);
        swapBitwise(x,y);

    }

    public static void swapArithmetic(int x, int y){
        System.out.println("Before swapping");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("After swapping");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

    public static void swapBitwise(int x, int y){
        System.out.println("Before swapping");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x=x^y;
        y=x^y;
        x=x^y;

        System.out.println("After swapping");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
