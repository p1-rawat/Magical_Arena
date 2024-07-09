import java.util.Random;
import java.util.Scanner;

class Player{
    int health, strength, attack;
    
    Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }
}

public class MagicalArena{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the Player 1 name: ");
        String player1 = scanner.nextLine();
        
        System.out.print("Enter the " + player1 + " health: ");
        int player1Health = scanner.nextInt();
        
        System.out.print("Enter the " + player1 + " strength: ");
        int player1Strength = scanner.nextInt();
        
        System.out.print("Enter the " + player1 + " attack: ");
        int player1Attack = scanner.nextInt();
        
        scanner.nextLine(); // Consume newline
        System.out.println();
        
        System.out.print("Enter the Player 2 name: ");
        String player2 = scanner.nextLine();
        
        System.out.print("Enter the " + player2 + " health: ");
        int player2Health = scanner.nextInt();
        
        System.out.print("Enter the " + player2 + " strength: ");
        int player2Strength = scanner.nextInt();
        
        System.out.print("Enter the " + player2 + " attack: ");
        int player2Attack = scanner.nextInt();
        
        Player A = new Player(player1Health, player1Strength, player1Attack);
        Player B = new Player(player2Health, player2Strength, player2Attack);
        
        // Determine initial turn based on lower health
        boolean turn = (A.health <= B.health);
        
        // Simulate the magical arena battle
        System.out.println();
        if (magicalArena(A, B, turn)) {
            System.out.println(player1 + " Wins!");
        } else {
            System.out.println(player2 + " Wins!");
        }
        
        scanner.close();
    }
}
