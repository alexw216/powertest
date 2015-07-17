// Plays a lottery game with the user, reading
// the user's lottery numbers and printing how many
// matched a winning lottery ticket.

import java.util.*;

public class lottery {
    public static final int NUMBERS = 5;
    public static final int MEGA_NUMBERS = 1;
    public static final int MAX_NUMBER = 75;
    public static final int MAX_MEGA_NUMBER = 15;


    public static void main(String[] args) {
        // get winning number and ticket sets
        Set<Integer> winningNumbers = createWinningNumbers();
        Set<Integer> winningMegaNumbers = createWinningMegaNumbers();
        System.out.println();


        // print results
        System.out.println("The winning numbers are " +
                           winningNumbers + "The Mega is " + winningMegaNumbers);
    }

    // generates a set of the winning lotto numbers
    public static Set<Integer> createWinningNumbers() {
        Set<Integer> winningNumbers = new TreeSet<Integer>();
        Random r = new Random();
        while (winningNumbers.size() < NUMBERS) {
            int number = r.nextInt(MAX_NUMBER) + 1;
            winningNumbers.add(number);
        }
        return winningNumbers;
    }

// generates a set of the winning mega numbers
    public static Set<Integer> createWinningMegaNumbers() {
        Set<Integer> winningMegaNumbers = new TreeSet<Integer>();
        Random r = new Random();
        while (winningMegaNumbers.size() < MEGA_NUMBERS) {
            int number = r.nextInt(MAX_MEGA_NUMBER) + 1;
            winningMegaNumbers.add(number);
        }
        return winningMegaNumbers;
    }


}

