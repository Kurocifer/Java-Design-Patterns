package org.example.demo1;

public class PetAnimalFactory extends AnimalFactory {
  public PetAnimalFactory() {
    System.out.println("You opt for a pet animal factory.\n");
  }
  @Override
  public Tiger createTiger(String color) {
    return new PetTiger(color);
  }
  @Override
  public Dog createDog(String color) {
    return new PetDog(color);
  }
}

class PetTiger implements Tiger {
  public PetTiger(String color) {
    System.out.println("A pet tiger with " + color + " color is created.");
  }
  public void aboutMe() {
    System.out.println("The " + this + " says: Halum. I play in an animal circus.");
  }
  public void inviteDog(Dog dog) {
    System.out.println("The " + this + " says: I saw a " + dog + " in my town.");
  }

  @Override
  public String toString() {
    return "pet tiger";
  }
}

class PetDog implements Dog {
  public PetDog(String color) {
    System.out.println("A pet dog with " + color + " color is created.");
  }
  @Override
  public void displayMe() {
    System.out.println("The " + this + " says: Bow-Wow. I prefer to stay at home.");
  }
  @Override
  public String toString() {
    return "pet dog";
  }
}