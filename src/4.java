import java.util.Random;

public class RandomCode {
  public static void main(String[] args) {
    Random rand = new Random();
    int randomNum = rand.nextInt((10 - 1) + 1) + 1;
    System.out.println("Random number: " + randomNum);
  }
}