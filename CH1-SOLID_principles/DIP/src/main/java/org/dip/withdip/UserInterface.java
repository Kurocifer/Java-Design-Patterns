package org.dip.withdip;

public class UserInterface {
  Database database;

  public UserInterface(Database database) {
    this.database = database;
  }

  public void setDatabase(Database database) {
    this.database = database;
  }

  public void saveEmployeeId(String empId) {
    database.saveEmpIdInDatabase(empId);
  }
}
