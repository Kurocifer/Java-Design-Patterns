package org.dip.nodip;

public class Client {
  public static void main(String[] args) {
    System.out.println("***A demo without DIP.***");
    UserInterface userInterface = new UserInterface();
    userInterface.saveEmployeeId("E001");
  }
}
