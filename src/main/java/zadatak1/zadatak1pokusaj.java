package zadatak1;

import java.util.Random;
import java.util.Scanner;

//mas na pocetku 1000 din, program izvlaci crveno (R) ili crno (B),
// pita te svaki put za boju (R/B) i ulog (10, 20, 30.... minimum je 10 din),
// npr. "R 100" (100 dinara na crveno), i ako pogodis boju ulog se duplira (100 -> 200 din),
// ako ne gubis ulog... igra se zavrsava kada ostanes bez para ili izaberes "X" (Exit)
public class zadatak1pokusaj {
    public static void main(String[] args) {

        int initialStake = 1000;
        String color = "R"; // nemam trenutno ideju kako da mi izbacicuje nasumicno R ili B
        Scanner sc = new Scanner(System.in);
        String colorFromUser = "";

        while (initialStake > 0) {

            System.out.println("Input color: ");
            colorFromUser = sc.next();
            if (colorFromUser.equals("X")) {
                System.out.println("You choose to end the game. ");
                break;
            }
            System.out.println("Input stake: ");
            int stakeFromUser = sc.nextInt();

            if (colorFromUser.equals(color) && stakeFromUser >= 10) {

                initialStake = initialStake + (stakeFromUser * 2);
                System.out.println("Good luck! " + initialStake);

            } else {
                initialStake = initialStake - stakeFromUser;
                System.out.println("Bad luck! " + initialStake);
            }
        }


    }

}