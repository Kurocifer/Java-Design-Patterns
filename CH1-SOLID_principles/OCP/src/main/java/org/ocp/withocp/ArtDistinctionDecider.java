package org.ocp.withocp;

public class ArtDistinctionDecider implements  DistinctionDecider {
  @Override
  public void evaluateDistinction(Student student) {
    if (student.score > 70) {
      System.out.println(student.regNumber+" has received a distinction in arts.");
    }
  }
}
