package com.dreamcloudz.factory.abstr;

import com.dreamcloudz.factory.Car;

public class DefaultFactory extends AbstractFactory {

  private AudiFactory defaultFactory = new AudiFactory();

  public Car getCar() {
    return defaultFactory.getCar();
  }

}
