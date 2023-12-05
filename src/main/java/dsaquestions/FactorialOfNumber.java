package dsaquestions;

import java.util.Scanner;

public class FactorialOfNumber {

    static int number;

    //Write a program to print the factorial of a given input number.

    public static void main(String[] args) {

        FactorialOfNumber ops=new FactorialOfNumber();
        ops.userInput();
        int factorial=ops.factorialOperation();
        System.out.println("The factorial of the number is "+factorial);

    }

    public void userInput()
    {
        try {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter a number");
            int number=scanner.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public int factorialOperation()
    {
        if(number<0)
        {
            return -1;
        }
        if(number==0 || number==1)

        {
            return 1;
        }

        int factorial=1;
        for(int i=2;i<=number;i++)
        {
            factorial=factorial*i;
        }

        return  factorial;
    }


}
