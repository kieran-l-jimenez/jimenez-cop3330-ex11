import java.util.Scanner;


/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
 *           "Currency Conversion" output
 *How many euros are you exchanging? 81
 *What is the exchange rate? 1.3751
 *81 euros at an exchange rate of 1.3751 is
 *111.38 U.S. dollars.
 */
public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();

        System.out.print("How many euros are you exchanging? ");
        int numEuros = in.nextInt();
        System.out.print("What is the exchange rate? ");
        double rate = in.nextDouble();

        System.out.printf("%d euros at an exchange rate of %f is\n%.2f U.S. dollars.", numEuros, rate, myApp.roundConvert(numEuros, rate));
    }

    private double roundConvert(int euros, double rate)
    {
        double temp = euros * rate;
        double result = temp;

        temp *= 100;

        if(temp%1 != 0 && temp%1 >= 0.5)
        {
            result -= (temp%1)/100;
            result += 0.01;
        }
        else if(temp%1 != 0)
            result -= (temp%1)/100;

        return result;
    }
}