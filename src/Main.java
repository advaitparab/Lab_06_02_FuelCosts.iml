import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {


        Scanner scan = new Scanner(System.in);



        System.out.println(" The number of gallons of gas in the tank "+" ");
        float gallons = scan.nextFloat();

        System.out.print("The fuel efficiency in miles per gallon"+" ");
        int eff = scan.nextInt();

        System.out.print("The price of gas per gallon"+" ");
        float price = scan.nextFloat();


        if(gallons<=0&&eff<=0&&price<=0)
        {
            System.out.println("Enter valid input");
        }
        else
        {


            System.out.println("Cost per 100 miles for the given gas price "+price+ " is " + (price * 100) );

            System.out.println("The distance(in miles) the car can go with the gas in the tank is" + (int)(eff * gallons));
        }


    }
}