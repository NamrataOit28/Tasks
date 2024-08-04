import java.util.Scanner;

class CricketPlayer {
    int playerCode;
    String name;
    int runs;
    int inningsPlayed;
    int notOut;
    double average;

    // Constructor
    CricketPlayer(int playerCode, String name, int runs, int inningsPlayed, int notOut) {
        this.playerCode = playerCode;
        this.name = name;
        this.runs = runs;
        this.inningsPlayed = inningsPlayed;
        this.notOut = notOut;
        calculateAverage();
    }

    //  calculate average
    void calculateAverage() {
        if (inningsPlayed == 0) {
            average = 0;
        } else {
            average = (double) runs / (inningsPlayed - notOut);
        }
    }

    // display player details
    void displayPlayer() {
        System.out.println("Player Code: " + playerCode);
        System.out.println("Name: " + name);
        System.out.println("Runs: " + runs);
        System.out.println("Innings Played: " + inningsPlayed);
        System.out.println("Not Out: " + notOut);
        System.out.println("Average: " + average);
    }
}

public class Players{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int n = scanner.nextInt();

        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of player " + (i + 1));
            System.out.print("Player Code: ");
            int playerCode = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Runs: ");
            int runs = scanner.nextInt();
            System.out.print("Innings Played: ");
            int inningsPlayed = scanner.nextInt();
            System.out.print("Not Out: ");
            int notOut = scanner.nextInt();

            players[i] = new CricketPlayer(playerCode, name, runs, inningsPlayed, notOut);
        }

        System.out.println("Player Details:");
        for (CricketPlayer player : players) {
            player.displayPlayer();
            System.out.println();
        }
    }
}