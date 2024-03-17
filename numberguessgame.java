import java.util.Scanner ;
import java.util.Random ;
public class numberguessgame 
{
public static void main(String[] args) 
{
    Scanner sc =new Scanner(System.in);
   System.out.println("welconme to guess number game!!!!");
   System.out.println("Enter your name");
   String name =sc.nextLine();
   System.out.println("hi " +name +" guess a number between 1 to 100");
   System.out.println("you have only 5 attempt");
   System.out.println("enter 1 to play game");
   int a =sc.nextInt();
   int mynumber =RandomNumber(1,100);
   

   for (int i = 0 ;i<5 ; i++)
   {
    Scanner sc1 = new Scanner(System.in);
   
    
    System.out.println("Enter your guess");
    int guessnumber=sc1.nextInt();
    if (guessnumber == mynumber)
    {
        System.out.println("you guess the number correctly (:");
        System.out.println("your score is " + i);

    }
    else if (guessnumber > mynumber)
    {
        System.out.println("number is too high");
    }
    else if (guessnumber < mynumber)
    {
        System.out.println("number is too low");
    }
     if (i>=10)
     {
        System.out.println("too many attempts try again sorry");
     }

   }
   
System.out.println("game exited");
}
    

public static int RandomNumber(int min , int max)
{
Random random = new  Random();
return random.ints(min,max).findFirst().getAsInt();

 }
} 
