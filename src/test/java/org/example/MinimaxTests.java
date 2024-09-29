package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimaxTests {

    @Test
    void testMinimaxFindsWinningMove() {
        Game game = new Game();
        game.board = new char[] {'X', 'X', ' ', 'O', 'O', ' ', ' ', ' ', ' '};
        game.player2.move = game.MiniMax(game.board, game.player2);

        assertEquals(2, game.player2.move - 1, "Minimax should find the winning move at position 2");
    }

    @Test
    void testMinimaxBlocksOpponent() {
        Game game = new Game();
        game.board = new char[] {'X', 'X', ' ', ' ', 'O', ' ', ' ', ' ', ' '};
        game.player2.move = game.MiniMax(game.board, game.player2);

        assertEquals(2, game.player2.move - 1, "Minimax should block the opponent by playing at position 2");
    }
}
