package org.factorymethodpattern.demo2;

public abstract class AnimalFactory {
  public void createAndDisplayAnimal(String color) {
    Animal animal;
    animal = createAnimal(color);
    animal.displayBehavior();
  }

  protected abstract Animal createAnimal(String color);
}

class DogFactory extends AnimalFactory {
  @Override
  protected Animal createAnimal(String color) {
    return new Dog(color);
  }
}

class TigerFactory extends AnimalFactory {
  // Creating and returning a 'Tiger' instance
  @Override
  protected Animal createAnimal(String color) {
    return new Tiger(color);
  }
}
