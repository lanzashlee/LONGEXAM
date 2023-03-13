//#1.5 Run

public class ComparePlayers extends Player {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        System.out.println("Player 1: ");
        player1.readPlayer();
        System.out.println("Player 2: ");
        player2.readPlayer();
        if (equals(player1, player2)) {
            System.out.println("They are the same player.");
        } else {
            System.out.println("They are different players.");
        }
    }
    public static boolean equals(Player p1, Player p2) {
    return p1.team.equals(p2.team) && p1.jerseyNumber == p2.jerseyNumber;
       
   }
   }
