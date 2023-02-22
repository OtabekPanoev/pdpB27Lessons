package taskInClass;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {

    public static void main(String[] args) {

//        int random = (int) (Math.random() * 100);
//        System.out.println(random);

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int rand = random.nextInt(1, 100);
        int guessNumber;

        do {
            System.out.print("Enter your guess number => ");
            guessNumber = scanner.nextInt();
            if (guessNumber == rand){
                System.out.println("Yeessss you found it 🎁🎁🎁");
                break;
            }

            if (guessNumber < rand){
                System.out.println("oopsss you entered small amount 👇👇");
                System.out.println("try again");
            } else {
                System.out.println("oopsss you entered big amount 👆👆");
                System.out.println("try again");
            }
        } while (true);




    }
}
