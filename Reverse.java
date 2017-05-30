import java.io.Console;

public class Reverse {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Say something");
    String userResponse = console.readLine();
    System.out.println(userResponse);

    StringBuilder userString = new StringBuilder(userResponse);

    System.out.println(userString.reverse());

  }
}
