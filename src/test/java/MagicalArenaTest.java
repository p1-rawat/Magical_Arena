import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MagicalArenaTest {
    
    @Test
    public void testPlayerAWins() {
        Player A = new Player(100, 10, 5);
        Player B = new Player(49, 10, 5);
        boolean turn = (A.health <= B.health);
        
        assertTrue(MagicalArena.magicalArena(A, B, turn));
    }
    
    @Test
    public void testPlayerBWins() {
        Player A = new Player(20, 4, 2);
        Player B = new Player(49, 10, 5);
        boolean turn = (A.health <= B.health);
        
        assertFalse(MagicalArena.magicalArena(A, B, turn));
    }
    
    @Test
    public void testEqualHealthPlayers() {
        Player A = new Player(50, 10, 5);
        Player B = new Player(50, 10, 5);
        boolean turn = (A.health <= B.health);
        
        // Run multiple simulations to check the randomness
        int winsA = 0, winsB = 0;
        for (int i = 0; i < 100; i++) {
            Player testA = new Player(50, 10, 5);
            Player testB = new Player(50, 10, 5);
            if (MagicalArena.magicalArena(testA, testB, turn)) {
                winsA++;
            } else {
                winsB++;
            }
        }
        assertTrue(winsA > 0 && winsB > 0);
    }
}
