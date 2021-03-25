package com.codenext.day9;

import static com.codenext.util.Utils.print;
import static com.codenext.util.Utils.println;

import java.util.Random;

public class GameOfLife {

  private final int boardSize = 10;
  private final int initPct = 50;
  private boolean[][] board;

  GameOfLife() {
    board = new boolean[boardSize][boardSize];
    printBoard();
    initializeBoard();
  }

  private void initializeBoard() {
    //initialize board with n% of life
    Random random = new Random();
    for (int i = 0; i < boardSize * boardSize * initPct / 100; i++) {
      board[random.nextInt(boardSize)][random.nextInt(boardSize)] = true;
    }
  }

  public void nextGeneration() {
    boolean[][] newBoard = new boolean[boardSize][boardSize];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        int neighbors = getNeighbors(i, j);
        newBoard[i][j] = board[i][j];
        if (board[i][j]) {
          if (neighbors < 2 || neighbors > 3) {
            newBoard[i][j] = false;
          }
        } else if (neighbors == 3) {
          newBoard[i][j] = true;
        }
      }
    }
    this.board=newBoard;
  }

  /**
   * Find number of neighbors(cell is true) around the given x, y coordination.
   */
  private int getNeighbors(int x, int y) {
    int count = 0;
    for (int i = x - 1; i <= x + 1; i++) {
      for (int j = y - 1; j <= y + 1; j++) {
        if (i == x && j == y || i < 0 || i >= boardSize || j < 0 || j >= boardSize) {
          continue;
        }
        count += board[i][j] ? 1 : 0;
      }
    }
    // println(String.format("%d,%d=%d", x, y, count));
    return count;
  }

  private void printBoard() {
    println();
    int i = 0;
    for (boolean[] row : board) {
      print(String.format("%2s:", ++i));
      for (boolean cell : row) {
        print(cell ? "*" : "  ");
      }
      println();
    }
    println();
  }

  public static void main(String[] args) throws Exception {
    GameOfLife game = new GameOfLife();
    while (true) {
      game.printBoard();
      game.nextGeneration();
      Thread.sleep(500);
    }
  }

}
