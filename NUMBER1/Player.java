//#1

import java.util.Scanner;

public class Player {
    String name;
    String team;
    int jerseyNumber;

public void readPlayer() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter player name: ");
    name = input.nextLine();
    System.out.print("Enter team name: ");
    team = input.nextLine();
    System.out.print("Enter jersey number: ");
    jerseyNumber = input.nextInt();
}
}
