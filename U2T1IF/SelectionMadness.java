package U2T1IF;

public class SelectionMadness {

  // no instance variables //
  
  public SelectionMadness() { }

  /* Returns 1 of 5 randomly generated fortunes as a string;
     you should write your own 5 fortunes! (see output for examples)
   */
  public String fortune() {
     /* implement this method */
     int RandNumb = (int) (Math.random() * 5) + 1;
     if (RandNumb == 1) {
        return "You're lucky today";
     }
     else if (RandNumb == 2) {
        return "You will have a bad day";
     }
     else if (RandNumb == 3) {
        return "Things will work out in the near future";
     }
     else if (RandNumb == 4) {
        return "You will get in trouble in the near future";
     }
     else {
        return "You're fated for misfortune";
     }
  }

  /* Returns the largest of three provided integers: num1, num2, or num3
   */
  public int largest(int num1, int num2, int num3) {
     /* implement this method */
     if (num1 > num2) {
        if (num1 > num3) {
            return num1;
        } else {
            return num3;
        }
     } else {
        return num2;
     }
  }

}

