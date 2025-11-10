import java.util.Scanner;

public class Runner {
   public static void main(String[] args) {

     // Tell the user to enter a question
     Scanner scan = new Scanner(System.in);
     System.out.println("Welcome to the Magic 8 Ball!");
     System.out.print("Enter a yes-no question and I will answer it: ");
     String question = scan.nextLine();

     // Write a little program here to randomly choose
     // one of six responses to the user's yes-no question!
      int rand = (int) (Math.random() * 6) + 1;
      System.out.println(rand);
      if (rand == 6){
          System.out.println("No");
      } else if (rand == 5){
          System.out.println("Yes");
      } else if (rand == 4){
          System.out.println("yuh uh");
      } else if (rand == 3){
          System.out.println("Never");
      } else if (rand == 2){
          System.out.println("Nuh uh");
      } else {
          System.out.println("Are you really asking this?");
      }


      final int VOTING_AGE = 18;
   final int DRIVING_AGE = 16;
   int myAge = 17;

   boolean canVote = (myAge >= VOTING_AGE);
   boolean canDrive = (myAge >= DRIVING_AGE);
   System.out.println("I can vote: " + canVote);
   System.out.println("I can drive: " + canDrive);
    
   int yourAge = 18;
   boolean sameAge = myAge == yourAge;
   if (sameAge) {
      System.out.println("Same age");
   } else {
      System.out.println("Different age");
   }

   int num1 = 12;
   boolean isEven = false;
   if (num1 % 2 == 0) {
      isEven = true;
   }
   System.out.println(num1 + " is even: " + isEven);

   boolean weird = (num1 <= 15) != (yourAge > 20);
   System.out.println(weird);

   String n = "hi";
   if (n.equals("bye")) {
      n = "whatever";
   }else if (n.equals("hello")) {
      n = "however";
   }
   System.out.println(n);

   }
}
