import java.util.Scanner;
import java.util.Random;
public class Number{
  public static void main(String args[]){
    final int max=100;
    int answer,guess;
    Scanner in= new Scanner(System.in);
    Random rand= new Random();
    boolean correct=false;
    answer=rand.nextInt(max)+1;
    while(!correct){
      System.out.println("guess the number between 1 to 100");
      guess=in.nextInt();
      if(guess > answer){
        System.out.println("too high,try again");
      }
      else if(guess < answer){
        System.out.println("too low,try again");
      }
      else{
        System.out.println("perfect");
        correct=true;
      }
    }
   System.exit(0);
  }
}
