public class StringLoops {
  // default constructor; no instance variables
  public StringLoops() { }

  /* Returns the number of times "character" appears in "searchString"
     This should be NON-case sensitive! 
     
     Examples:
     - if character = "a" and searchString = "Apple and banana",
       this method returns 5 (it finds BOTH "A" and "a")
     - if character = "A" and searchString = "Apple and banana",
       this method returns 5 (it finds BOTH "A" and "a")
     - if character = "!" and searchString = "Hello! Nice day!",
       this method returns 2

      DO THIS WITH A FOR LOOP
    */  
  public int countCharacters(String letter, String word) {
      int count = 0;
      int idx = 0;
      while (idx < word.length()) {
          String nextLetter = word.substring(idx, idx + 1);
          if (nextLetter.equals(letter.toUpperCase()) || nextLetter.equals(letter.toLowerCase())) {
              count++;
          }
          idx++;
      }
      return count;
  }
  
  /* Returns the original string reversed 
   
   Examples:
   - if origString = "hello!" this method returns "!olleh"
   - if origString = "Apples and bananas" this method returns "sananab dna selppA"
  */  
  public String reverseString(String origString) {
    String newString = "";
    for (int i = 0; i < origString.length(); i++){
      String character = origString.substring(i, i + 1);
      newString = character + newString;
    }
    return newString;
  }
}

