package org.isp.withisp;

public class AdvancedPrinter implements Printer, FaxDevice {
  @Override
  public void sendFax() {
    System.out.println("The advanced printer sends a fax.");
  }

  @Override
  public void printDocument() {
    System.out.println("The advanced printer prints a document.");
  }
}
