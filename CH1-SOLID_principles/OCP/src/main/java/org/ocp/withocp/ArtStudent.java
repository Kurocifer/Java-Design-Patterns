package org.ocp.withocp;

public class ArtStudent extends  Student {

  public ArtStudent(String name, String regNumber, double score, String dept) {
    super(name, regNumber, score);
    this.department = dept;
  }
}
