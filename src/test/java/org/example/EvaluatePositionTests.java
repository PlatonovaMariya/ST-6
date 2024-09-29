package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluatePositionTests {


    @Test
    void testEvaluateDraw() {
        Game game = new Game();
        game.board = new char[] {'X', 'O', 'X', 'O', 'O', 'X', 'X', 'X', 'O'};
        int score = game.evaluatePosition(game.board, game.player1);
        assertEquals(0, score, "Game should result in a draw with a score of 0");
    }

}
