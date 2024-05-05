package org.srp.withsrp;

import java.util.Random;

public class EmployeeIdGenerator {
  public String generateEmpId(String empFirstName) {
    String empId;
    int random = new Random().nextInt(1000);
    empId = empFirstName.substring(0,1)+random;
    return empId;
  }
}
