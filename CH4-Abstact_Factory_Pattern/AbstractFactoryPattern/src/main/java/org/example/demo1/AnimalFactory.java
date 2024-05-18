package org.example.demo1;

public abstract class AnimalFactory {
  protected abstract Tiger createTiger(String color);
  protected abstract Dog createDog(String color);
}