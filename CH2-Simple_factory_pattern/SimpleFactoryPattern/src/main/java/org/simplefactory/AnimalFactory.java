package org.simplefactory;

import javax.swing.plaf.PanelUI;

public class AnimalFactory {
  public enum Type {DOG, TIGER};
  public Animal createAnimal(Type animalType) {
    Animal animal;
    if(animalType.equals(Type.DOG))
      animal = new Dog();
    else if(animalType.equals(Type.TIGER))
      animal = new Tiger();
    else {
      System.out.println("You can create either a 'dog' or a 'tiger'. ");
      throw new IllegalArgumentException("Unknown animal cannot be instantiated.");
    }

    return animal;
  }
}
