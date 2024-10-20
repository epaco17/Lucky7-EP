import java.util.Random;

public class Lucky7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(10) + 1;
        int num2 = rand.nextInt(10) + 1;
        int num3 = rand.nextInt(10) + 1;

        System.out.println("Your numbers are: " + num1 + ", " + num2 + ", " + num3);

        if (num1 == 7 || num2 == 7 || num3 == 7) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
}