/**
 * Dependency Inversion Principle (DIP):
 * - A high-level concrete class should not depend on a low-level
 *     concrete class. Instead, both should depend on abstractions.
 *
 * - Abstractions should not depend upon details. Instead, the details
 *     should depend upon abstractions.
 */
package org.dip.withdip;

public class Client {
  public static void main(String[] args) {
    System.out.println("***A demo that follows the DIP.***");

    // Using MySQL now
    Database database = new MySQLDatabase();
    UserInterface userInterface = new UserInterface(database);
    userInterface.saveEmployeeId("E002");

// Changing the target database
    userInterface.setDatabase(new OracleDatabase());
    userInterface.saveEmployeeId("E002");
  }
}
