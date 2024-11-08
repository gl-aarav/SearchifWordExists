import java.io.*;
import java.util.Scanner;

public class Main {
  static Scanner in = new Scanner(System.in);

  public static void main(String args[]) throws Exception {

    FileReader fr = new FileReader("words.txt");
    FileReader hi = new FileReader("words.txt");
    BufferedReader br = new BufferedReader(fr);
    BufferedReader hr = new BufferedReader(hi);
    String s;
    String g;
    String keyword;
    System.out.println("Enter a word you would like to see if the word is a word or not: ");
    keyword = in.nextLine();
    boolean Matched = false;
    boolean Matched1 = false;
    while ((s = br.readLine()) != null) {
      if (s.equals(keyword)) {
        System.out.println(keyword + " is a word.");
        System.out.println();
        Matched = true;

      }
    }
    if (Matched == false) {
      System.out.println(keyword + " is not a word.");
      System.out.println();
    }

    System.out.println("Do you want to see if this word is exists in between of words?");

    String option = in.nextLine();

    if (option.equalsIgnoreCase("yes")) {
      while ((g = hr.readLine()) != null) {
        if (g.contains(keyword)) {
          System.out.println(g + " is a word that contains " + keyword + ".");
          Matched1 = true;

        }
      }
      if (Matched1 == false) {
        System.out.println("There is no word that contains " + keyword);
        System.out.println();
      }
    } else {
      System.out.println("Ok, Bye!");
    }
    System.out.println();

  }
}