import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner s=new Scanner(System.in);

        String cont;
        do {
            int Chance=5;
            int number= random.nextInt(100);
            while (Chance != 0) {
                System.out.println("Enter a Number: ");
                int guess = s.nextInt();
                if (guess > number) System.out.println("Too High");
                else if (guess < number) System.out.println("Too Low");
                else System.out.println("Guessed Correct!");
                Chance--;
            }
            System.out.println("Game Over!!");
            System.out.println("Want to Continue y/n");
            cont = s.next();
        }while (cont.equalsIgnoreCase("y"));
    }
}
