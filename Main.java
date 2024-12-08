import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//creating a scanner object for user to input //
        Scanner scanner= new Scanner(System.in);

//showing options for user to choose//
       System.out.println("Temperature converter");
       System.out.println("1. celsius to fahrenheit");
       System.out.println("2. fahrenheit to celsius");
       System.out.println("Make one choice please");

//here to trying to get the input of the user//
       int choice= scanner.nextInt();
// creating the process for choice 1
       if (choice==1){
           System.out.print("ENTER YOUR TEMPERATURE");
           double celsius=scanner.nextDouble();
// the calculation for the change//
           double fahrenheit= (celsius* 9/5)+32;
// outputting the result //
           System.out.println(fahrenheit+"c is equal to fahrenheit");
//creating the process for choice 2//
       } else if (choice==2) {
           System.out.print("enter your temperature");
           double fahrenheit= scanner.nextDouble();
 //calculation for the change//
           double celsius =(fahrenheit-32)*5/9;
  //outputting the result//
           System.out.println(celsius+"F is equal to "+ celsius+"C");
// setting up the invalid option//
       }else {
           System.out.print("not an option, select one or two");
       }
//closing scammer object//s
       scanner.close();
    }
}













