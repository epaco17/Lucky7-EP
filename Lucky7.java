import java.util.Random;

public class Lucky7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int money = 5;  // Player starts with 5€

        while (money > 0) {
            int num1 = rand.nextInt(10) + 1;
            int num2 = rand.nextInt(10) + 1;
            int num3 = rand.nextInt(10) + 1;

            System.out.println("Your numbers are: " + num1 + ", " + num2 + ", " + num3);
            money -= 1;  // Deduct 1€ per game

            int count7 = 0;
            if (num1 == 7) count7++;
            if (num2 == 7) count7++;
            if (num3 == 7) count7++;

            if (count7 == 1) {
                System.out.println("You won 3 Euros!");
                money += 3;
            } else if (count7 == 2) {
                System.out.println("You won 5 Euros!");
                money += 5;
            } else if (count7 == 3) {
                System.out.println("Jackpot! You won 10 Euros!");
                money += 10;
            } else {
                System.out.println("You lost this round.");
            }

            System.out.println("Money left: " + money + " Euro\n");
        }

        System.out.println("Game over! You have no money left.");
    }
}