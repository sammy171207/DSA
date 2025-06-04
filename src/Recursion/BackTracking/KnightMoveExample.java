package Recursion.BackTracking;

import java.util.HashSet;
import java.util.Set;

public class KnightMoveExample {
    static final int BOARD_SIZE = 10;
    static final int[][] directions = {
            {-2, -1}, {-2, 1},
            {-1, -2}, {-1, 2},
            {1, -2}, {1, 2},
            {2, -1}, {2, 1}
    };

    public static Set<String> knightMoves(int i, int j, int N) {
        Set<String> result = new HashSet<>();
        move(i, j, N, result);
        return result;
    }

    private static void move(int x, int y, int movesLeft, Set<String> result) {
        if (movesLeft == 0) {
            result.add(x + "," + y);
            return;
        }

        for (int[] dir : directions) {
            int newX = x + dir[0];
            int newY = y + dir[1];

            if (newX >= 0 && newX < BOARD_SIZE && newY >= 0 && newY < BOARD_SIZE) {
                move(newX, newY, movesLeft - 1, result);
            }
        }
    }

    public static void main(String[] args) {
        Set<String> result = knightMoves(3, 3, 1);
        System.out.println("Knight can move to:");
        for (String pos : result) {
            System.out.println(pos);
        }
    }
}
