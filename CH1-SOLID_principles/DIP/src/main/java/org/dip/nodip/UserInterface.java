package org.dip.nodip;

public class UserInterface {
  private OracleDatabase oracleDatabase;
  public UserInterface() {
    this.oracleDatabase = new OracleDatabase();
  }
  public void saveEmployeeId(String empId) {
    // Assuming that this is a valid data.
    // So, storing it in the database.
    oracleDatabase.saveEmpIdInDatabase(empId);
  }
}
