package org.lsp.withlsp;

public class RegisteredUserPayment implements NewPayment, PreviousPayment{
  String name;

  public RegisteredUserPayment(String useName) {
    this.name = useName;
  }

  @Override
  public void newPayment() {
    System.out.println("Retrieving "+ name+"'s last payment details.");
            // Some code,if any
  }

  @Override
  public void previousPaymentInfo() {
    System.out.println("Processing "+name+"'s current payment request.");
            // Some code, if any
  }
}
