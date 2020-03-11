import java.util.*;
public class Review {

  public static final int NOT_FOUND = -1;
  private static int findCapital(String s, int index) {
    //Be prepared to loop through the whole string, starting at index.
    for (int i = index; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isUpperCase(ch)) //if you find a capital letter, return its index
        return i;
    }
    //if, after exhaustively searching the String, a capital is never found. return a sentinel
    return NOT_FOUND;

  }
  private static String addSpaces(String original) {


    int start = 0; //the first character in the String to copy is initially 0
    int index = findCapital(original, 1); //find the first capital letter, ignoring the first letter
    String result = ""; // set up a String capable of storing the concatenated pieces.

    while (index != NOT_FOUND) {
      result += original.substring(start, index) + " "; //concatenate the recently found word with a space
      start = index; //our new candidate word starts where we found the previous capital letter
      index = findCapital(original, start + 1); //find the next capital letter, if one exists.

    }

    //when we're done finding capital letters, there's still one more word to process.
    result += original.substring(start);

    return result;
  }


  private static int findProduct(int[] arr, int logLength) {
    int product = 1;

    for (int i = 0; i < logLength; i++)
      product *= arr[i];

    return product;
  }



  public static void main(String[] args) {

    int[] arr = new int[10];

    for (int i = 0; i < arr.length; i++)
      arr[i] = i + 1;

    int product = findProduct(arr, arr.length);

    System.out.println("The product of all of the numbers is " + Arrays.toString(arr) + " is " + product);



    String test = "HelloWelcomeToCisc3115GoodLuckOnYourSemester.";

    System.out.println(addSpaces(test));

  }



}
