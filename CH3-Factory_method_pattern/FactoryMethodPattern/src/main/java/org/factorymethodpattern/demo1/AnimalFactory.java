package org.factorymethodpattern.demo1;

public abstract class AnimalFactory {
  protected abstract Animal createAnimal();
}

class DogFactory extends AnimalFactory {
  @Override
  protected Animal createAnimal() {
    return new Dog();
  }

}

class TigerFactory extends AnimalFactory {
  @Override
  protected Animal createAnimal() {
    return new Tiger();
  }
}