package dsaquestions;

import java.util.Scanner;

public class ReverseANumber {

    static int number;

    public static void main(String[] args) {

        ReverseANumber ops=new ReverseANumber();
        ops.userInput();
        ops.reverseNumber();

    }


    public void userInput()
    {
        try {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter the number to be reversed");
            number=scanner.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void reverseNumber()
    {
        int reverse=0;
        while(number!=0)
        {
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        System.out.println("The reverse of the number is "+reverse);
    }


}

