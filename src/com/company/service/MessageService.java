package com.company.service;

class MessageService {

  private static final String BEGIN_TEXT =
      "Rules:\n" + "20 matches on the table.\n" + "You take 1, 2 or 3 matches.\n"
          + "If you take last match, you lose.\n\n";

  //Start game, write rules
  static void start() {
    System.out.println(BEGIN_TEXT);
  }

  //Every turn write the remaining matches '|'
  static void nextTurn(int matches, boolean isRobotTurn) {
    for (int i = 0; i < 20; i++) {
      if (i < matches) {
        System.out.print('|');
      }
    }
    System.out.print('\n');
  }

  //Writes how many matches the robot took
  static void robotTurn(int turn) {
    System.out.printf("Robot take: %d matches\n", turn);
  }

  //Write human turn
  static void humanTurn() {
    System.out.print("You took: ");
  }

  //Write error, if user enter uncommon number
  static void error() {
    System.out.println("Incorrect value, enter 1, 2 or 3.\n");
  }

  //Write game results
  static void gameOver(boolean isRobotTurn) {
    if (isRobotTurn) {
      System.out.println("You lose!");
    } else {
      System.out.println("You win!");
    }
  }

}
