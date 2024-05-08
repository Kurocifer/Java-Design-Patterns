/**
 * ISP(interface segregation principle).
 * Don't declare methods in an interface, that will not be needed
 * by all classes that implement the interface.
 */
package org.isp.withisp;
public class Client {
  public static void main(String[] args) {
    System.out.println("***A demo that follows ISP.***");
    Printer printer = new BasicPrinter();
    printer.printDocument();
    printer = new AdvancedPrinter();
    printer.printDocument();
    FaxDevice faxDevice = new AdvancedPrinter();
    faxDevice.sendFax();
  }
}
