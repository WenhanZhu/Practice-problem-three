import java.util.Scanner;

class Main {
  public static void main(String[] args) {

   Scanner s = new Scanner(System.in);

    System.out.println("Enter a year in 4 digit positive interger ");
   int Year;
  Year=s.nextInt();

if (Year%4==0 && Year%100!=0)
 System.out.println("this is a leap years ");

else if (Year%4==0 && Year%100==0 && Year%400==0)
System.out.println("this is a leap years ");
else System.out.println("this is not a leap years ");
  }
}