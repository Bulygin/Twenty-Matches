package com.company.service;

import java.util.Scanner;

public class GameService {

  private boolean isRobotTurn;
  private int humanTurn;
  private int matches;
  private Scanner scanner;

  public GameService() {
    isRobotTurn = true;
    humanTurn = 1;
    matches = 20;
    scanner = new Scanner(System.in);
  }

  public void startGame() {
    MessageService.start();
    while (matches > 0) {
      MessageService.nextTurn(matches, isRobotTurn);
      if (isRobotTurn) {
        matches -= RobotService.robotTurn(humanTurn);
        isRobotTurn = !isRobotTurn;
      } else {
        MessageService.humanTurn();
        try {
          humanTurn = scanner.nextInt();
          if (humanTurn == 1 || humanTurn == 2 || humanTurn == 3) {
            matches -= humanTurn;
            isRobotTurn = !isRobotTurn;
          } else {
            throw new Exception();
          }
        } catch (Exception e) {
          MessageService.error();
        }
      }
    }
    MessageService.gameOver(isRobotTurn);
  }
}
