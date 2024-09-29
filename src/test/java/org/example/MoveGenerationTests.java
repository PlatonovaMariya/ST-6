package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveGenerationTests {

    @Test
    void testGenerateMoves() {
        Game game = new Game();
        game.board = new char[] {'X', 'O', ' ', ' ', 'X', ' ', 'O', ' ', ' '};
        ArrayList<Integer> moveList = new ArrayList<>();
        game.generateMoves(game.board, moveList);

        assertEquals(5, moveList.size(), "There should be 5 possible moves.");
        assertTrue(moveList.contains(2), "Move at position 2 should be valid");
        assertTrue(moveList.contains(3), "Move at position 3 should be valid");
    }
}
