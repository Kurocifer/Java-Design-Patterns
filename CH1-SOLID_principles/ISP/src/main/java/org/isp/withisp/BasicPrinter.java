package org.isp.withisp;

import java.nio.channels.Pipe;

public class BasicPrinter implements Printer {
  @Override
  public void printDocument() {
    System.out.println("The basic printer prints a document");
  }
}
