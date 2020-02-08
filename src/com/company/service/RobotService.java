package com.company.service;

class RobotService {

  static int robotTurn(int humanTurn) {
    MessageService.robotTurn(4 - humanTurn);
    return 4 - humanTurn;
  }
}
